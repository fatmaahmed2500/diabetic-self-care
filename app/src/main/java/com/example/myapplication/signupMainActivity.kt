package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class signupMainActivity : AppCompatActivity() {
    val name2:String="maya"
    val address2:String="eman"
    val email :String="yaser"
    val password2:String="ashraf"

    lateinit var edt_name: EditText
    lateinit var edt_address:EditText
    lateinit var edt_mail:EditText
    lateinit var edt_pass:EditText
    lateinit var btn_sign_up: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_main)

        if(intent!=null){
            val email=intent.extras!!.get("email")
        }
        edt_name=findViewById(R.id.edt_name)
        edt_address=findViewById(R.id.edt_address)
        edt_mail=findViewById(R.id.edt_mail)
        edt_pass=findViewById(R.id.edt_pass)
        btn_sign_up=findViewById(R.id.btn_sign_up)


        btn_sign_up.setOnClickListener {

            if(!edt_name.text.toString().isNullOrEmpty()&&!edt_address.text.toString().isNullOrEmpty()&&!edt_mail.text.toString().isNullOrEmpty()&&!edt_pass.text.toString().isNullOrEmpty()){
                if(edt_name.text.toString().equals(name2)&&edt_address.text.toString().equals(address2)&&edt_mail.text.toString().equals(email)&&edt_pass.text.toString().equals(password2))
                    Toast.makeText(this, "Your Sign Up is successful", Toast.LENGTH_SHORT).show()
                var intent:Intent= Intent(this,mainpageMainActivity::class.java)
                intent.putExtra("Your name is",edt_name.text.toString())
                startActivity(intent)
            }




        }

    }
}