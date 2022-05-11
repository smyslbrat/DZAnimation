package com.example.dzanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import com.example.dzanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_anim, StartFragment())
                .commit()


    }
}