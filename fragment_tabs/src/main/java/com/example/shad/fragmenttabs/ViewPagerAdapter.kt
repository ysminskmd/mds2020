package com.example.shad.fragmenttabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import java.util.*

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class ViewPagerAdapter(
    fm: FragmentManager,
    private val colors: List<Int>
) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return DetailsFragment.newInstance(colors[position], position + 1)
    }

    override fun getCount(): Int = colors.size

    override fun getPageTitle(position: Int): CharSequence {
        val color = colors[position]
        val hex = Integer.toHexString(color and 0x00FFFFFF)
        return "#" + hex.toUpperCase(Locale.getDefault())
    }
}
