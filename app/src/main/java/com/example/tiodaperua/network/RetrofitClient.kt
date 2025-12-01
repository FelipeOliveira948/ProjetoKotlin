package com.example.tiodaperua.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://viacep.com.br/ws/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val instance: ViaCepApi by lazy {
        retrofit.create(ViaCepApi::class.java)
    }
}
