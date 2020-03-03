package com.example.gofit.login.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.gofit.R
import com.example.gofit.login.main.products.*

class Buypro : AppCompatActivity() {
    lateinit var backbtn: Button
    lateinit var  contact:Button
    lateinit var p1:ImageView
    lateinit var p2:ImageView
    lateinit var p3:ImageView
    lateinit var p4:ImageView
    lateinit var p5:ImageView
    lateinit var p6:ImageView
    lateinit var p7:ImageView
    lateinit var p8:ImageView
    lateinit var p9:ImageView
    lateinit var p10:ImageView
    lateinit var p11:ImageView
    lateinit var p12:ImageView
    lateinit var p13:ImageView
    lateinit var p14:ImageView
    lateinit var p15:ImageView
    lateinit var p16:ImageView
    lateinit var p17:ImageView
    lateinit var p18:ImageView
    lateinit var p19:ImageView
    lateinit var p20:ImageView
    lateinit var p21:ImageView
    lateinit var p22:ImageView
    lateinit var p23:ImageView
    lateinit var p24:ImageView
    lateinit var p25:ImageView
    lateinit var p26:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buypro)

        backbtn = findViewById(R.id.back)
        backbtn.setOnClickListener {

            val startAct = Intent(this@Buypro, MainActivity::class.java)
            startActivity(startAct)
            this.finish()


        }
        contact=findViewById(R.id.next)
        contact.setOnClickListener {

            val startAct = Intent(this@Buypro, Contact::class.java)
            startActivity(startAct)
            this.finish()


        }
        p1=findViewById(R.id.p1)
        p1.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro1::class.java)
            startActivity(startAct)
            this.finish()
        })
        p2=findViewById(R.id.p2)
        p2.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro2::class.java)
            startActivity(startAct)
            this.finish()
        })
        p3=findViewById(R.id.p3)
        p3.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro3::class.java)
            startActivity(startAct)
            this.finish()
        })
        p4=findViewById(R.id.p4)
        p4.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro4::class.java)
            startActivity(startAct)
            this.finish()
        })
        p5=findViewById(R.id.p5)
        p5.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro5::class.java)
            startActivity(startAct)
            this.finish()
        })
        p6=findViewById(R.id.p6)
        p6.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro6::class.java)
            startActivity(startAct)
            this.finish()
        })
        p7=findViewById(R.id.p7)
        p7.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro7::class.java)
            startActivity(startAct)
            this.finish()
        })
        p8=findViewById(R.id.p8)
        p8.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro8::class.java)
            startActivity(startAct)
            this.finish()
        })
        p9=findViewById(R.id.p9)
        p9.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro9::class.java)
            startActivity(startAct)
            this.finish()
        })
        p10=findViewById(R.id.p10)
        p10.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro10::class.java)
            startActivity(startAct)
            this.finish()
        })
        p11=findViewById(R.id.p11)
        p11.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro11::class.java)
            startActivity(startAct)
            this.finish()
        })
        p12=findViewById(R.id.p12)
        p12.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro12::class.java)
            startActivity(startAct)
            this.finish()
        })
        p13=findViewById(R.id.p13)
        p13.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro13::class.java)
            startActivity(startAct)
            this.finish()
        })
        p14=findViewById(R.id.p14)
        p14.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro14::class.java)
            startActivity(startAct)
            this.finish()
        })
        p15=findViewById(R.id.p15)
        p15.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro15::class.java)
            startActivity(startAct)
            this.finish()
        })
        p16=findViewById(R.id.p16)
        p16.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro16::class.java)
            startActivity(startAct)
            this.finish()
        })
        p17=findViewById(R.id.p17)
        p17.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro17::class.java)
            startActivity(startAct)
            this.finish()
        })
        p18=findViewById(R.id.p18)
        p18.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro18::class.java)
            startActivity(startAct)
            this.finish()
        })
        p19=findViewById(R.id.p19)
        p19.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro19::class.java)
            startActivity(startAct)
            this.finish()
        })
        p20=findViewById(R.id.p20)
        p20.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro20::class.java)
            startActivity(startAct)
            this.finish()
        })
        p21=findViewById(R.id.p21)
        p21.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro21::class.java)
            startActivity(startAct)
            this.finish()
        })
        p22=findViewById(R.id.p22)
        p22.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro22::class.java)
            startActivity(startAct)
            this.finish()
        })
        p23=findViewById(R.id.p23)
        p23.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro23::class.java)
            startActivity(startAct)
            this.finish()
        })
        p24=findViewById(R.id.p24)
        p24.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro24::class.java)
            startActivity(startAct)
            this.finish()
        })
        p25=findViewById(R.id.p25)
        p25.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro25::class.java)
            startActivity(startAct)
            this.finish()
        })
        p26=findViewById(R.id.p26)
        p26.setOnClickListener({
            val startAct=Intent(this@Buypro,
                Pro26::class.java)
            startActivity(startAct)
            this.finish()
        })

    }
}
