package com.psilva.dailypulse.android.di

import com.psilva.dailypulse.articles.presentation.ArticlesViewModel
import com.psilva.dailypulse.sources.presentation.SourcesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { ArticlesViewModel(get()) }
    viewModel { SourcesViewModel(get()) }
}