package com.example.gofit.login.main

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.example.gofit.R

class Stretches : AppCompatActivity() {
    lateinit var backbtn: Button
    lateinit var  contact:Button
    lateinit var abs:TextView
    lateinit var legs:TextView
    lateinit var arm: TextView
    lateinit var fullBody: TextView
    lateinit var t1: ImageButton
    lateinit var t2: ImageButton
    lateinit var t3: ImageButton
    lateinit var t4: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stretches)
        t1=findViewById(R.id.t1)
        t1.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=aaotOZaHPLo"))
            startActivity(startAct)
            this.finish()
        }

        t2=findViewById(R.id.t2)
        t2.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=wUXpigOkBfY"))
            startActivity(startAct)
            this.finish()
        }
        t3=findViewById(R.id.t3)
        t3.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=QfAY5JsB7qY"))
            startActivity(startAct)
            this.finish()
        }

        t4=findViewById(R.id.t4)
        t4.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=5v1wqxnrmrk&amp;t=27s"))
            startActivity(startAct)
            this.finish()
        }


        backbtn = findViewById(R.id.back)
        backbtn.setOnClickListener {

            val startAct = Intent(this@Stretches, HomeWorkout::class.java)
            startActivity(startAct)
            this.finish()


        }
        contact=findViewById(R.id.next)
        contact.setOnClickListener {

            val startAct = Intent(this@Stretches, Contact::class.java)
            startActivity(startAct)
            this.finish()


        }
        abs = findViewById(R.id.flat)
        abs.setOnClickListener {
            val startAct = Intent(this@Stretches, Abs::class.java)
            startActivity(startAct)
            this.finish()
        }
        legs=findViewById(R.id.leg)
        legs.setOnClickListener {
            val startAct=Intent(this@Stretches,Legs::class.java)
            startActivity(startAct)
            this.finish()
        }
        arm=findViewById(R.id.arm)
        arm.setOnClickListener {
            val startAct=Intent(this@Stretches,Arm::class.java)
            startActivity(startAct)
            this.finish()
        }
        fullBody=findViewById(R.id.full)
        fullBody.setOnClickListener {
            val startAct=Intent(this@Stretches,FullBody::class.java)
            startActivity(startAct)
            this.finish()
        }
    }
}
