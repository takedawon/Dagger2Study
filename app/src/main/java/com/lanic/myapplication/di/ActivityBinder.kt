package com.lanic.myapplication.di

import com.lanic.myapplication.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBinder {
    @ContributesAndroidInjector
    abstract fun bindMainActivity() : MainActivity
}