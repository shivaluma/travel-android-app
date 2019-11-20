package com.brogrammers.travel.network.model


import android.util.Log
import com.brogrammers.travel.manager.Constant

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Singleton retrofit
object WebAccess {
    val retrofit: Retrofit by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        // Create Retrofit client
        return@lazy retrofit
    }
}