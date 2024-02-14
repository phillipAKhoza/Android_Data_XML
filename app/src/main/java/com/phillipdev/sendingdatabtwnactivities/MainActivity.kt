package com.phillipdev.sendingdatabtwnactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var etName :TextInputEditText
    lateinit var etEmail : TextInputEditText
    lateinit var etPhone : TextInputEditText
    lateinit var btnSignUp : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.txtName)
        etEmail = findViewById(R.id.txtEmail)
        etPhone = findViewById(R.id.txtPhone)
        btnSignUp = findViewById(R.id.btnSignUp)

        btnSignUp.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val phone = etPhone.text.toString().toLong()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("phone", phone)

            startActivity(intent)
        }
    }
}