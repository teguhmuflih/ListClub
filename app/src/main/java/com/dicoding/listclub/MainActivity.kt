package com.dicoding.listclub

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.listclub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dtClub = dtClub()
        val listClub = dtClub.getClub()

        val clubAdapter = ClubAdapter(listClub, applicationContext)

        with(binding){
            rvClub.layoutManager = LinearLayoutManager(applicationContext)
            rvClub.adapter = clubAdapter
        }

        clubAdapter.setClickItemCallback(object : ClubAdapter.OnClickItemCallback{
            override fun onClickItemCallback(club: Club) {
                val intent = Intent(this@MainActivity,DetailActivity::class.java)
                intent.putExtra("club_data", club)
                startActivity(intent)

            }

        })
    }
}