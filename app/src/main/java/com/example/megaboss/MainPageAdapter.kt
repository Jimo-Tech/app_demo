package com.example.megaboss

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class MainPageAdapter : PagerAdapter() {

    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        var number = 0
        when (number) {
            0 -> {
                number = R.layout.fragment_first__introduction
            }
            1 -> {
                number = R.layout.fragment_second
            }
            2 -> {
                number = R.layout.fragment_third
            }

        }
        return collection
    }

    override fun getCount() = 4


    override fun getPageTitle(position: Int) = when (position) {
        0 -> "One"
        1 -> "Two"
        2 -> "Three"
        else -> null
    }

    override fun isViewFromObject(arg0: View, arg1: Any) = arg0 === arg1 as View

    override fun destroyItem(
        container: ViewGroup, position: Int, arg1: Any,
    ) = Unit


}