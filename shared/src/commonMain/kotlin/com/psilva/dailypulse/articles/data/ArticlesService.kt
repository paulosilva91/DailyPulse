package com.psilva.dailypulse.articles.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesService(private val httpClient: HttpClient) {
    private val country = "pt"
    private val category = "business"
    private val apiKey = "b0c3e37a04ae403b8e3b1044ed24d491"

    suspend fun fetchArticles(): List<ArticleRaw> {
        val response: ArticlesResponse = httpClient.get(
            "https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey"
        ).body()

        return response.articles
    }
}