package com.miansarimhameed.tracker_presentation.search

import com.miansarimhameed.tracker_domain.model.TrackableFood

data class TrackableFoodUiState(
    val food: TrackableFood,
    val isExpanded: Boolean = false,
    val amount: String = ""
)
