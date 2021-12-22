package com.pratama.baseandroid.data.datasource.remote

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.pratama.baseandroid.data.datasource.remote.model.NewsResponse
import com.pratama.baseandroid.data.datasource.remote.model.SourceResponse
import com.pratama.baseandroid.data.datasource.remote.model.TopHeadlineResponse
import com.pratama.baseandroid.data.datasource.remote.service.NewsApiServices
import com.pratama.baseandroid.domain.entity.News
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NewsRemoteDatasourceImplTest {

    @Rule
    @JvmField
    val instantExecutorRule = InstantTaskExecutorRule()

    lateinit var newsRemoteDatasourceImpl: NewsRemoteDatasourceImpl

    @MockK
    lateinit var service: NewsApiServices

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        newsRemoteDatasourceImpl = NewsRemoteDatasourceImpl(service)
    }

    @Test
    fun `test getTopHeadlines should return list news`() = runBlockingTest {
        // given
        val category = "technology"
        val country = "us"

        coEvery { service.getTopHeadlines() } returns generateFakeNews()

        // when
        val result = newsRemoteDatasourceImpl.getTopHeadlines()

        coVerify { service.getTopHeadlines() }

        assertEquals(1, result)
    }

    private fun generateFakeNews(): News {
        return News("")
    }
}