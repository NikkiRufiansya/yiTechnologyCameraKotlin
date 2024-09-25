package com.yitechnology.data

import com.yitechnology.R
import com.yitechnology.model.Category

object CategoryData {
    fun getCategoryList(): List<Category> {
        return  listOf(
            Category("Indoor Camera", R.drawable.indoor_camera),
            Category("Outdoor Camera", R.drawable.outdoor_camera),
            Category("Doobell Camera", R.drawable.dobell_camera),
            Category("Wirefree Camera", R.drawable.wirefree_camera)
        )
    }
}