package com.experlabs.footballnews.fcm.services

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.NotificationManager.IMPORTANCE_HIGH
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_MUTABLE
import android.app.PendingIntent.FLAG_ONE_SHOT
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.core.content.ContextCompat
import com.experlabs.footballnews.application.MainActivity
import com.experlabs.footballnews.R
import com.experlabs.footballnews.fcm.RetrofitInstance
import com.experlabs.footballnews.fcm.models.NotificationData
import com.experlabs.footballnews.fcm.models.PushNotification
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirebaseMessagingService(private val database: FirebaseDatabase) :
    FirebaseMessagingService() {
    private lateinit var builder: Notification.Builder
    private val channel = "Football-Notifications"
    private val description = "footballNotifications"
    lateinit var intent: Intent
    val db = database


    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
        addTokenToFirestore(p0)
    }

    fun addTokenToFirestore(newRegistrationToken: String?) {
        if (newRegistrationToken == null) throw NullPointerException("FCM token is null.")

        database.getReference("users").let { db ->
            db.child("$newRegistrationToken")
                .get().addOnSuccessListener {
                    if (!it.exists()) {
                        db.child(newRegistrationToken).setValue(newRegistrationToken)
                    }
                }
        }
    }

    fun sendNotification(news: String) {
        database.getReference("users").get().addOnSuccessListener {
            it.children.forEach { token ->
                postNotification(token.key.toString(), news)
            }
        }
    }

    private fun postNotification(token: String, news: String) =
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = RetrofitInstance.api.postNotification(
                    PushNotification(NotificationData(news, "Football News"), token)
                )

                response.enqueue(object : Callback<ResponseBody?> {
                    override fun onResponse(
                        call: Call<ResponseBody?>?,
                        response: Response<ResponseBody?>?
                    ) {
                        Log.d("Notification Success", "Response: ${Gson().toJson(response)}")
                    }

                    override fun onFailure(call: Call<ResponseBody?>?, t: Throwable?) {
                        Log.e("Notification Failed", t.toString())
                    }
                })
            } catch (e: Exception) {
                Log.e("Notification Exception", e.toString())
            }
        }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        sendNotification(
            message.data["body"] ?: "Body",
            message.data["title"] ?: "Title",
        )
    }

    fun sendNotification(body: String, title: String) {

        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val notificationChannel = NotificationChannel(channel, description, IMPORTANCE_HIGH)
        notificationChannel.enableLights(true)
        notificationChannel.lightColor = R.color.primary_blue
        notificationChannel.enableVibration(true)
        notificationManager.createNotificationChannel(notificationChannel)

        intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val pendingIntent = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.getActivity(this, 0, intent, FLAG_MUTABLE)
        } else {
            PendingIntent.getActivity(this, 0, intent, FLAG_ONE_SHOT)
        }

        builder = Notification.Builder(this, channel)
            .setSmallIcon(R.drawable.football)
            .setContentText(body)
            .setContentTitle(title)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .setColor(ContextCompat.getColor(this, R.color.primary_blue))
            .setColorized(true)


        notificationManager.notify(1234, builder.build())
    }
}