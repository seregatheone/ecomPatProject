// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.application) version Plugins.applicationVersion apply false
    id(Plugins.library) version Plugins.libraryVersion apply false
    id(Plugins.kotlin) version Plugins.kotlinVersion apply false
}
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}


