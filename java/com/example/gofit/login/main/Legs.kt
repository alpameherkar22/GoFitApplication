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
import com.example.gofit.absvideos.Vid1

class Legs : AppCompatActivity() {
    lateinit var backbtn: Button
    lateinit var  contact:Button
    lateinit var abs:TextView
    lateinit var arm: TextView
    lateinit var fullBody: TextView
    lateinit var stretches: TextView
    lateinit var t1: ImageButton
    lateinit var t2: ImageButton
    lateinit var t3: ImageButton
    lateinit var t4: ImageButton
    lateinit var t5: ImageButton
    lateinit var t6: ImageButton
    lateinit var t7: ImageButton
    lateinit var t8: ImageButton
    lateinit var t9: ImageButton
    lateinit var t10: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legs)
        t1=findViewById(R.id.t1)
        t1.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=Ldeq9CPsPSo"))
            startActivity(startAct)
            this.finish()
        }

        t2=findViewById(R.id.t2)
        t2.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=HeolReSa5ic&amp;t=644s"))
            startActivity(startAct)
            this.finish()
        }
        t3=findViewById(R.id.t3)
        t3.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=RqfkrZA_ie0"))
            startActivity(startAct)
            this.finish()
        }

        t4=findViewById(R.id.t4)
        t4.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=wELrn0f53XI"))
            startActivity(startAct)
            this.finish()
        }

        t5=findViewById(R.id.t5)
        t5.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=xGxbB72qBig"))
            startActivity(startAct)
            this.finish()
        }

        t6=findViewById(R.id.t6)
        t6.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=hJ7-9CJuMD8"))
            startActivity(startAct)
            this.finish()
        }

        t7=findViewById(R.id.t7)
        t7.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=3eFn13DPhS4&amp;t=541s"))
            startActivity(startAct)
            this.finish()
        }

        t8=findViewById(R.id.t8)
        t8.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=VUEHtQkoBKQ"))
            startActivity(startAct)
            this.finish()
        }

        t9=findViewById(R.id.t9)
        t9.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=e-dAMyZ0S5w"))
            startActivity(startAct)
            this.finish()
        }

        t10=findViewById(R.id.t10)
        t10.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=N3NLqJLbsgo"))
            startActivity(startAct)
            this.finish()
        }

        backbtn = findViewById(R.id.back)
        backbtn.setOnClickListener {

            val startAct = Intent(this@Legs, HomeWorkout::class.java)
            startActivity(startAct)
            this.finish()


        }
        contact=findViewById(R.id.next)
        contact.setOnClickListener {

            val startAct = Intent(this@Legs, Contact::class.java)
            startActivity(startAct)
            this.finish()


        }
        abs = findViewById(R.id.flat)
        abs.setOnClickListener {
            val startAct = Intent(this@Legs, Abs::class.java)
            startActivity(startAct)
            this.finish()
        }
        arm=findViewById(R.id.arm)
        arm.setOnClickListener {
            val startAct=Intent(this@Legs,Arm::class.java)
            startActivity(startAct)
            this.finish()
        }
        fullBody=findViewById(R.id.full)
        fullBody.setOnClickListener {
            val startAct=Intent(this@Legs,FullBody::class.java)
            startActivity(startAct)
            this.finish()
        }
        stretches = findViewById(R.id.stre)
        stretches.setOnClickListener {
            val startAct = Intent(this@Legs, Stretches::class.java)
            startActivity(startAct)
            this.finish()
        }
    }
}
