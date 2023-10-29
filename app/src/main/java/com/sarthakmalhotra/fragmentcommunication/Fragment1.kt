package com.sarthakmalhotra.fragmentcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import com.sarthakmalhotra.fragmentcommunication.databinding.Fragment1Binding

class Fragment1: Fragment(R.layout.fragment1) {
    lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)
        val editText = view.findViewById<EditText>(R.id.fragment1EditText)
        val nextButton = view.findViewById<Button>(R.id.fragment1SubmitBtn)

        nextButton.setOnClickListener {
            val text = editText.text.toString()
            setFragmentResult("textResult", bundleOf("text" to text))
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, Fragment2())
                .addToBackStack(null)
                .commit()
        }

        return view
    }}
