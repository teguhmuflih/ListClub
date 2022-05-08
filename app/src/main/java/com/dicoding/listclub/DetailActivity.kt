package com.dicoding.listclub

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.listclub.databinding.ActivityDetailBinding

class DetailActivity: AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val clubData = intent.getParcelableExtra<Club>("club_data")
        clubData?.let { setupRvPlayer(it.player) }
        fillingData(clubData)
    }

    private fun setupRvPlayer(clubPlayer: ArrayList<ClubPlayer>){
        val adapter = PlayerAdapter(clubPlayer, applicationContext)
        binding.rvPlayer.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPlayer.adapter = adapter
    }

    private fun fillingData(clubData: Club?){

        clubData?.let{ club ->
            with(binding){
                tvClubName.text = club.clubName
                tvCoach.text = club.coach
                tvStadium.text = club.stadium
                tvNickname.text = club.nickName
                tvEstablished.text = club.established
                tvDescription.text = club.description
                ivPoster.setImageResource(club.poster)
        }

        }
    }
}