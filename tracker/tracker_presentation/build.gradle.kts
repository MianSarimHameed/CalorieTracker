apply {
    from("$rootDir/common-ui.gradle")
}

dependencies {
    // Module
    "implementation"(project(Module.Core))
    "implementation"(project(Module.CoreUi))
    "implementation"(project(Module.TrackerDomain))

    // Coil
    "implementation"(Coil.coilCompose)
}