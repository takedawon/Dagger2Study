package com.lanic.myapplication.api

import com.google.gson.annotations.SerializedName

class GithubAccessToken(
    @SerializedName("access_token")
    val accessToken: String,
    @SerializedName("token_type")
    val tokenType: String,
    @SerializedName("scope")
    val scope: String
)