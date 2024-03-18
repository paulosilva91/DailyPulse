package com.psilva.dailypulse.articles.di

import com.psilva.dailypulse.articles.ArticlesDataSource
import com.psilva.dailypulse.articles.ArticlesRepository
import com.psilva.dailypulse.articles.ArticlesService
import com.psilva.dailypulse.articles.ArticlesUseCase
import com.psilva.dailypulse.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}
