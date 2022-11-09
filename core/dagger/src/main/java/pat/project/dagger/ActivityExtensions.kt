package pat.project.dagger

import android.app.Activity

inline fun <reified D : Dependencies> Activity.findDependencies(): D {
    return findDependenciesByClass(D::class.java)
}

@Suppress("UNCHECKED_CAST")
fun <D : Dependencies> Activity.findDependenciesByClass(clazz: Class<D>): D {
    return depsApplication?.depsMap?.get(clazz) as? D ?: throw IllegalStateException("No Dependencies $clazz in application")
}

internal val Activity.depsApplication: HasDependencies?
    get() = application as? HasDependencies
