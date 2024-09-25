package com.yitechnology.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.yitechnology.R
import com.yitechnology.adapter.CategoryAdapter
import com.yitechnology.data.CategoryData
import com.yitechnology.databinding.ActivitySelectCategoryBinding
import com.yitechnology.model.Category

class SelectCategoryActivity : AppCompatActivity(), CategoryAdapter.OnItemClickListener {
    lateinit var binding: ActivitySelectCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvCategory.layoutManager = GridLayoutManager(this, 2)
        binding.rvCategory.adapter = CategoryAdapter(CategoryData.getCategoryList(), this)

        binding.btnBack.setOnClickListener {
            super.onBackPressed()
        }
    }

    override fun onItemClick(category: Category) {
        Toast.makeText(this, "${category.name}", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, ChooseCameraActivity::class.java))
    }

}