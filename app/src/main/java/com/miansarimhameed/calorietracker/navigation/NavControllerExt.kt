package com.miansarimhameed.calorietracker.navigation

import androidx.navigation.NavController
import com.miansarimhameed.core.util.UiEvent

fun NavController.navigate(uiEvent: UiEvent.Navigate) {
    this.navigate(uiEvent.route)
}