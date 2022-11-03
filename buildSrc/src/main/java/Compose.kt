object Compose {
    const val bom = "androidx.compose:compose-bom:2022.10.00"
    const val compilerVersion = "1.3.2"

    // UI
    const val ui = "androidx.compose.ui:ui"
    const val material = "androidx.compose.material:material"

    // Android Studio Preview Support
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val uiTooling = "androidx.compose.ui:ui-tooling"

    // UI Tests
    const val uiTestJunit = "androidx.compose.ui:ui-test-junit4"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"

    // Activity
    private const val activityComposeVersion = "1.5.1"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

    // ViewModel
    private const val lifecycleViewModelComposeVersion = "2.5.1"
    const val lifecycleViewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleViewModelComposeVersion"

    // Navigation
    private const val navigationComposeVersion = "2.5.3"
    const val navigationCompose = "androidx.navigation:navigation-compose:$navigationComposeVersion"

    // Hilt
    private const val hiltNavigationComposeVersion = "1.0.0"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"
}