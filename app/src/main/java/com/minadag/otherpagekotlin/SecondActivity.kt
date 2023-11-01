package com.minadag.otherpagekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minadag.otherpagekotlin.databinding.ActivityMainBinding
import com.minadag.otherpagekotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentMain = intent // getIntent
        val name = intentMain.getStringExtra("name") // key must be same in mainActivity

        binding.nameText.text = "Name : ${name}"



    }
}