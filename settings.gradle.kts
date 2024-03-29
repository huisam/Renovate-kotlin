rootProject.name = "renovate"

rootDir
    .walk()
    .maxDepth(1)
    .filter {
        it.name != rootDir.name && it.name != "buildSrc" && it.isDirectory && file("${it.absolutePath}/build.gradle.kts").exists()
    }
    .forEach {
        include("huisam-${it.name}")
        project(":huisam-${it.name}").projectDir = file("$rootDir/${it.name}")
    }


dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}