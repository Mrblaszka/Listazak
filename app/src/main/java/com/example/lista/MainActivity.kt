package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast
import com.example.Lista.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstenceState : Bundle?) {
        super.onCreate(savedInstenceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupCheckedTextView()
        CheckedTextView2()
    }
    private fun setupCheckedTextView() {
        val checkedTextView2 = binding.checkedTextView
        checkedTextView2.isChecked = false
        checkedTextView2.setCheckMarkDrawable(android.R.drawable.checkbox_off_background)
        checkedTextView2.setOnClickListener {
            checkedTextView2.isChecked = !checkedTextView2.isChecked
            checkedTextView2.setCheckMarkDrawable(
                if (checkedTextView2.isChecked)
                    android.R.drawable.checkbox_on_background
                else
                    android.R.drawable.checkbox_off_background)

            val msg =
                getString(R.string.pre_msg) + " " + getString(
                    if (checkedTextView2.isChecked)
                        R.string.checked
                    else
                        R.string.unchecked)
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }
    }
}

