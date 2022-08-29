package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class LoginMainActivity : AppCompatActivity() {
    val Email: String = "maya"
    val password: String = "eman"

    lateinit var edt_email: EditText
    lateinit var edt_password: EditText
    lateinit var btn_login: Button
    lateinit var btn_signup: Button
    lateinit var btn_image: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edt_email = findViewById(R.id.edt_email)
        edt_password = findViewById(R.id.edt_password)
        btn_login = findViewById(R.id.btn_login)
        btn_signup = findViewById(R.id.btn_signup)
        btn_image=findViewById(R.id.btn_image)

        btn_signup.setOnClickListener {
            if (edt_email.text.toString().isNullOrEmpty() && edt_password.text.toString()
                    .isNullOrEmpty()
            ) {
                if (edt_email.text.toString().equals(Email) && edt_password.text.toString()
                        .equals(password)
                )
                    Toast.makeText(this, "Your Sign up is done", Toast.LENGTH_SHORT).show()
                var intent: Intent = Intent(this, signupMainActivity::class.java)
                intent.putExtra("Email", edt_email.text.toString())
                startActivity(intent)

            }

        }

        btn_login.setOnClickListener {
            if (!edt_email.text.toString().isNullOrEmpty() && !edt_password.text.toString()
                    .isNullOrEmpty()
            ) {
                if (edt_email.text.toString().equals(Email) && edt_password.text.toString()
                        .equals(password)
                )
                    Toast.makeText(this, "Your Login is done", Toast.LENGTH_SHORT).show()
                var intent: Intent = Intent(this, mainpageMainActivity::class.java)
                intent.putExtra("Email", edt_email.text.toString())
                startActivity(intent)

            }

        }

    }
}