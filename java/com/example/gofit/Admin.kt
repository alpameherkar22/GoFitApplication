package com.example.gofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.gofit.database.DatabaseActivity
import com.example.gofit.login.LoginActivity

class Admin : AppCompatActivity() {
    lateinit var ok:Button
    lateinit var pass:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
        pass=findViewById(R.id.ad)
        ok=findViewById(R.id.ok)
        ok.setOnClickListener{
            if (pass.text.toString().trim()=="221199"){
                val startAct = Intent(this@Admin,DatabaseActivity::class.java)
                startActivity(startAct)
                this.finish()
            }else{
                Toast.makeText(this,"You are not authorized to view information",Toast.LENGTH_LONG).show()
                Handler().postDelayed({
                val startAct = Intent(this@Admin,LoginActivity::class.java)
                startActivity(startAct)
                this.finish()
                }, 2500)
            }
        }
    }

}
