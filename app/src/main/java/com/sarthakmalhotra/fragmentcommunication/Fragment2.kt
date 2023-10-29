package com.sarthakmalhotra.fragmentcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import com.sarthakmalhotra.fragmentcommunication.databinding.Fragment2Binding
import org.w3c.dom.Text

class Fragment2: Fragment(R.layout.fragment2) {
    lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)
        val displayText = view.findViewById<TextView>(R.id.fragment2Text)

        setFragmentResultListener("textResult") { key, bundle ->
            val text = bundle.getString("text")
            displayText.text = text
        }

        return view
    }
}