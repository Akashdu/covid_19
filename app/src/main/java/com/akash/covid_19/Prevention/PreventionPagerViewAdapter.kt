package com.akash.apps.covid_19.Prevention

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.akash.apps.covid_19.Prevention.PreventionFragments.*



internal class PreventionPagerViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                MaskFragment()
            }
            1 -> {
                washFragment()
            }
            2 -> {
                distanceFragment()
            }
            3 -> {
                coverFragment()
            }
            4 -> {
                homeFragment()
            }

            else -> MaskFragment()
        }
    }

    override fun getCount(): Int {

        return 5
    }

}