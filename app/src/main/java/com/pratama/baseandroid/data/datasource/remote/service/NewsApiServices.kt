package com.pratama.baseandroid.data.datasource.remote.service

import com.pratama.baseandroid.data.datasource.remote.model.TopHeadlineResponse
import com.pratama.baseandroid.domain.entity.News
import com.pratama.baseandroid.ui.homepage.ListNewsFragmentDirections
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiServices {

    @GET("get")
    suspend fun getTopHeadlines(
        @Query("bid") bid: String = "178",
        @Query("key") key: String = "sX5A2PcYZbsN5EY6",
        @Query("uid") uid: String = "mashape",
        @Query("msg") msg: String = "no i am not!"
    ): News
}