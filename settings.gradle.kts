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
    ":core:navigation",
    ":feature:home",
).forEach {
    include(it)
}
