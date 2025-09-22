package com.example.lab_week_05.api
import com.example.lab_week_05.model.ImageData
import retrofit2.Call
import retrofit2.http.Query
import retrofit2.http.GET

interface CatApiService {
    @GET("images/search")
    fun searchImages(
        @Query("limit") limit: Int,
        @Query("size") format: String
    ) : Call<List<ImageData>>
}