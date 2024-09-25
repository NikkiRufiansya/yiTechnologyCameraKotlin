package com.yitechnology.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yitechnology.databinding.ActivityMotionTrackingBinding

class MotionTrackingActivity : AppCompatActivity() {
    lateinit var binding: ActivityMotionTrackingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotionTrackingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            super.onBackPressed()
        }

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, ResolutionModeActivity::class.java))
        }


    }
}