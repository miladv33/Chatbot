package com.pratama.baseandroid.data.datasource.remote.model

import com.pratama.baseandroid.domain.entity.News
import com.pratama.baseandroid.domain.entity.NewsSource

data class NewsResponse(
    val cnt: String
)

data class SourceResponse(
    val id: String? = "",
    val name: String? = ""
)


fun toNews(newsResponse: NewsResponse): News {
    return News(newsResponse.cnt)
}

fun toNewsSource(source: SourceResponse): NewsSource {
    return NewsSource(
        id = source.id ?: "",
        name = source.name ?: ""
    )
}