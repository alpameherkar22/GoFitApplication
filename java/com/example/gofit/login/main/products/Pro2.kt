package com.example.gofit.login.main.products

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import com.example.gofit.R
import com.example.gofit.login.main.Buypro
import com.example.gofit.login.main.Contact

class Pro2 : AppCompatActivity() {
    lateinit var backbtn: Button
    lateinit var  contact: Button
    var buy: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pro2)
        backbtn = findViewById(R.id.back)
        backbtn.setOnClickListener {

            val startAct = Intent(this@Pro2, Buypro::class.java)
            startActivity(startAct)
            this.finish()


        }
        contact=findViewById(R.id.next)
        contact.setOnClickListener {

            val startAct = Intent(this@Pro2, Contact::class.java)
            startActivity(startAct)
            this.finish()


        }
        buy=findViewById(R.id.t1)
        buy?.setMovementMethod(LinkMovementMethod.getInstance())
    }
}
