package com.example.myassingment2st10439402

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    private var petHealth = 50
    private var petHunger = 50
    private var petCleanliness = 50
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Initialize UI elements
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val txtHungry = findViewById<EditText>(R.id.txtHungry)
        val txtClean = findViewById<EditText>(R.id.txtClean)
        val txtHappy = findViewById<EditText>(R.id.txtHappy)
        val petImage = findViewById<ImageView>(R.id.petImage)

        // Set initial values in UI
        updateUI()

        // Button click listeners
        btnFeed.setOnClickListener {
            petHealth += 5
            petHunger += 10
            petCleanliness += 0
            updateUI()
            // Change pet image if needed
            petImage.setImageResource(R.drawable.labrador_eating_from_bowl_2)
        }

        btnClean.setOnClickListener {
            petCleanliness += 10
            petHealth += 10
            updateUI()
            // Change pet image if needed
             petImage.setImageResource(R.drawable.bathing_grooming_3)
        }

        btnPlay.setOnClickListener {
            petHealth += 10
            petHunger += 0
            petCleanliness += 0
            updateUI()
            // Change pet image if needed
            petImage.setImageResource(R.drawable._6364265_close_up_of_labrador_retriever_playing_fetch_with_ball_in_mouth_at_local_swimming_pool_4)
        }
    }

    private fun updateUI() {
        // Ensure attribute bounds
        petHealth = petHealth.coerceIn(0, 100)
        petHunger = petHunger.coerceIn(0, 100)
        petCleanliness = petCleanliness.coerceIn(0, 100)

        // Update UI elements
        findViewById<EditText>(R.id.txtHappy).setText(petHealth.toString())
        findViewById<EditText>(R.id.txtHungry).setText(petHunger.toString())
        findViewById<EditText>(R.id.txtClean).setText(petCleanliness.toString())
    }
}