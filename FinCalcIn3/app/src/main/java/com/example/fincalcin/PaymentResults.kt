package com.example.fincalcin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PaymentResults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_results)

        //val button = findViewById<Button>(R.id.button)

        val button2 = findViewById<Button>(R.id.button2)

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