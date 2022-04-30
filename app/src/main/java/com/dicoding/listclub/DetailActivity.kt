package com.dicoding.listclub

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.listclub.databinding.ActivityDetailBinding

class DetailActivity: AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val clubData = intent.getParcelableExtra<Club>("club_data")
        fillingData(clubData)
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