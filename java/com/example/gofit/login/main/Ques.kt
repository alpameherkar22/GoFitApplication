package com.example.gofit.login.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.gofit.R

class Ques : AppCompatActivity() {
    lateinit var backbtn: Button
    lateinit var  contact:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ques)
        backbtn = findViewById(R.id.back)
        backbtn.setOnClickListener {

                val startAct = Intent(this@Ques, HealthWo::class.java)
                startActivity(startAct)
                this.finish()


        }
        contact=findViewById(R.id.next)
        contact.setOnClickListener {

            val startAct = Intent(this@Ques, Contact::class.java)
            startActivity(startAct)
            this.finish()


        }
    }
}
