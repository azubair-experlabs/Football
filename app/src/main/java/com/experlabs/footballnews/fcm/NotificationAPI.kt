package com.experlabs.footballnews.fcm
import com.experlabs.footballnews.fcm.Constants.CONTENT_TYPE
import com.experlabs.footballnews.fcm.Constants.SERVER_KEY
import com.experlabs.footballnews.fcm.models.PushNotification
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotificationAPI {

    @Headers("Authorization: key=$SERVER_KEY", "Content-Type:$CONTENT_TYPE")
    @POST("fcm/send")
    suspend fun postNotification(
        @Body notification: PushNotification): Call<ResponseBody>
}