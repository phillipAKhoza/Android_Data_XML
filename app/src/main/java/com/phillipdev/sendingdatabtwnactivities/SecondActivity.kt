package com.phillipdev.sendingdatabtwnactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var tvName : TextView
    lateinit var tvEmail: TextView
    lateinit var tvPhone : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvName = findViewById(R.id.textViewName)
        tvEmail = findViewById(R.id.textViewEmail)
        tvPhone = findViewById(R.id.textViewPhone)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val phone = intent.getLongExtra("phone",0)

        tvName.text = "Hello $name"
        tvEmail.text = "Your email is $email"
        tvPhone.text= "Your Phone number is $phone"

    }
}