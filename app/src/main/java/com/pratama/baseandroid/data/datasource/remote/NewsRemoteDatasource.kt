package com.pratama.baseandroid.data.datasource.remote

import com.pratama.baseandroid.domain.entity.News

interface NewsRemoteDatasource {
    suspend fun getTopHeadlines(): News
}