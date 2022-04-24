package com.example.fincalcin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculate = findViewById<Button>(R.id.button3)

        val futbutton = findViewById<Button>(R.id.button4)
        val paybutton = findViewById<Button>(R.id.button)

        val deposit = findViewById<TextView>(R.id.textView2)
        val periodical = findViewById<TextView>(R.id.textView7)
        val freqText = findViewById<TextView>(R.id.freqTextField)

        setListeners(calculate, paybutton, futbutton, deposit, periodical, freqText)
    }

    fun setListeners(cal: Button, but: Button, futbut: Button, lab: TextView,lab2: TextView, frText: TextView){
        //button.setOnClickListener{
//            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        //}

        //check which tab is selected and send user to correct results screen.
        cal.setOnClickListener{
            if (lab.text == "Deposit") {
                val myIntent = Intent(this, Results::class.java)
                startActivity(myIntent)
            } else {
                val myIntent = Intent(this, PaymentResults::class.java)
                startActivity(myIntent)
            }
        }

        //when user clicks on payment button, change it so payment button looks selected
        but.setOnClickListener{
            //val myIntent = Intent(this, Payment::class.java)
            
            //change label texts to text for payment tab
            lab.text = "Down Payment"
            lab2.text = "Total Price"
            frText.text = "Payment Frequency"

            //deselect future value button and select payment button.
            futbut.setTextColor(Color.parseColor("#0013FF"))
            futbut.setBackgroundColor(Color.parseColor("#00FFF7"))

            but.setTextColor(Color.parseColor("#00FFF7"))
            but.setBackgroundColor(Color.parseColor("#0013FF"))

            //startActivity(myIntent)
        }

        //when user clicks on future value button, change it so future value button looks selected
        futbut.setOnClickListener{
            //val myIntent = Intent(this, Payment::class.java)

            //change label texts to text for payment tab
            lab.text = "Deposit"
            lab2.text = "Periodical Payments"
            frText.text = "Compound Frequency"

            //deselect future value button and select payment button.
            but.setTextColor(Color.parseColor("#0013FF"))
            but.setBackgroundColor(Color.parseColor("#00FFF7"))

            futbut.setTextColor(Color.parseColor("#00FFF7"))
            futbut.setBackgroundColor(Color.parseColor("#0013FF"))

            //startActivity(myIntent)
        }
    }
}

