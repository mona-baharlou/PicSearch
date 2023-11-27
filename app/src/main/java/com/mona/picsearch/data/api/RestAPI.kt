package com.mona.picsearch.data.api

import com.mona.picsearch.data.model.PhotoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RestAPI {

    companion object {
        const val API_URL = "https://api.flickr.com"
    }

    @GET("services/rest")
    suspend fun searchPic(
        @Query("api_key") api_key: String = "21497a9fb06426b5c94d0385f8e85ddc",
        @Query("method") method: String = "flickr.photos.search",
        @Query("text") text: String = "",
        @Query("format") format: String = "json",
        @Query("per_page") per_page: Int = 10,
        @Query("page") page: Int = 0,
        @Query("nojsoncallback") nojsoncallback: String = "1"
    ): PhotoResponse

}