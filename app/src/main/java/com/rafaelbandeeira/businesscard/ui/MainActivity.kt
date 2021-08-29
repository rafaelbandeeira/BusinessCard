package com.rafaelbandeeira.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rafaelbandeeira.businesscard.R
import com.rafaelbandeeira.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}