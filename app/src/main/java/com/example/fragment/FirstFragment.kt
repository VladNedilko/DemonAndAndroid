package com.example.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.TextView

class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var fragmentTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentTextView = view.findViewById(R.id.fragmentNameTextView)
        fragmentTextView.text = "First Fragment"

        val buttonToAnotherActivity: Button = view.findViewById(R.id.buttonOpenActivity)
        buttonToAnotherActivity.setOnClickListener {
            activity?.let {
                val intent = Intent(it, AnotherActivity::class.java)
                it.startActivity(intent)
            }
        }
    }
}


