package com.example.bankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashScreen2 : AppCompatActivity() {
    var wait=2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)
        Handler().postDelayed({var intent: Intent = Intent(this, signUp2::class.java)
            startActivity(intent)}, wait.toLong())


    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}


