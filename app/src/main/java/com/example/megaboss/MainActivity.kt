package com.example.megaboss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.afollestad.viewpagerdots.DotsIndicator
import java.util.concurrent.atomic.DoubleAccumulator

class MainActivity : AppCompatActivity() {
    lateinit var viewPager : ViewPager
    lateinit var dots : DotsIndicator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        viewPager = findViewById(R.id.pager)
        dots = findViewById(R.id.dots)



        viewPager.adapter = MainPageAdapter()
        viewPager.offscreenPageLimit = 5
        dots.attachViewPager(viewPager)

    }
}