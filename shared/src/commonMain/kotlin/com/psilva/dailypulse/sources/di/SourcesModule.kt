package com.psilva.dailypulse.sources.di

import com.psilva.dailypulse.sources.app.SourcesUseCase
import com.psilva.dailypulse.sources.data.SourcesDataSource
import com.psilva.dailypulse.sources.data.SourcesRepository
import com.psilva.dailypulse.sources.data.SourcesService
import com.psilva.dailypulse.sources.presentation.SourcesViewModel
import org.koin.dsl.module

val sourcesModule = module {

    single<SourcesService> { SourcesService(get()) }
    single<SourcesUseCase> { SourcesUseCase(get()) }
    single<SourcesDataSource> { SourcesDataSource(get()) }
    single<SourcesRepository> { SourcesRepository(get(), get()) }
    single<SourcesViewModel> { SourcesViewModel(get()) }
}