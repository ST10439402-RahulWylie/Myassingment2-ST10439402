package com.example.myassingment2st10439402

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next= findViewById<Button>(R.id.btnButton)
        next .setOnClickListener{
            //create the explicit intent
            val intent = Intent(this,MainActivity2::class.java)
            //start the activity
            startActivity(intent)}
    }
}