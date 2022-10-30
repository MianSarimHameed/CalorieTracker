apply {
    from("$rootDir/common.gradle")
}

dependencies {
    "implementation"(project(Module.Core))
    "implementation"(project(Module.TrackerDomain))
}