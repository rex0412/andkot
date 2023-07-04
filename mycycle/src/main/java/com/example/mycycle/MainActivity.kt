package com.example.mycycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.mycycle.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyActivity", "onCreate")
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val requestLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){
            it.data!!.getStringExtra("result")?.let {
//                datas?.add(it)
//                adapter.notifyDataSetChanged()
            }
        }

        binding.button1.setOnClickListener {
            val  intent = Intent(this, TwoActivity::class.java)
            requestLauncher.launch(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyActivity", "onStart")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MyActivity", "onStop")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MyActivity", "onResume")
    }override fun onPause() {
        super.onPause()
        Log.d("MyActivity", "onPause")
    }override fun onDestroy() {
        super.onDestroy()
        Log.d("MyActivity", "onDestroy")
    }override fun onRestart() {
        super.onRestart()
        Log.d("MyActivity", "onRestart")
    }
}
