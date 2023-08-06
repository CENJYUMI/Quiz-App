package com.example.apexercise6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.example.apexercise6.databinding.ActivityQuestionNo5Binding
import com.example.apexercise6.databinding.ActivityQuestionNo6Binding

class QuestionNo6 : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionNo6Binding
    private var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionNo6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        score = intent.getIntExtra("score", 0)
        binding.txtRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedOption = findViewById<RadioButton>(checkedId)?.text.toString()
            when (checkedId) {
                R.id.a_il -> updateScore(20) // Assign scores based on selected options
                R.id.b_ee -> updateScore(0)
                R.id.c_sam -> updateScore(0)
                R.id.d_sa -> updateScore(0)
            }
            Toast.makeText(this, "$selectedOption", Toast.LENGTH_LONG).show()
        }
        binding.NextBtn.setOnClickListener {
            val intent = Intent(this, QuestionNo7::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
            Toast.makeText(this, "Next", Toast.LENGTH_LONG).show()
        }
    }

    private fun updateScore(points: Int) {
        score += points
    }
}