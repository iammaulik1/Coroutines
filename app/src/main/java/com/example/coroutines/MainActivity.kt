package com.example.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.coroutines.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG:String = "KotlinFun"


    lateinit var binding:ActivityMainBinding
    lateinit var counterText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        counterText = binding.counter

        Log.d(TAG ,"${Thread.currentThread().name}")

        binding.addButton.setOnClickListener {
            updateCounter()
        }
        binding.minusButton.setOnClickListener {
            minusCounter()
        }
    }


    fun updateCounter() {
        Log.d(TAG ,"${Thread.currentThread().name}")
        counterText.text= "${counterText.text.toString().toInt() + 1}"
    }
    fun minusCounter() {
        Log.d(TAG ,"${Thread.currentThread().name}")
        counterText.text = "${counterText.text.toString().toInt() - 1}"
    }
}