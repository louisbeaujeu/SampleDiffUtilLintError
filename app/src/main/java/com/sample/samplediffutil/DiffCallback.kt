package com.sample.samplediffutil

import androidx.recyclerview.widget.DiffUtil
import com.sample.sealedmodule.Food

class DiffCallback() : DiffUtil.ItemCallback<Food>() {
    override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean {
        return oldItem == newItem
    }
}