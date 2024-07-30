package com.example.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomdb.Fragments.update

class MainActivity : AppCompatActivity(),onItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onitemClicked(position: Int) {
        val fragment =update()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }


}
