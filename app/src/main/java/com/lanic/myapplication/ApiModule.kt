package com.lanic.myapplication

import dagger.Module
import dagger.Provides
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApiModule {
    @Provides
    @Singleton
    fun provideAuthApi(
        @Named("unauthorized")
        okHttpClient: OkHttpClient,
        callAdapter: CallAdapter.Factory,
        converter: Converter.Factory
    ): AuthApi =
        Retrofit.Builder()
            .baseUrl("https://github.com/")
            .client(okHttpClient)
            .addCallAdapterFactory(callAdapter)
            .addConverterFactory(converter)
            .build()
            .create(AuthApi::class.java)

    @Provides
    @Singleton
    fun provideGithubAPi(
        @Named("authorized")
        okHttpClient: OkHttpClient,
        callAdapter: CallAdapter.Factory,
        converter: Converter.Factory
    ): GithubApi =
        Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .client(okHttpClient)
            .addCallAdapterFactory(callAdapter)
            .addConverterFactory(converter)
            .build()
            .create(GithubApi::class.java)

    @Provides
    @Singleton
    fun provideCallAdapterFactory(): CallAdapter.Factory = RxJava3CallAdapterFactory.createAsync()

    @Provides
    @Singleton
    fun provideConverterFactory() : Converter.Factory = GsonConverterFactory.create()
}