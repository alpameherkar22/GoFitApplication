package com.example.gofit

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.gofit.login.LoginActivity

class SplashActivity : AppCompatActivity() {
    var permissionString= arrayOf(
        Manifest.permission.ACCESS_NETWORK_STATE,
        Manifest.permission.INTERNET)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if (!hasPermissions(this@SplashActivity,*permissionString)){
            ActivityCompat.requestPermissions(this@SplashActivity,permissionString,122)

        }else{
            Handler().postDelayed({
                val startAct= Intent(this@SplashActivity, LoginActivity::class.java)
                startActivity(startAct)
                this.finish()
            },1900)
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode){
            122 ->{
                if (grantResults.isNotEmpty() && grantResults[0]== PackageManager.PERMISSION_GRANTED && grantResults[1]==PackageManager.PERMISSION_GRANTED){
                    Handler().postDelayed({
                        val startAct=Intent(this@SplashActivity,
                            LoginActivity::class.java)
                        startActivity(startAct)
                        this.finish()
                    },1500)

                }else{
                    Toast.makeText(this@SplashActivity,"Please grant permissions", Toast.LENGTH_SHORT).show()
                    this.finish()
                }
                return

            }
            else ->{
                Toast.makeText(this@SplashActivity,"Something went wrong",Toast.LENGTH_SHORT).show()
                this.finish()
                return
            }
        }
    }
    fun hasPermissions(context: Context, vararg permissions:String):Boolean {
        var hasAllPermissions = true
        for (permission in permissions) {
            val res = context.checkCallingOrSelfPermission(permission)
            if (res != PackageManager.PERMISSION_GRANTED) {
                hasAllPermissions=false
            }
        }
        return hasAllPermissions
    }
}
