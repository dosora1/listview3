package com.example.listview3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = mutableListOf<MainListItem>(
            MainListItem("pup1", "놀면 뭐하니?", "버라이어티"),
            MainListItem("pup2", "무한도전", "버라이어티")
        )

        val mlAdapter = MainListAdapter(this, items)
        binding.mainListView.adapter = mlAdapter
    }
}