apply {
    from("$rootDir/common.gradle")
}

dependencies {
    "implementation"(project(Module.Core))
}