package com.example.gofit.absvideos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.gofit.R
import com.example.gofit.login.main.Abs
import com.example.gofit.login.main.Contact
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class Vid1 : YouTubeBaseActivity(),YouTubePlayer.OnInitializedListener {
    lateinit var youTubePlayerVeiw:YouTubePlayerView
    lateinit var button:ImageButton
    lateinit var backbtn: Button
    lateinit var  contact:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vid1)
        youTubePlayerVeiw=findViewById(R.id.vid1)
        youTubePlayerVeiw.initialize(API_KEY,this)
        backbtn = findViewById(R.id.back)
        backbtn.setOnClickListener {

            val startAct = Intent(this@Vid1, Abs::class.java)
            startActivity(startAct)
            this.finish()


        }
        contact=findViewById(R.id.next)
        contact.setOnClickListener {

            val startAct = Intent(this@Vid1, Contact::class.java)
            startActivity(startAct)
            this.finish()
        }
        }

    companion object{
        var API_KEY="AIzaSyAH4usXXVkmrGDFP-tTHQW0nvWAaQoqZ8w"
    }

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
        if (!p2){
            p1?.cueVideo("thdu1bQGkgw")
        }
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        getpro().initialize(API_KEY,this)
    }
    fun getpro(): YouTubePlayerView {
        return youTubePlayerVeiw
    }

}

