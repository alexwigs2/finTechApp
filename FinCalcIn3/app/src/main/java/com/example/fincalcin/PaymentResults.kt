package com.example.fincalcin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PaymentResults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_results)

        //val button = findViewById<Button>(R.id.button)

        val button2 = findViewById<Button>(R.id.button2)

        //total label
        val total = findViewById<TextView>(R.id.textView4)

        //get t from main activity
        val pro=intent.getStringExtra("t")

        //set t to label text
        total.text = pro

        setListeners(button2)
    }

    fun setListeners(button2: Button){
        //button.setOnClickListener{
//            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        //}

        button2.setOnClickListener{
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}