package com.example.apexercise6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.apexercise6.databinding.ActivityViewScoreBinding

class ViewScore : AppCompatActivity() {
    private lateinit var binding: ActivityViewScoreBinding

    companion object {
        private const val PASSING_SCORE = 110 // Adjust the passing score as needed
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra("score", 0)

        // Display the score in a TextView or any other UI element
        binding.txtScore.text = "Your score: $score"

        // Determine if the user passed or failed based on the score
        if (score >= PASSING_SCORE) {
            binding.CongratsOrTryAgain.text = getString(R.string.congratulations)
        } else {
            binding.CongratsOrTryAgain.text = getString(R.string.try_again)
        }


        binding.TryAgain.setOnClickListener {
            val intent = Intent(this, QuestionNo1::class.java)

            startActivity(intent)
            Toast.makeText(this, "Let's Go", Toast.LENGTH_LONG).show()
        }

    }
}
