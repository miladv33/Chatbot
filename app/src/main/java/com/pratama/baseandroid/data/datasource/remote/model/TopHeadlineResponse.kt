package com.pratama.baseandroid.data.datasource.remote.model

import com.pratama.baseandroid.domain.entity.News

data class TopHeadlineResponse(
    val cnt: String
)

fun TopHeadlineResponse.toNewsList(): News {
    val listNews = News("")
    return listNews
}

