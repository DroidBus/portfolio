package com.shweta.portfolioapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shweta.portfolioapplication.databinding.ItemSkillBinding

class SkillsAdapter(private val skillsList: Array<String>): RecyclerView.Adapter<SkillsAdapter.SkillsViewHolder>() {

    inner class SkillsViewHolder( val binding: ItemSkillBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillsViewHolder {
        val binding = ItemSkillBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SkillsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SkillsViewHolder, position: Int) {
        if(skillsList.isNotEmpty()){
            holder.binding.tvSkill.text= skillsList[position]
        }
    }

    override fun getItemCount(): Int {
       return skillsList.size
    }
}