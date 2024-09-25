package com.yitechnology.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yitechnology.databinding.CategoryItemBinding
import com.yitechnology.model.Category


class CategoryAdapter(private val categoryModel: List<Category>, private val listener: OnItemClickListener) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: CategoryItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {
        val binding = CategoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
        with(holder){
            with(categoryModel[position]){
                binding.tvCategory.text = this.name
                Picasso.get().load(this.url).into(binding.ivCategory)
                binding.root.setOnClickListener {
                    listener.onItemClick(categoryModel[position])
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return categoryModel.size
    }
    interface OnItemClickListener {
        fun onItemClick(category: Category)
    }
}

