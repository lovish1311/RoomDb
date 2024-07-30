package com.example.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomdb.Fragments.AddData
import com.example.roomdb.Fragments.update
import com.example.roomdb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),onItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,AddData())
            .commit()
    }

    override fun onitemClicked(position: Int) {
        val fragment =update()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }


}
