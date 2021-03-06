object Dependencies {
    // SPRING BOOT
    const val springBootStarter = "org.springframework.boot:spring-boot-starter:${PluginVersions.springBoot}"
    const val springBootWeb = "org.springframework.boot:spring-boot-starter-web"

    // Kotlin
    const val kotlinStdlibJdk8Extension = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val kotlinReflection = "org.jetbrains.kotlin:kotlin-reflect"
    
    // mockk
    private const val mockkVersion = "1.11.0"
    const val mockk = "io.mockk:mockk:$mockkVersion"
}
