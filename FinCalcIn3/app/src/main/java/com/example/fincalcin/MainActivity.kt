package com.example.fincalcin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //calculate button
        val calculate = findViewById<Button>(R.id.button3)

        //three calculate option buttons at top
        val futbutton = findViewById<Button>(R.id.button4)
        val paybutton = findViewById<Button>(R.id.button)
        val presbutton = findViewById<Button>(R.id.button5)

        //three frequency buttons
        val monthbutton = findViewById<Button>(R.id.button7)
        val semibutton = findViewById<Button>(R.id.button2)
        val yearbutton = findViewById<Button>(R.id.button6)

        //three label names that change when different buttons are selected
        val deposit = findViewById<TextView>(R.id.textView2)
        val periodical = findViewById<TextView>(R.id.textView7)
        val freqText = findViewById<TextView>(R.id.freqTextField)

        //text fields to get user input
        val depField = findViewById<EditText>(R.id.editTextTextPersonName5)
        val intField = findViewById<EditText>(R.id.editTextTextPersonName6)
        val periField = findViewById<EditText>(R.id.editTextTextPersonName3)
        val yearField = findViewById<EditText>(R.id.editTextTextPersonName4)

        //call button handle function
        setListeners(depField, intField, periField, yearField, calculate, paybutton, futbutton, presbutton, monthbutton, semibutton, yearbutton, deposit, periodical, freqText)

        //calculateStuff(monthbutton)


    }

//    fun calculateStuff(mbut: Button) {
//        mbut.setOnClickListener{
//            if (mbut.currentTextColor == (Color.parseColor("#00FFF7"))) {
//
//                Toast.makeText(this, "Month Button Clicked", Toast.LENGTH_LONG).show()
//            }
//        }
//    }

    //function to handle all of the button presses.
    fun setListeners(dfield: EditText, ifield: EditText, pfield: EditText, yfield: EditText, cal: Button, but: Button, futbut: Button, presbut: Button, mbut: Button, sbut: Button, ybut: Button, lab: TextView,lab2: TextView, frText: TextView){
        //button.setOnClickListener{
//            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        //}

        //HAVE TO CREATE T HERE
        var t = 8.0

        //THIS IS WHERE I NEED TO GET T AND SEND IT OVER TO RESULTS.

        //val i = Intent(this, Results::class.java)
        //AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autocomplete);
        //String getrec=textView.getText().toString();

        //cast t to a string
        //val tstring = t.toString()

        //Create the bundle
        //bundle = Bundle();

        //Add your data to bundle
        //bundle.putString(tstring);

        //Add the bundle to the intent
       // i.putExtra("t",tstring)

        //Fire that second activity
        //startActivity(i);

        //check which tab is selected and send user to correct results screen.
//        cal.setOnClickListener{
//            if (lab.text == "Deposit") {
//                val myIntent = Intent(this, Results::class.java)
//                myIntent.putExtra("t",tstring)
//                startActivity(myIntent)
//            } else if (lab.text == "Down Payment") {
//                val myIntent = Intent(this, PaymentResults::class.java)
//                myIntent.putExtra("t",tstring)
//                startActivity(myIntent)
//            } else {
//            val myIntent = Intent(this, PresResults::class.java)
//                myIntent.putExtra("t",tstring)
//            startActivity(myIntent)
//        }
//
//
//        }

        //when user clicks on payment button, change it so payment button looks selected
        but.setOnClickListener{
            //val myIntent = Intent(this, Payment::class.java)

            //change label texts to text for payment tab
            lab.text = "Down Payment"
            lab2.text = "Total Price"
            frText.text = "Payment Frequency"

            //deselect future value button and select payment button.
            futbut.setTextColor(Color.parseColor("#2224FF"))
            futbut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //deselect present value button and select payment button.
            presbut.setTextColor(Color.parseColor("#2224FF"))
            presbut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //select payment value
            but.setTextColor(Color.parseColor("#AFFFFA"))
            but.setBackgroundColor(Color.parseColor("#2224FF"))


            //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF payment.

            //calculates based off of payment selection for years

            if (but.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                //calculates based off of month selection
                if (mbut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                    Toast.makeText(this, "Month Button Clicked in payment", Toast.LENGTH_LONG)
                        .show()

                    t = 12.0
                    //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF MONTH.

                }

                if (ybut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                    Toast.makeText(this, "Year Button Clicked in payment", Toast.LENGTH_LONG).show()

                    t = 124.0
                    //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF year.

                    //THIS IS WHERE WHILE LOOP WILL GO AND CALCULATE BASED ON YEARS FOR PAYMENT

                }

            }

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
            but.setTextColor(Color.parseColor("#2224FF"))
            but.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //deselect present value button and select future button.
            presbut.setTextColor(Color.parseColor("#2224FF"))
            presbut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //select future value
            futbut.setTextColor(Color.parseColor("#AFFFFA"))
            futbut.setBackgroundColor(Color.parseColor("#2224FF"))

            //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF future value.

            //calculates based off of future value selection for years

            if (futbut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                //calculates based off of month selection
                if (mbut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                    Toast.makeText(this, "Month Button Clicked in payment", Toast.LENGTH_LONG)
                        .show()

                    t = 12.0
                    //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF MONTH.

                }

                if (ybut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                    Toast.makeText(this, "Year Button Clicked in payment", Toast.LENGTH_LONG).show()

                    t = 2324.0
                    //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF year.

                    //THIS IS WHERE WHILE LOOP WILL GO AND CALCULATE BASED ON YEARS FOR FUTURE VALUE

                }

            }


            //startActivity(myIntent)
        }

        presbut.setOnClickListener{
            //val myIntent = Intent(this, Payment::class.java)

            //change label texts to text for payment tab
            lab.text = "Future Value"
            lab2.text = "Payment"
            frText.text = "Compound Frequency"

            //deselect future value button and select present value button.
            futbut.setTextColor(Color.parseColor("#2224FF"))
            futbut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //deselect payment value button and select present value button.
            but.setTextColor(Color.parseColor("#2224FF"))
            but.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //select present button value
            presbut.setTextColor(Color.parseColor("#AFFFFA"))
            presbut.setBackgroundColor(Color.parseColor("#2224FF"))

            //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF present value.

            //calculates based off of future value selection for years

            if (presbut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                //calculates based off of month selection
                if (mbut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                    Toast.makeText(this, "Month Button Clicked in payment", Toast.LENGTH_LONG)
                        .show()

                    t = 12.0
                    //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF MONTH.

                }

                if (ybut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                    Toast.makeText(this, "Year Button Clicked in payment", Toast.LENGTH_LONG).show()

                    t = 12489.0267246642
                    //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF year.

                    //THIS IS WHERE WHILE LOOP WILL GO AND CALCULATE BASED ON YEARS FOR PRESENT VALUE

                }

            }

            //startActivity(myIntent)
        }

        //month button selector
        mbut.setOnClickListener{
            //val myIntent = Intent(this, Payment::class.java)

            //deselect semi value button and select month button.
            sbut.setTextColor(Color.parseColor("#2224FF"))
            sbut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //deselect yearly value button and select month button.
            ybut.setTextColor(Color.parseColor("#2224FF"))
            ybut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //select month value
            mbut.setTextColor(Color.parseColor("#AFFFFA"))
            mbut.setBackgroundColor(Color.parseColor("#2224FF"))

            if (mbut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                Toast.makeText(this, "Month Button Clicked", Toast.LENGTH_LONG).show()

                //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF MONTH.

            }

            //startActivity(myIntent)
        }

        //year button selector
        ybut.setOnClickListener{
            //val myIntent = Intent(this, Payment::class.java)

            //deselect semi value button and select year button.
            sbut.setTextColor(Color.parseColor("#2224FF"))
            sbut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //deselect month value button and select year button.
            mbut.setTextColor(Color.parseColor("#2224FF"))
            mbut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //select year value
            ybut.setTextColor(Color.parseColor("#AFFFFA"))
            ybut.setBackgroundColor(Color.parseColor("#2224FF"))


            if (ybut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                //Toast.makeText(this, "Year Button Clicked", Toast.LENGTH_LONG).show()

                //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF YEAR.

                //calculates based off of payment selection for years
                if (but.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                    Toast.makeText(this, "Year Button Clicked in payment", Toast.LENGTH_LONG).show()

                    t = 124.0
                    //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF YEARS.

                    //THIS IS WHERE WHILE LOOP WILL GO AND CALCULATE BASED ON YEARS FOR PAYMENT

                }

                //calculates based off of future value selection for years
                if (futbut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                    Toast.makeText(this, "Year Button Clicked in future value", Toast.LENGTH_LONG).show()

                    t = 2324.0
                    //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF YEARS.

                    //THIS IS WHERE WHILE LOOP WILL GO AND CALCULATE BASED ON YEARS FOR FUTURE VALUE

                }

                //calculates based off of present value selection for years
                if (presbut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                    Toast.makeText(this, "Year Button Clicked in present value", Toast.LENGTH_LONG).show()

                    t = 12489.0267246642
                    //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF YEARS.

                    //THIS IS WHERE WHILE LOOP WILL GO AND CALCULATE BASED ON YEARS FOR PRESENT VALUE

                }

            }

            //startActivity(myIntent)
        }

        //semi button selector
        sbut.setOnClickListener{
            //val myIntent = Intent(this, Payment::class.java)

            //deselect year value button and select semi button.
            ybut.setTextColor(Color.parseColor("#2224FF"))
            ybut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //deselect month value button and select semi button.
            mbut.setTextColor(Color.parseColor("#2224FF"))
            mbut.setBackgroundColor(Color.parseColor("#AFFFFA"))

            //select semi value
            sbut.setTextColor(Color.parseColor("#AFFFFA"))
            sbut.setBackgroundColor(Color.parseColor("#2224FF"))

            if (sbut.currentTextColor == (Color.parseColor("#AFFFFA"))) {

                Toast.makeText(this, "Semi Button Clicked", Toast.LENGTH_LONG).show()

                //THIS IS WHERE I HAVE TO CALCULATE T BASED OFF OF SEMI.

            }

            //startActivity(myIntent)
        }

        //calculate button listener
        cal.setOnClickListener{
            //CHECK IF NULL
            if(dfield.text.isEmpty() || ifield.text.isEmpty() || pfield.text.isEmpty() || yfield.text.isEmpty()) {
                t = 0.00
                Log.i("field is empty", t.toString())
            }
                //cast t to a string
                val tstring = "$" + "%.2f".format(t)

                if (lab.text == "Deposit") {
                    val myIntent = Intent(this, Results::class.java)
                    myIntent.putExtra("t", tstring)
                    startActivity(myIntent)
                } else if (lab.text == "Down Payment") {
                    val myIntent = Intent(this, PaymentResults::class.java)
                    myIntent.putExtra("t", tstring)
                    startActivity(myIntent)
                } else {
                    val myIntent = Intent(this, PresResults::class.java)
                    myIntent.putExtra("t", tstring)
                    startActivity(myIntent)
                }


        }
    }
}

