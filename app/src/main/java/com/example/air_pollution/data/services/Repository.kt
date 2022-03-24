package com.example.air_pollution.data

import com.example.air_pollution.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Repository {

    private val kakaoLocalApiService by lazy{
        Retrofit.Builder()
            .baseUrl(Url.KAKAO_API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client()
            .build()
    }

    private fun buildHttpClient():OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(
                HttpLogging().apply{
                    level = if(BuildConfig.DEBUG){
                        HttpLoggingInterceptor
                    }
                }
            )
}