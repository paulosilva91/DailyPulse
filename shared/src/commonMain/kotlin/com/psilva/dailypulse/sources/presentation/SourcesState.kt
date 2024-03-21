package com.psilva.dailypulse.sources.presentation

import com.psilva.dailypulse.sources.app.Source

data class SourcesState (
    val sources: List<Source>,
    val loading: Boolean = false,
    val error: String? = null
)