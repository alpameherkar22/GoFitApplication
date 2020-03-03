package com.example.gofit.database

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import com.example.gofit.*
import com.example.gofit.login.LoginActivity
import com.example.gofit.login.main.MainActivity
import kotlinx.android.synthetic.main.user.*

class DatabaseActivity : AppCompatActivity() {

    lateinit var listView: ListView
    internal var helper= DatabaseHelper(this)
    var list= mutableListOf<User>()
    lateinit var btn:Button
    lateinit var backbtn:Button
    lateinit var nextbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)

        listView=findViewById(R.id.listview)
        btn=findViewById(R.id.refresh)
        backbtn=findViewById(R.id.back)
        nextbtn=findViewById(R.id.next)

        backbtn.setOnClickListener {

                val startAct = Intent(this@DatabaseActivity, LoginActivity::class.java)
                startActivity(startAct)
                this.finish()
        }
        nextbtn.setOnClickListener {

                val startAct = Intent(this@DatabaseActivity, MainActivity::class.java)
                startActivity(startAct)
                this.finish()
        }

        veiwAll()

        val adapter= MyListAdapter(
            this,
            R.layout.user,
            list
        )
        listView.adapter=adapter
        btn.setOnClickListener{
            veiwAll()
            adapter.notifyDataSetChanged()
        }
    }



    private fun veiwAll(){
        list.clear()
        val res=helper.allData
        if (res.count==0){
            Toast.makeText(this,"No Users",Toast.LENGTH_LONG).show()
        }
        while (res.moveToNext()){
            list.add(User(res.getString(0), res.getString(1), res.getString(2)))
        }
    }
}
