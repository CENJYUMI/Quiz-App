package com.example.apexercise6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.apexercise6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load and display the animated GIF using Glide
        Glide.with(this)
            .asGif()
            .load(R.drawable.testing)
            .into(binding.gifImageView)

        binding.startbtn.setOnClickListener {
            val intent = Intent(this, QuestionNo1::class.java)
            startActivity(intent)
            Toast.makeText(this, "Let's go!!!", Toast.LENGTH_LONG).show()
        }
    }


}