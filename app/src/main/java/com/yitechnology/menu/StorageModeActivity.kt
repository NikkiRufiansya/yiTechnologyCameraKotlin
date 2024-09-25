package com.yitechnology.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.yitechnology.R
import com.yitechnology.databinding.ActivityStorageModeBinding

class StorageModeActivity : AppCompatActivity() {
    lateinit var binding: ActivityStorageModeBinding
    lateinit var radioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStorageModeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            super.onBackPressed()
        }

        binding.btnNext.setOnClickListener {
            val selectedOption: Int = binding.radioGroup.checkedRadioButtonId

            if (selectedOption == -1) {
                Toast.makeText(this, "Please choose one", Toast.LENGTH_SHORT).show()
            } else {
                radioButton = findViewById(selectedOption)
                Toast.makeText(this, radioButton.text, Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, AudioModeActivity::class.java))
            }


        }
    }
}