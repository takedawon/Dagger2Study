package com.lanic.myapplication

import android.content.Context
import android.content.Context.MODE_PRIVATE

class AuthTokenProvider(private val context: Context) {
    companion object {
        private const val KEY_AUTH_TOKEN = "auth_token"
    }

    val token: String?
        get() = context.getSharedPreferences(KEY_AUTH_TOKEN, MODE_PRIVATE)
            .getString(KEY_AUTH_TOKEN, null)

    fun updateToken(token: String) {
        context.getSharedPreferences(KEY_AUTH_TOKEN, MODE_PRIVATE)
            .edit()
            .putString(KEY_AUTH_TOKEN, token)
            .apply()
    }
}