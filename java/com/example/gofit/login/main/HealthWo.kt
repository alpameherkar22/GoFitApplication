package com.example.gofit.login.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.gofit.R

class HealthWo : AppCompatActivity() {
    lateinit var que:TextView
    lateinit var backbtn: Button
    lateinit var  contact:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health_wo)

        que=findViewById(R.id.que)
        que.setOnClickListener {

                val Act = Intent(this@HealthWo, Ques::class.java)
                startActivity(Act)
                this.finish()
            }
        backbtn = findViewById(R.id.back)
        backbtn.setOnClickListener {

                val startAct = Intent(this@HealthWo, MainActivity::class.java)
                startActivity(startAct)
                this.finish()

    }
        contact=findViewById(R.id.next)
        contact.setOnClickListener {

            val startAct = Intent(this@HealthWo, Contact::class.java)
            startActivity(startAct)
            this.finish()


        }
}}
