package com.psilva.dailypulse.articles.presentation

import com.psilva.dailypulse.articles.app.Article

data class ArticlesState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)
