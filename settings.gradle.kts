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
include(":feature:cart")
include(":core:home-api")
include(":core:home-api-interface")
include(":network-utils")
include(":feature:product_detailed")
include(":core:cart-api")
include(":core:cart-api-interface")
include(":core:product-detailed-api")
include(":core:product-detailed-api-interface")
