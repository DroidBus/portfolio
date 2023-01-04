package com.shweta.portfolioapplication.view

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.shweta.portfolioapplication.MainActivity
import com.shweta.portfolioapplication.R
import java.lang.Exception

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // on below line we are
            // creating a new intent
            val i = Intent(
                this@SplashActivity,
                ProfileActivity::class.java
            )
            // on below line we are
            // starting a new activity.
            startActivity(i)

            // on the below line we are finishing
            // our current activity.
            finish()
        }, 3000)


    }
}