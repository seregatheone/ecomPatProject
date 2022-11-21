package pat.project.dagger_annotations


import dagger.MapKey
import pat.project.dagger.Dependencies
import kotlin.reflect.KClass

@MapKey
annotation class DependenciesKey(val value: KClass<out Dependencies>)
