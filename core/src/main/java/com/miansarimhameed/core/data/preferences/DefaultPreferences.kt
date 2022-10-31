package com.miansarimhameed.core.data.preferences

import android.content.SharedPreferences
import com.miansarimhameed.core.domain.model.ActivityLevel
import com.miansarimhameed.core.domain.model.Gender
import com.miansarimhameed.core.domain.model.GoalType
import com.miansarimhameed.core.domain.model.UserInfo
import com.miansarimhameed.core.domain.preferences.Preferences

class DefaultPreferences(
    private val sharedPreferences: SharedPreferences
) : Preferences {
    override fun saveAge(age: Int) {
        sharedPreferences.edit()
            .putInt(Preferences.KEY_AGE, age)
            .apply()
    }

    override fun saveGender(gender: Gender) {
        sharedPreferences.edit()
            .putString(Preferences.KEY_GENDER, gender.name)
            .apply()
    }

    override fun saveHeight(height: Int) {
        sharedPreferences.edit()
            .putInt(Preferences.KEY_HEIGHT, height)
            .apply()
    }

    override fun saveWeight(weight: Float) {
        sharedPreferences.edit()
            .putFloat(Preferences.KEY_WEIGHT, weight)
            .apply()
    }

    override fun saveGoalType(goalType: GoalType) {
        sharedPreferences.edit()
            .putString(Preferences.KEY_GOAL_TYPE, goalType.name)
            .apply()
    }

    override fun saveActivityLevel(activityLevel: ActivityLevel) {
        sharedPreferences.edit()
            .putString(Preferences.KEY_ACTIVITY_LEVEL, activityLevel.name)
            .apply()
    }

    override fun saveCarbRatio(ratio: Float) {
        sharedPreferences.edit()
            .putFloat(Preferences.KEY_CARB_RATIO, ratio)
            .apply()
    }

    override fun saveProteinRatio(ratio: Float) {
        sharedPreferences.edit()
            .putFloat(Preferences.KEY_PROTEIN_RATIO, ratio)
            .apply()
    }

    override fun saveFatRatio(ratio: Float) {
        sharedPreferences.edit()
            .putFloat(Preferences.KEY_FAT_RATIO, ratio)
            .apply()
    }

    override fun loadUserInfo(): UserInfo {
        val age = sharedPreferences.getInt(Preferences.KEY_AGE, -1)
        val gender = sharedPreferences.getString(Preferences.KEY_GENDER, null)
        val height = sharedPreferences.getInt(Preferences.KEY_HEIGHT, -1)
        val weight = sharedPreferences.getFloat(Preferences.KEY_WEIGHT, -1.0F)
        val goalType = sharedPreferences.getString(Preferences.KEY_GOAL_TYPE, null)
        val activityLevel = sharedPreferences.getString(Preferences.KEY_ACTIVITY_LEVEL, null)
        val carbRatio = sharedPreferences.getFloat(Preferences.KEY_CARB_RATIO, -1.0F)
        val proteinRatio = sharedPreferences.getFloat(Preferences.KEY_CARB_RATIO, -1.0F)
        val fatRatio = sharedPreferences.getFloat(Preferences.KEY_CARB_RATIO, -1.0F)

        return UserInfo(
            age = age,
            gender = Gender.fromString(gender ?: "male"),
            height = height,
            weight = weight,
            goalType = GoalType.fromString(goalType ?: "keep_weight"),
            activityLevel = ActivityLevel.fromString(activityLevel ?: "medium"),
            carbRatio = carbRatio,
            proteinRatio = proteinRatio,
            fatRatio = fatRatio
        )
    }
}