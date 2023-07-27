package com.example.myproctor.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myproctor.R
import com.example.myproctor.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root) // Use binding.root instead of R.layout.activity_login

        binding.scanQRBtn.setOnClickListener {
            // Handle the button click here
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
