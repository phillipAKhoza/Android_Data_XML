package com.phillipdev.senddatabtwnactivitynfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etLenght : EditText
    lateinit var etWidth : EditText
    lateinit var btnCalculate : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etLenght = findViewById(R.id.editTextLength)
        etWidth = findViewById(R.id.editTextWidth)
        btnCalculate = findViewById(R.id.btnCalc)

        btnCalculate.setOnClickListener {

        }

    }
}