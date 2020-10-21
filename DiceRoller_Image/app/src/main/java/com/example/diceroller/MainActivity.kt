package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var randomNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }

        val imageView: ImageView = findViewById(R.id.dice_image)
        imageView.setImageResource(R.drawable.dice_1)

    }

    private fun rollDice() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        randomNumber = (1..6).random()

        val imageView: ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imageView.setImageResource(drawableResource)
    }

//    private fun numberCountUp() {
//        if (randomNumber < 6) {
//            randomNumber++
//        }
//        showData = randomNumber.toString()
//
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = showData
//    }
}