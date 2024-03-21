package com.psilva.dailypulse.di

import com.psilva.dailypulse.articles.di.articlesModule
import com.psilva.dailypulse.sources.di.sourcesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule,
    sourcesModule
)