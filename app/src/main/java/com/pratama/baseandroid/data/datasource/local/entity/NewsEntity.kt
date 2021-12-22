package com.pratama.baseandroid.data.datasource.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pratama.baseandroid.domain.entity.News
import com.pratama.baseandroid.domain.entity.NewsSource

@Entity(tableName = "News")
data class NewsEntity(
    val cnt: String
) {
    @PrimaryKey(autoGenerate = true)
    var newsId: Int = 0
}

fun News.toNewsEntity(): NewsEntity {
    return NewsEntity(this.cnt)
}

fun NewsEntity.toNews(): News {
    return News(this.cnt)
}
