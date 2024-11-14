package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView

class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var fragmentTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentTextView = view.findViewById(R.id.fragmentNameTextView)
        fragmentTextView.text = "Second Fragment"
    }
}
