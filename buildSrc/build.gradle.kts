import org.gradle.kotlin.dsl.`kotlin-dsl`
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins{
    `kotlin-dsl`
}

afterEvaluate {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            apiVersion = "1.5"
            languageVersion = "1.5"
        }
    }
}

repositories {
    mavenCentral()
}