package com.armaganaysu.kronometre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import com.armaganaysu.kronometre.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view) // setContentView(binding.root)
        var stopTime: Long = 0

        binding.buttonStart.setOnClickListener {
            binding.kronometre.base = SystemClock.elapsedRealtime() + stopTime
            binding.kronometre.start()
            binding.buttonStart.visibility = View.GONE
            binding.buttonPause.visibility = View.VISIBLE
            binding.imageView.setImageDrawable(getDrawable(R.drawable.pause))
        }
        binding.buttonPause.setOnClickListener {
            stopTime = binding.kronometre.base - SystemClock.elapsedRealtime()
            binding.kronometre.stop()
            binding.buttonStart.visibility = View.VISIBLE
            binding.buttonPause.visibility = View.GONE
            binding.imageView.setImageDrawable(getDrawable(R.drawable.start))

        }
        binding.buttonReset.setOnClickListener {
            binding.kronometre.base =SystemClock.elapsedRealtime()
            binding.kronometre.stop()
            stopTime = 0
            binding.buttonStart.visibility = View.VISIBLE
            binding.buttonPause.visibility = View.GONE
            binding.imageView.setImageDrawable(getDrawable(R.drawable.start))

        }
    }
}