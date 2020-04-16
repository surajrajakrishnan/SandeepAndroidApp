package com.example.bankapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class login : AppCompatActivity() {
    lateinit var btn: TextView
    lateinit var button:Button


    override fun onCreate(savedInstanceState: Bundle?)


    {
        super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_login2)




        title="Log In"
        btn=findViewById(R.id.gotoSignUp)
        button=findViewById(R.id.login)

        button.setOnClickListener({
            Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT)
            startActivity(Intent(this,userDetails2::class.java))
        })

        btn.setOnClickListener {
            var intent: Intent = Intent(this, signUp2::class.java)
            startActivity(intent)
        }
    }
    override fun onPause() {
        super.onPause()
        finish()
    }
}
