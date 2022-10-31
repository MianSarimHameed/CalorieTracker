package com.miansarimhameed.core.domain.model

sealed class ActivityLevel(val name: String) {
    object Low : ActivityLevel("low")
    object Medium: ActivityLevel("medium")
    object High: ActivityLevel("high")

    companion object {
        fun fromString(name: String): ActivityLevel {
            return when(name) {
                "low" -> Low
                "medium" -> Medium
                "hugh" -> High
                else -> Medium
            }
        }
    }
}
