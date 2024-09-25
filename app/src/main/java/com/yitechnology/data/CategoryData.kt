package com.yitechnology.data

import com.yitechnology.model.Category

object CategoryData {
    fun getCategoryList(): List<Category> {
        return  listOf(
            Category("Indoor Camera", "https://oss.yitechnology.com/images/home1080p/1080p-top.png"),
            Category("Outdoor Camera", "https://www.yitechnology.com/H31.png"),
            Category("Doobell Camera", "https://www.yitechnology.com/KamiDoorbell/kamiDoorbell.png"),
            Category("Wirefree Camera", "https://m.media-amazon.com/images/I/51CnE8LH82L._AC_UF894,1000_QL80_.jpg")
        )
    }
}