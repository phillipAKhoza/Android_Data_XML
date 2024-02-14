package com.phillipdev.senddatabtwnactivitynfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

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
        val fm : FragmentManager = supportFragmentManager
        val ft : FragmentTransaction = fm.beginTransaction()
        val brickResultFragment = BrickResultFragment()

        btnCalculate.setOnClickListener {
            val length : Double = etLenght.text.toString().toDouble()
            val width : Double = etWidth.text.toString().toDouble()

            val bundle = Bundle()
            bundle.putDouble("length", length)
            bundle.putDouble("width", width)
            brickResultFragment.arguments = bundle
            ft.add(R.id.frame, brickResultFragment)
            ft.commit()

        }

    }
}