package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var showData = "Hello World"
    var randomNumber : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }

        val countUpButton: Button = findViewById(R.id.countUp)
        countUpButton.setOnClickListener {
            numberCountUp()
        }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = showData
    }

    private fun rollDice() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        randomNumber = (1..6).random()
        showData = randomNumber.toString()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = showData
    }

    private fun numberCountUp(){
        if(randomNumber<6){
            randomNumber++
        }
        showData = randomNumber.toString()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = showData
    }
}