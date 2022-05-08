package com.dicoding.listclub

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.listclub.databinding.ItemPlayerBinding

class PlayerAdapter (
    val listPlayer: ArrayList<ClubPlayer>,
    val context : Context
): RecyclerView.Adapter<PlayerAdapter.MyViewHolder>(){

    lateinit var  binding: ItemPlayerBinding

    inner class MyViewHolder(
        private val itemBinding: ItemPlayerBinding
    ): RecyclerView.ViewHolder(binding.root){
        fun bindData(clubPlayer: ClubPlayer){
            with(itemBinding){
                ivPosterPlayer.setImageDrawable(context.getDrawable(clubPlayer.poster))
                tvPlayerName.text = clubPlayer.playName
                tvPlayerPosition.text = clubPlayer.playPosition
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerAdapter.MyViewHolder {
        binding = ItemPlayerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlayerAdapter.MyViewHolder, position: Int) {
        holder.bindData(listPlayer[position])
    }

    override fun getItemCount(): Int = listPlayer.size
    }
