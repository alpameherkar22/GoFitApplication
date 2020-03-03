package com.example.gofit.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Patterns
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.gofit.Admin
import com.example.gofit.R
import com.example.gofit.database.DatabaseActivity
import com.example.gofit.database.DatabaseHelper
import com.example.gofit.login.main.MainActivity
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity() {
    private var PASSWORD_PATTERN=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=])(?=\\S+\$).{6,}$")
    internal var helper = DatabaseHelper(this)
    lateinit var logbtn: ImageButton
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var viewuser:ImageButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        logbtn = findViewById(R.id.logbtn)

        viewuser=findViewById(R.id.viewuserbtn)

        viewuser.setOnClickListener{
                val startAct = Intent(this@LoginActivity,Admin::class.java)
                startActivity(startAct)
                this.finish()

        }

        logbtn.setOnClickListener {

            if (email.text.toString().isEmpty()) {
                email.setError("Field cannot be empty")
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email.text.toString().trim()).matches()) {
                email.setError("Please enter valid email address")
            } else {
                if (password.text.toString().isEmpty()) {
                    password.setError("Field cannot be empty")
                } else if (!PASSWORD_PATTERN.matcher(password.text.toString().trim()).matches()) {
                    password.setError("Password should atleast contain 1 digit,1 lower case letter,1 uppercase letter and 1 special character")
                } else {
                        helper.insertData(
                            email.text.toString().trim(),
                            password.text.toString().trim())
                        val startAct = Intent(this@LoginActivity, MainActivity::class.java)
                        startActivity(startAct)
                        this.finish()

                }
            }
        }


    }}


