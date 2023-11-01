package com.minadag.otherpagekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputBinding
import com.minadag.otherpagekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    // :: for referance

    fun next ( view: View) {
        val intent = Intent(this@MainActivity,SecondActivity::class.java)
        intent.putExtra("name",binding.editText.text.toString())
        startActivity(intent)
    }
}