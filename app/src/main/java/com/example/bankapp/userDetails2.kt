package com.example.bankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class userDetails2 : AppCompatActivity() {lateinit var logoutBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details2)
        logoutBtn=findViewById(R.id.logOutBtn)
        logoutBtn.setOnClickListener({
            Toast.makeText(this,"Log Out Successful", Toast.LENGTH_SHORT)
            startActivity(Intent(this, login::class.java))
        })


    }



}
