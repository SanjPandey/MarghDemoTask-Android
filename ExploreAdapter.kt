package com.example.demotask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.demotask.R
import com.example.demotask.databinding.CustomRvItemviewBinding

import com.example.demotask.model.ExploreModel


class ExploreAdapter(var context: Context, var explorList: MutableList<ExploreModel>) :
    RecyclerView.Adapter<ExploreAdapter.ExploreViewHolder>() {

    private var filteredExploreList: List<ExploreModel> = explorList


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {
        var binding: CustomRvItemviewBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.custom_rv_itemview, parent, false
        )
        return ExploreViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return explorList.size
    }


    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        var explorList = explorList[position]

        holder.binding.ivQuote.setImageResource(explorList.userImage)


    }


    class ExploreViewHolder(val binding: CustomRvItemviewBinding) :
        RecyclerView.ViewHolder(binding.root)

    fun resetData() {
        filteredExploreList = explorList
    }
}

