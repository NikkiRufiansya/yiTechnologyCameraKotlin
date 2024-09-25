package com.yitechnology.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yitechnology.databinding.CountryItemBinding
import com.yitechnology.model.Country

class CountryAdapter(private val countryModel: List<Country>, private val listener: OnItemClickListener ) : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: CountryItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryAdapter.ViewHolder {
        val binding = CountryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryAdapter.ViewHolder, position: Int) {
        with(holder){
            with(countryModel[position]){
                binding.countryNameTextView.text = this.name
                Picasso.get().load(this.flagResource).into(binding.flagImageView)
                binding.root.setOnClickListener {
                    listener.onItemClick(countryModel[position])
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return countryModel.size
    }

    interface OnItemClickListener {
        fun onItemClick(country: Country)
    }
}