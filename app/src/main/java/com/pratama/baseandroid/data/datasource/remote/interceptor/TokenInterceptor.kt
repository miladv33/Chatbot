package com.pratama.baseandroid.data.datasource.remote.interceptor

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

/**
 * https://www.lordcodes.com/articles/authorization-of-web-requests-for-okhttp-and-retrofit
 */
class TokenInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val newRequest = chain.request().signedRequest()
        return chain.proceed(newRequest)
    }

    private fun Request.signedRequest(): Request {
        // todo: setup repository for fetch access token
//        val accessToken = authorizationRepository.fetchFreshAccessToken()
        return newBuilder()
            .header("x-rapidapi-key", "09c0565c62msh214972c9575a8b1p13bc4cjsndc985d96d6a0")
            .build()
    }
}
