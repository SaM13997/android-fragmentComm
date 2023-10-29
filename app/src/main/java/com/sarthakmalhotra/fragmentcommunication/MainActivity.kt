package com.sarthakmalhotra.fragmentcommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.sarthakmalhotra.fragmentcommunication.databinding.ActivityMainBinding
import com.sarthakmalhotra.fragmentcommunication.databinding.Fragment1Binding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var fragment1binding: Fragment1Binding
    lateinit var sendBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        fragment1binding = Fragment1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1Btn.setOnClickListener{
            replaceFragment(Fragment1())
        }
        binding.fragment2Btn.setOnClickListener {
            replaceFragment(Fragment2())
        }
    }


    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment)
            commit()
        }
    }
}