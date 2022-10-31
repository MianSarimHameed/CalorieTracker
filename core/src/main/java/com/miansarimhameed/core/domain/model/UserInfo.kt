package com.miansarimhameed.core.domain.model

data class UserInfo(
    val age: Int,
    val gender: Gender,
    val height: Int,
    val weight: Float,
    val goalType: GoalType,
    val activityLevel: ActivityLevel,
    val carbRatio: Float,
    val proteinRatio: Float,
    val fatRatio: Float
)
