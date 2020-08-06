package com.lanic.myapplication.ui

import android.content.Intent
import android.os.Bundle
import com.lanic.myapplication.R
import com.lanic.myapplication.base.BaseActivity
import com.lanic.myapplication.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(
        layoutId = R.layout.activity_main
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, TestActivity::class.java))
        }
    }
}