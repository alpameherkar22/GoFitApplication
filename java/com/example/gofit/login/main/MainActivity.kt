package com.example.gofit.login.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.gofit.R
import com.example.gofit.login.LoginActivity

class MainActivity : AppCompatActivity() {

    lateinit var backbtn: Button
    lateinit var  contact:Button
    lateinit var t1: TextView
    lateinit var t2: TextView
    lateinit var t3:TextView
    lateinit var t4:TextView
    lateinit var t5:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        backbtn = findViewById(R.id.back)
        contact=findViewById(R.id.next)
        t1 = findViewById(R.id.t1)
        t2 = findViewById(R.id.t2)
        t3= findViewById(R.id.t3)
        t4=findViewById(R.id.t4)
        t5=findViewById(R.id.t5)

        t1.setOnClickListener {

                val startAct = Intent(this@MainActivity, EatHealthy::class.java)
                startActivity(startAct)
                this.finish()
            }
        t2.setOnClickListener {

                    val Act = Intent(this@MainActivity, Yoga::class.java)
                    startActivity(Act)
                    this.finish()
                }
        t3.setOnClickListener {

                val Act = Intent(this@MainActivity, HealthWo::class.java)
                startActivity(Act)
                this.finish()
           }
        t4.setOnClickListener {

            val Act = Intent(this@MainActivity, HomeWorkout::class.java)
            startActivity(Act)
            this.finish()
        }
        t5.setOnClickListener {

            val Act = Intent(this@MainActivity,Buypro::class.java)
            startActivity(Act)
            this.finish()
        }

        backbtn.setOnClickListener {

                        val startAct = Intent(this@MainActivity, LoginActivity::class.java)
                        startActivity(startAct)
                        this.finish()


                }
        contact.setOnClickListener {

            val startAct = Intent(this@MainActivity, Contact::class.java)
            startActivity(startAct)
            this.finish()


        }



    }
}
