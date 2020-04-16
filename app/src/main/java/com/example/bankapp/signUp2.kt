package com.example.bankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_sign_up2.*

class signUp2 : AppCompatActivity() {

    lateinit var signUpUserName: EditText
    lateinit var  signUpHeading: TextView
    lateinit var  signUpPassword: EditText
    lateinit var  signUpPasswordAgain: EditText
    lateinit var rememberMe: Switch
    lateinit var signUpButton: Button
    lateinit var signUpLogButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sign_up2)
        title="Sign Up"
        signUpUserName=findViewById(R.id.signUsername)
        signUpHeading=findViewById(R.id.signtxtheader)
        signUpPassword=findViewById(R.id.signPassword)
        signUpPasswordAgain=findViewById(R.id.signPasswordagain)
        rememberMe=findViewById(R.id.switchsignup)
        signUpButton=findViewById(R.id.SignUpButton)
        signUpLogButton=findViewById(R.id.signLogInBUtton)



        signUpButton.setOnClickListener {
            var usrname=signUsername.text.toString().length
            if (signUsername.text.toString().isEmpty())
            { Toast.makeText(this,"Enter Username", Toast.LENGTH_SHORT).show()
            }

            else if(signPassword.text.toString().isEmpty())
            { Toast.makeText(this,"Enter Password", Toast.LENGTH_SHORT).show()
            }
            else if(signPassword.text.toString()!= signPasswordagain.text.toString())
            { Toast.makeText(this,"Passwords don't match", Toast.LENGTH_SHORT).show()
            }


            else

            {  Toast.makeText(this,"Sign Up successful", Toast.LENGTH_SHORT).show()


                startActivity(Intent(this, login::class.java))}
        }
        signUpLogButton.setOnClickListener({
            startActivity(Intent(this,login::class.java))

        })

    }



    override fun onPause() {
        super.onPause()
        finish()
    }
}
