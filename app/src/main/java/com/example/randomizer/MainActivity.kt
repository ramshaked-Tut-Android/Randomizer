package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
//import kotlin.random.Random
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // ---------- Boilerplate code: ---------------
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Loads file res.layout.activity_main.xml

        // ----------- App implementation code: -------------
        // Obtain the views created in activity_main.xml:
        val rollButton =      findViewById<Button>  (R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar =         findViewById<SeekBar> (R.id.seekBar)

        // Add actions:
        rollButton.setOnClickListener {
            //val rand = java.util.Random().nextInt(seekBar.progress)
            val rand = Random().nextInt(seekBar.progress) // param of nextInt() is a range bound (not inclusive)
            resultsTextView.text = rand.toString()
        }
    }
}
