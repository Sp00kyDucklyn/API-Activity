package com.carmen.retrofit

import com.carmen.retrofit.data.Api
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    private val client: OkHttpClient = OkHttpClient().newBuilder().addInterceptor(interceptor).build()

    val api:Api = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Api.BASE_URL)
        .client(client)
        .build().create(Api::class.java)

}