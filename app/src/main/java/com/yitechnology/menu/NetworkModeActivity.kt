package com.yitechnology.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.yitechnology.R
import com.yitechnology.databinding.ActivityNetworkModeBinding
import com.yitechnology.utils.LoadingActivity

class NetworkModeActivity : AppCompatActivity() {
    lateinit var binding: ActivityNetworkModeBinding
    lateinit var radioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNetworkModeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            super.onBackPressed()
        }

        binding.btnNext.setOnClickListener {
            val selectedOption: Int = binding.radioGroup.checkedRadioButtonId
            radioButton = findViewById(selectedOption)
            Toast.makeText(this, radioButton.text, Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoadingActivity::class.java))

        }
    }
}