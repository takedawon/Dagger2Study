package com.lanic.myapplication

import android.content.Context
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GithubApiProvider {

    fun provideAuthApi() : AuthApi =
        Retrofit.Builder()
            .baseUrl("https://github.com/")
            .client(provideOkHttpClient(provideLoggingInterceptor(), null))
            .addCallAdapterFactory(RxJava3CallAdapterFactory.createAsync())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AuthApi::class.java)

    fun provideGithubApi(context: Context)
}