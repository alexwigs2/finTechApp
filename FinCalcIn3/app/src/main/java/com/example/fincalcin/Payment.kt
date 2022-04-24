package com.example.fincalcin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)

        //val button = findViewById<Button>(R.id.button)

        val button3 = findViewById<Button>(R.id.button3)

        val button4 = findViewById<Button>(R.id.button4)

        setListeners(button3, button4)
    }

    fun setListeners(but3: Button, but4: Button){
        //button.setOnClickListener{
//            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        //}

        but3.setOnClickListener{
            val myIntent = Intent(this, Results::class.java)
            startActivity(myIntent)
        }

        but4.setOnClickListener{
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}