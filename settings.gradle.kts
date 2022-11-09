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
    ":feature:splashscreen",
).forEach {
    include(it)
}
