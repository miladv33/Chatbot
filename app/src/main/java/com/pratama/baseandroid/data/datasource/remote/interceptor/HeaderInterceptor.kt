package com.pratama.baseandroid.data.datasource.remote.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("x-rapidapi-key", "09c0565c62msh214972c9575a8b1p13bc4cjsndc985d96d6a0")
            .build()
        return chain.proceed(request)
    }
}
