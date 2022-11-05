package com.miansarimhameed.tracker_domain.di

import com.miansarimhameed.core.domain.preferences.Preferences
import com.miansarimhameed.tracker_domain.repository.TrackerRepository
import com.miansarimhameed.tracker_domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class TrackerDomainModule {
    @Provides
    @ViewModelScoped
    fun provideTrackerUseCases(
        preferences: Preferences,
        repository: TrackerRepository
    ): TrackerUseCases {
        return TrackerUseCases(
            trackFood = TrackFood(repository),
            searchFood = SearchFood(repository),
            getFoodsForDate = GetFoodsForDate(repository),
            deleteTrackedFood = DeleteTrackedFood(repository),
            calculateMealNutrients = CalculateMealNutrients(preferences)
        )
    }
}