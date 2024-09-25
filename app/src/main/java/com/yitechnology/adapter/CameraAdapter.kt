package com.yitechnology.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yitechnology.databinding.CameraItemBinding
import com.yitechnology.model.Camera


class CameraAdapter(private val cameraModel: List<Camera>, private val  listener: OnItemClickListener) : RecyclerView.Adapter<CameraAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: CameraItemBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CameraAdapter.ViewHolder {
        val binding = CameraItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CameraAdapter.ViewHolder, position: Int) {
        with(holder){
            with(cameraModel[position]){
                binding.tvCamera.text = this.name
                Picasso.get().load(this.url).into(binding.ivCamera)
                binding.root.setOnClickListener {
                    listener.onItemClick(cameraModel[position])
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return cameraModel.size
    }

    interface OnItemClickListener {
        fun onItemClick(camera: Camera)
    }
}