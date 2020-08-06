package com.lanic.myapplication.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import timber.log.Timber

abstract class BaseActivity<B : ViewDataBinding>
    (@LayoutRes val layoutId: Int) : AppCompatActivity() {

    lateinit var binding : B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        Timber.d("${this.javaClass.simpleName} :: onCreate() 실행")
    }

    override fun onStart() {
        super.onStart()
        Timber.d("${this::class.simpleName} :: onStart() 실행")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("${this::class.simpleName} :: onResume() 실행")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.d("${this::class.simpleName} :: onRestart() 실행")
    }

    override fun onPause() {
        Timber.d("${this::class.simpleName} :: onPause() 실행")
        super.onPause()
    }

    override fun onStop() {
        Timber.d("${this::class.simpleName} :: onStop() 실행")
        super.onStop()
    }

    override fun onDestroy() {
        Timber.d("${this::class.simpleName} :: onDestroy() 실행")
        super.onDestroy()
    }
}