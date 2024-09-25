package com.yitechnology.auth

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.yitechnology.R
import com.yitechnology.adapter.CountryAdapter
import com.yitechnology.data.CountryData
import com.yitechnology.databinding.ActivityChooseCountryBinding
import com.yitechnology.menu.SelectCategoryActivity
import com.yitechnology.model.Country

class ChooseCountryActivity : AppCompatActivity(), CountryAdapter.OnItemClickListener {
    lateinit var binding: ActivityChooseCountryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseCountryBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.rvCountry.layoutManager = LinearLayoutManager(this)
        binding.rvCountry.adapter = CountryAdapter(CountryData.getCountryList(), this)
    }

    override fun onItemClick(country: Country) {
        Toast.makeText(this, "${country.name}", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, SelectCategoryActivity::class.java))
    }
}