package com.example.gofit.login.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import com.example.gofit.R

class Contact : AppCompatActivity() {
    lateinit var backbtn: Button
    var t1: TextView?=null
    var t2: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        backbtn = findViewById(R.id.backbtn)
        backbtn.setOnClickListener {

            val startAct = Intent(this@Contact, MainActivity::class.java)
            startActivity(startAct)
            this.finish()


        }
        t1=findViewById(R.id.t1)
        t1?.setMovementMethod(LinkMovementMethod.getInstance())

        t2=findViewById(R.id.t2)
        t2?.setMovementMethod(LinkMovementMethod.getInstance())
    }

}
