package com.example.androidmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        mainViewModel = MainViewModel(User("abc", "def"))
        binding.mainViewModel = mainViewModel

        setContentView(binding.root)
    }
}