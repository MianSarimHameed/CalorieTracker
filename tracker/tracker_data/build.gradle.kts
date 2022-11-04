apply {
    from("$rootDir/common.gradle")
}

dependencies {
    // Module
    "implementation"(project(Module.Core))
    "implementation"(project(Module.TrackerDomain))

    // Retrofit
    "implementation"(Retrofit.okHttp)
    "implementation"(Retrofit.retrofit)
    "implementation"(Retrofit.okHttpLoggingInterceptor)
    "implementation"(Retrofit.moshiConverter)
}