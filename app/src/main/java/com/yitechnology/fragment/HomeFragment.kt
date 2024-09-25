package com.yitechnology.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.yitechnology.adapter.HomeCameraAdapter
import com.yitechnology.data.CameraData

import com.yitechnology.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        binding.rvHome.layoutManager = LinearLayoutManager(context)
        binding.rvHome.adapter = HomeCameraAdapter(CameraData.getDataHome())
        return binding.root
    }



}