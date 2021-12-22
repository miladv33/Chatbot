package com.pratama.baseandroid.domain.entity

import com.pratama.baseandroid.ui.dto.NewsDto

data class News(
    val cnt: String,

)


fun News.toDto(): NewsDto {
    return with(this) {
        NewsDto(cnt)
    }
}