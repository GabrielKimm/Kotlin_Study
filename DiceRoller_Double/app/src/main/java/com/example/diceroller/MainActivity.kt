package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var randomNumber: Int = 0
    private lateinit var diceImage : ImageView
    private lateinit var diceImageB : ImageView

    private var demper: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImageB = findViewById(R.id.dice_imageB)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
        }

        diceImage.setImageResource(R.drawable.dice_1)
        diceImageB.setImageResource(R.drawable.dice_1)

    }

    private fun demperChecker(){

        randomNumber = (1..6).random()

        if(demper==true){
            val drawableResource = when (randomNumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            demper=false
            diceImage.setImageResource(drawableResource)
        }
        else{
            val drawableResourceB = when (randomNumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            demper=true
            diceImageB.setImageResource(drawableResourceB)
        }
    }

    private fun rollDice() {
        demperChecker()
        demperChecker()
    }

}