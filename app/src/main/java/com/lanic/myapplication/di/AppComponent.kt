package com.lanic.myapplication.di

import android.app.Application
import com.lanic.myapplication.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class, NetworkModule::class, ApiModule::class, ActivityBinder::class,
    AndroidSupportInjectionModule::class]
)
interface AppComponent:AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application) : Builder

        fun build() : AppComponent
    }
}