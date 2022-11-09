pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

rootProject.name = "ecomPatProject"

listOf(
    ":app",
    ":core:ui",
    ":core:dagger",
    ":core:dagger-annotations",
).forEach {
    include(it)
}
