package com.akash.apps.covid_19.Symptoms.SymptomFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.akash.apps.covid_19.R

/**
 * A simple [Fragment] subclass.
 */
class WeaknessFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weakness, container, false)
    }


}