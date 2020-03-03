package com.example.gofit.login.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.gofit.R

class HomeWorkout : AppCompatActivity() {
    lateinit var backbtn: Button
    lateinit var  contact:Button
    lateinit var abs:TextView
    lateinit var legs:TextView
    lateinit var arm: TextView
    lateinit var fullBody: TextView
    lateinit var stretches: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_workout)

        abs=findViewById(R.id.t1)
        abs.setOnClickListener {
            val startAct=Intent(this@HomeWorkout,Abs::class.java)
            startActivity(startAct)
            this.finish()
        }
        legs=findViewById(R.id.t2)
        legs.setOnClickListener {
            val startAct=Intent(this@HomeWorkout,Legs::class.java)
            startActivity(startAct)
            this.finish()
        }
        arm=findViewById(R.id.t3)
        arm.setOnClickListener {
            val startAct=Intent(this@HomeWorkout,Arm::class.java)
            startActivity(startAct)
            this.finish()
        }
        fullBody=findViewById(R.id.t4)
        fullBody.setOnClickListener {
            val startAct=Intent(this@HomeWorkout,FullBody::class.java)
            startActivity(startAct)
            this.finish()
        }
        stretches=findViewById(R.id.t5)
        stretches.setOnClickListener {
            val startAct=Intent(this@HomeWorkout,Stretches::class.java)
            startActivity(startAct)
            this.finish()
        }

        backbtn = findViewById(R.id.back)
        backbtn.setOnClickListener {

            val startAct = Intent(this@HomeWorkout, MainActivity::class.java)
            startActivity(startAct)
            this.finish()

        }
        contact=findViewById(R.id.next)
        contact.setOnClickListener {

            val startAct = Intent(this@HomeWorkout, Contact::class.java)
            startActivity(startAct)
            this.finish()


        }

    }
}
