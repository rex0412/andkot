package com.example.mycount

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.mycount.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    var count = 0
    var initTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.countButton.setOnClickListener {
            if (count == 0) {
                initTime = System.currentTimeMillis()
            }
            var timeDiff = System.currentTimeMillis() - initTime
            var isAvailable : Boolean =  timeDiff < 10 * 1000
            if (isAvailable) {
                count++
                binding.countText.text = "$count"
            }
        }

        binding.countButton2.setOnClickListener {
            count--
            binding.countText.text = "$count"
        }

        binding.CountButton3.setOnClickListener {
            count = 0
            binding.countText.text = "$count"
        }
    }
}