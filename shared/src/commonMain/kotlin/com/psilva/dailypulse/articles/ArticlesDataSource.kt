package com.psilva.dailypulse.articles

import com.psilva.dailypulse.db.DailyPulseDatabase

class ArticlesDataSource(private val database: DailyPulseDatabase) {

    fun getAllArticles(): List<ArticleRaw> =
        database.dailyPulseDatabaseQueries.selectAllArticles(::mapToArticleRaw).executeAsList()

    fun insertArticles(articles: List<ArticleRaw>) {
        database.dailyPulseDatabaseQueries.transaction {
            articles.forEach { article ->
                insertArticle(article)
            }
        }
    }

    private fun insertArticle(article: ArticleRaw) {
        database.dailyPulseDatabaseQueries.insertArticle(
            article.title,
            article.description,
            article.date,
            article.imageURL
        )
    }

    fun clearArticles() = database.dailyPulseDatabaseQueries.removeAllArticles()

    private fun mapToArticleRaw(
        title: String,
        description: String?,
        date: String,
        url: String?
    ) : ArticleRaw = ArticleRaw(title, description, date, url)
}