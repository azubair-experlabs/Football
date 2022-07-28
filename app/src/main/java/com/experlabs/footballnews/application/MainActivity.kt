package com.experlabs.footballnews.application

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.doOnEnd
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.experlabs.footballnews.R
import com.experlabs.footballnews.databinding.ActivityMainBinding
import com.experlabs.footballnews.portal.ui.PortalActivity


class MainActivity : AppCompatActivity() {

    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S)
            exitAnimate()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        actionBarDrawerToggle = ActionBarDrawerToggle(this, binding.myDrawerLayout,
            R.string.nav_open,
            R.string.nav_close
        )

        binding.myDrawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()


        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        binding.drawerNav.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.drawer_portal -> {
                    val intent = Intent(this@MainActivity, PortalActivity::class.java)
                    startActivity(intent)
                }
                R.id.drawer_about -> {
                    Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_news,
                R.id.navigation_gallery,
                R.id.navigation_teams,
                R.id.navigation_players,
                R.id.navigation_weather
            )
        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
    }


    @RequiresApi(Build.VERSION_CODES.S)
    private fun exitAnimate() {
        splashScreen.setOnExitAnimationListener { splashScreenView ->
            val slideBack = ObjectAnimator.ofFloat(
                splashScreenView,
                View.TRANSLATION_Y,
                0f,
                -splashScreenView.width.toFloat()
            ).apply {
                interpolator = DecelerateInterpolator()
                duration = 400L
                doOnEnd { splashScreenView.remove() }
            }

            slideBack.start()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }
}