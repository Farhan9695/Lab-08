package com.farhan.lab_08

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.farhan.lab_08.databinding.ActivityDetailBinding
import com.google.android.material.snackbar.Snackbar

class Detail_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.nameTextView.text = intent.getStringExtra("name")
        binding.phonenumberTextView.text = intent.getStringExtra("phone")
        binding.sizeTextView.text = intent.getStringExtra("size")
        binding.submitBtn.setOnClickListener {
            binding.ratingTextView.text = binding.ratingBar.rating.toString()

            Snackbar.make(view, "Thank you for your rating",
            Snackbar.LENGTH_LONG).setAction("OK"){
                print("User pressed ok!")}.show()

        }
        binding.pickupdateTextView.text = intent.getStringExtra("date")
        binding.pickuptimeTextView.text = intent.getStringExtra("time")

        }
    }
