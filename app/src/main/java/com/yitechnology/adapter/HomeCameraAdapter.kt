package com.yitechnology.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yitechnology.databinding.CameraHomeItemBinding
import com.yitechnology.databinding.CameraItemBinding
import com.yitechnology.model.Camera

class HomeCameraAdapter(private val cameraModel: List<Camera>) : RecyclerView.Adapter<HomeCameraAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: CameraHomeItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeCameraAdapter.ViewHolder {
        val binding = CameraHomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeCameraAdapter.ViewHolder, position: Int) {
        with(holder){
            with(cameraModel[position]){
                binding.tvCamera.text = this.name
                Picasso.get().load(this.url).into(binding.cctvImage)
            }
        }
    }

    override fun getItemCount(): Int {
        return cameraModel.size
    }
}