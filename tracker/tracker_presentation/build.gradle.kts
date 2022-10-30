apply {
    from("$rootDir/common-ui.gradle")
}

dependencies {
    "implementation"(project(Module.Core))
    "implementation"(project(Module.TrackerDomain))
}