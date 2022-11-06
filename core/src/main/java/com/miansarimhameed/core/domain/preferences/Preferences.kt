package com.miansarimhameed.core.domain.preferences

import com.miansarimhameed.core.domain.model.ActivityLevel
import com.miansarimhameed.core.domain.model.Gender
import com.miansarimhameed.core.domain.model.GoalType
import com.miansarimhameed.core.domain.model.UserInfo

interface Preferences {
    fun saveAge(age: Int)
    fun saveGender(gender: Gender)
    fun saveHeight(height: Int)
    fun saveWeight(weight: Float)
    fun saveGoalType(goalType: GoalType)
    fun saveActivityLevel(activityLevel: ActivityLevel)
    fun saveCarbRatio(ratio: Float)
    fun saveProteinRatio(ratio: Float)
    fun saveFatRatio(ratio: Float)

    fun loadUserInfo(): UserInfo

    fun saveShouldShowOnboarding(shouldShow: Boolean)
    fun loadShouldShowOnboarding(): Boolean

    companion object {
        const val KEY_AGE = "key_age"
        const val KEY_GENDER = "key_gender"
        const val KEY_HEIGHT = "key_height"
        const val KEY_WEIGHT = "key_weight"
        const val KEY_GOAL_TYPE = "key_goal_type"
        const val KEY_ACTIVITY_LEVEL = "key_activity_level"
        const val KEY_CARB_RATIO = "key_carb_ratio"
        const val KEY_PROTEIN_RATIO = "key_protein_ratio"
        const val KEY_FAT_RATIO = "key_fat_ratio"
        const val KEY_SHOULD_SHOW_ONBOARDING = "key_should_show_onboarding"
    }
}