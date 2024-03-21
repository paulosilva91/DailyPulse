package com.psilva.dailypulse.articles.di

import com.psilva.dailypulse.articles.data.ArticlesDataSource
import com.psilva.dailypulse.articles.data.ArticlesRepository
import com.psilva.dailypulse.articles.data.ArticlesService
import com.psilva.dailypulse.articles.app.ArticlesUseCase
import com.psilva.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}
