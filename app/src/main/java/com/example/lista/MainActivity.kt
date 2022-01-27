package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast
import com.example.lista.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstenceState : Bundle?) {
        super.onCreate(savedInstenceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupCheckedTextView()
        setupCheckedTextView3()
        setupCheckedTextView4()
        setupCheckedTextView5()
        setupCheckedTextView6()

    }
    private fun setupCheckedTextView() {
        val checkedTextView2 = binding.checkedTextView2
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
    private fun setupCheckedTextView3() {
        val checkedTextView3 = binding.checkedTextView3
        checkedTextView3.isChecked = false
        checkedTextView3.setCheckMarkDrawable(android.R.drawable.checkbox_off_background)

        checkedTextView3.setOnClickListener {
            checkedTextView3.isChecked = !checkedTextView3.isChecked
            checkedTextView3.setCheckMarkDrawable(
                if (checkedTextView3.isChecked)
                    android.R.drawable.checkbox_off_background
                else
                    android.R.drawable.checkbox_on_background)

            val msg2 =
                getString(R.string.pre_msg2) + " " + getString(
                    if (checkedTextView3.isChecked)
                        R.string.checked
                    else
                        R.string.unchecked)

            Toast.makeText(this@MainActivity, msg2,Toast.LENGTH_SHORT).show()
        }
    }
    private fun setupCheckedTextView4() {
        val checkedTextView4 = binding.checkedTextView4
        checkedTextView4.isChecked = false
        checkedTextView4.setCheckMarkDrawable(android.R.drawable.checkbox_off_background)

        checkedTextView4.setOnClickListener {
            checkedTextView4.isChecked = !checkedTextView4.isChecked
            checkedTextView4.setCheckMarkDrawable(
                if (checkedTextView4.isChecked)
                    android.R.drawable.checkbox_off_background
                else
                    android.R.drawable.checkbox_on_background)

            val msg3 =
                getString(R.string.pre_msg3) + " " + getString(
                    if (checkedTextView4.isChecked)
                        R.string.checked
                    else
                        R.string.unchecked)

            Toast.makeText(this@MainActivity, msg3,Toast.LENGTH_SHORT).show()
        }
    }
    private fun setupCheckedTextView5() {
        val checkedTextView5 = binding.checkedTextView5
        checkedTextView5.isChecked = false
        checkedTextView5.setCheckMarkDrawable(android.R.drawable.checkbox_off_background)

        checkedTextView5.setOnClickListener {
            checkedTextView5.isChecked = !checkedTextView5.isChecked
            checkedTextView5.setCheckMarkDrawable(
                if (checkedTextView5.isChecked)
                    android.R.drawable.checkbox_off_background
                else
                    android.R.drawable.checkbox_on_background)

            val msg4 =
                getString(R.string.pre_msg4) + " " + getString(
                    if (checkedTextView5.isChecked)
                        R.string.checked
                    else
                        R.string.unchecked)

            Toast.makeText(this@MainActivity, msg4,Toast.LENGTH_SHORT).show()
        }
    }
    private fun setupCheckedTextView6() {
        val checkedTextView6 = binding.checkedTextView6
        checkedTextView6.isChecked = false
        checkedTextView6.setCheckMarkDrawable(android.R.drawable.checkbox_off_background)

        checkedTextView6.setOnClickListener {
            checkedTextView6.isChecked = !checkedTextView6.isChecked
            checkedTextView6.setCheckMarkDrawable(
                if (checkedTextView6.isChecked)
                    android.R.drawable.checkbox_off_background
                else
                    android.R.drawable.checkbox_on_background)

            val msg5 =
                getString(R.string.pre_msg5) + " " + getString(
                    if (checkedTextView6.isChecked)
                        R.string.checked
                    else
                        R.string.unchecked)

            Toast.makeText(this@MainActivity, msg5,Toast.LENGTH_SHORT).show()
        }
    }
}

