package com.yitechnology.data

import com.yitechnology.R
import com.yitechnology.model.Camera

object CameraData {
    fun getCameraListIndoor(): List<Camera>{
        return listOf(
            Camera("YI PRO 2K", R.drawable.yiprotwok),
            Camera("YI Home 3 Camera",R.drawable.yihomethreecam),
            Camera("YI Outdoor 1080p Camera",R.drawable.yioutdoor),
            Camera("YI Dome 1080p Camera",R.drawable.yidomep),
            Camera("YI Dome X Camera",R.drawable.yidomex),
            Camera("YI Dome Guard 2K Camera",R.drawable.yidomegc),
            Camera("YI Dome U Camera",R.drawable.yidomeuc),
            Camera("YI Dome U Pro Camera",R.drawable.yidomeupc),
            Camera("YI Outdoor 1080P PTZ Camera",R.drawable.yioutdoor_ptz)
        )
    }

    fun getDataHome(): List<Camera> {
        return listOf(
            Camera("Living Room",R.drawable.living_room),
            Camera("Kitchen",R.drawable.kitchen_room),
            Camera("Bed Room", R.drawable.bedroom),
            Camera("House Enterance", R.drawable.house_enter)
        )
    }
}