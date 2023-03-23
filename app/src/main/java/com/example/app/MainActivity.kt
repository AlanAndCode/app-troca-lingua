package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClicks()
    }

    private fun initClicks() {
        binding.btnPort.setOnClickListener{
            binding.textLanguage.text = "Olá mundo"
        }
        binding.btnEsp.setOnClickListener{
            binding.textLanguage.text = "Hola mundo"
        }
        binding.btnIng.setOnClickListener{
            binding.textLanguage.text = "Hello Word"
        }

    }


}