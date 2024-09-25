package com.yitechnology.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.yitechnology.R
import com.yitechnology.adapter.CameraAdapter
import com.yitechnology.data.CameraData
import com.yitechnology.databinding.ActivityChooseCameraBinding
import com.yitechnology.model.Camera

class ChooseCameraActivity : AppCompatActivity(),CameraAdapter.OnItemClickListener {
    lateinit var binding: ActivityChooseCameraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            super.onBackPressed()
        }

        binding.rvCamera.layoutManager = LinearLayoutManager(this)
        binding.rvCamera.adapter = CameraAdapter(CameraData.getCameraListIndoor(), this)
    }

    override fun onItemClick(camera: Camera) {
        Toast.makeText(this, "${camera.name}", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, PowerModeActivity::class.java))
    }
}