package com.dicoding.listclub

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.listclub.databinding.ItemClubBinding

class ClubAdapter (
    val listClub : ArrayList<Club>,
    val context : Context
    ) : RecyclerView.Adapter<ClubAdapter.MyViewHolder>() {

    private lateinit var binding: ItemClubBinding

    private lateinit var clickUseCase: OnClickItemCallback

    fun setClickItemCallback(onClickItemCallback : OnClickItemCallback){
        this.clickUseCase = onClickItemCallback
    }


    inner class MyViewHolder (
        private val bindingItem : ItemClubBinding
        ): RecyclerView.ViewHolder(bindingItem.root){
            fun bindData(club:Club){
                with(bindingItem){
                    tvClubName.text = club.clubName
                    tvCoach.text = club.coach
                    tvStadium.text = club.stadium
                    tvNickname.text = club.nickName
                    tvEstablished.text = club.established
                    ivPoster.setImageResource(club.poster)
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = ItemClubBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(listClub[position])
    }

    override fun getItemCount(): Int = listClub.size

    interface OnClickItemCallback {
        fun onClickItemCallback(club: Club)
    }

}