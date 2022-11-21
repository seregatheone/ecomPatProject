package pat.project.dagger

interface Dependencies

typealias DepsMap = Map<Class<out Dependencies>, @JvmSuppressWildcards Dependencies>

interface HasDependencies {
    val depsMap: DepsMap
}

