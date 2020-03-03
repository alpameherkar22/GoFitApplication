package com.example.gofit.login.main

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.example.gofit.R
import com.example.gofit.absvideos.*

class Abs : AppCompatActivity() {
    lateinit var backbtn: Button
    lateinit var contact:Button
    lateinit var legs:TextView
    lateinit var arm: TextView
    lateinit var fullBody: TextView
    lateinit var stretches: TextView
    lateinit var t1:ImageButton
    lateinit var t2:ImageButton
    lateinit var t3:ImageButton
    lateinit var t4:ImageButton
    lateinit var t5:ImageButton
    lateinit var t6:ImageButton
    lateinit var t7:ImageButton
    lateinit var t8:ImageButton
    lateinit var t9:ImageButton
    lateinit var t10:ImageButton
    lateinit var t11:ImageButton
    lateinit var t12:ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abs)

        t1=findViewById(R.id.t1)
        t1.setOnClickListener {

            val startAct = Intent(this@Abs, Vid1::class.java)
            startActivity(startAct)
            this.finish()
        }

        t2=findViewById(R.id.t2)
        t2.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=AnYl6Nk9GOA"))
            startActivity(startAct)
            this.finish()
        }
        t3=findViewById(R.id.t3)
        t3.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=KZCijP3rjvk&amp;t=131s"))
            startActivity(startAct)
            this.finish()
        }

        t4=findViewById(R.id.t4)
        t4.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=yENYdGnxmhg&amp;t=483s"))
            startActivity(startAct)
            this.finish()
        }

        t5=findViewById(R.id.t5)
        t5.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=Z7u_sdYNS_k&amp;t=538s"))
            startActivity(startAct)
            this.finish()
        }

        t6=findViewById(R.id.t6)
        t6.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=PNMycpSbQEI"))
            startActivity(startAct)
            this.finish()
        }

        t7=findViewById(R.id.t7)
        t7.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=CI3o5FYbtOo"))
            startActivity(startAct)
            this.finish()
        }

        t8=findViewById(R.id.t8)
        t8.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=SHRHCJcYtvs"))
            startActivity(startAct)
            this.finish()
        }

        t9=findViewById(R.id.t9)
        t9.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=_qNmbXRZtfY"))
            startActivity(startAct)
            this.finish()
        }

        t10=findViewById(R.id.t10)
        t10.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=LLGMLpdS8-o"))
            startActivity(startAct)
            this.finish()
        }

        t11=findViewById(R.id.t11)
        t11.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=Q-vuR4PJh2c&amp;t=345s"))
            startActivity(startAct)
            this.finish()
        }

        t12=findViewById(R.id.t12)
        t12.setOnClickListener {

            val startAct = Intent(Intent.ACTION_VIEW)
            startAct.setData(Uri.parse("https://www.youtube.com/watch?v=IlPFzRSZrSU&amp;t=25s"))
            startActivity(startAct)
            this.finish()
        }

        backbtn = findViewById(R.id.back)
        backbtn.setOnClickListener {

            val startAct = Intent(this@Abs, HomeWorkout::class.java)
            startActivity(startAct)
            this.finish()


        }
        contact=findViewById(R.id.next)
        contact.setOnClickListener {

            val startAct = Intent(this@Abs, Contact::class.java)
            startActivity(startAct)
            this.finish()


        }
        legs=findViewById(R.id.leg)
        legs.setOnClickListener {
            val startAct=Intent(this@Abs,Legs::class.java)
            startActivity(startAct)
            this.finish()
        }
        arm=findViewById(R.id.arm)
        arm.setOnClickListener {
            val startAct=Intent(this@Abs,Arm::class.java)
            startActivity(startAct)
            this.finish()
        }
        fullBody=findViewById(R.id.full)
        fullBody.setOnClickListener {
            val startAct=Intent(this@Abs,FullBody::class.java)
            startActivity(startAct)
            this.finish()
        }
        stretches=findViewById(R.id.stre)
        stretches.setOnClickListener {
            val startAct=Intent(this@Abs,Stretches::class.java)
            startActivity(startAct)
            this.finish()
        }
    }
}
