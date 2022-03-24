package com.example.air_pollution.data.services

import com.example.air_pollution.BuildConfig
import com.example.air_pollution.data.services.tmcoodinates.TmcoodinatesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface KakaoLocalApiService {

    @Headers("Authorization : KakaoAK ${BuildConfig.KAKAO_API_KEY}")

    @GET(" /v2/local/geo/coord2regioncode.json?output_coord=TM")
    suspend fun getTmCoordinates(
        @Query("x") longitude: Double,

        ):Response<TmcoodinatesResponse>
}