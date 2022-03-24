package com.example.air_pollution.data.services.tmcoodinates


import com.google.gson.annotations.SerializedName

data class TmcoodinatesResponse(
    @SerializedName("documents")
    val documents: List<Document>?,
    @SerializedName("meta")
    val meta: Meta?
)