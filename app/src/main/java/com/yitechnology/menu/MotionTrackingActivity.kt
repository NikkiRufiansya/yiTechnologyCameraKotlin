package com.yitechnology.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            if (binding.cbMotionTracking.isChecked || binding.cbNotification.isChecked || binding.cbBuiltIn.isChecked){
                startActivity(Intent(this, ResolutionModeActivity::class.java))
            }else{
                Toast.makeText(this, "please fill in one", Toast.LENGTH_SHORT).show()
            }
            
        }


    }
}