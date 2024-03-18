package com.psilva.dailypulse.di

import com.psilva.dailypulse.articles.di.articlesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)