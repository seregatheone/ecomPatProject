package pat.project.ecompatproject.di.feature_deps

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pat.project.dagger.Dependencies
import pat.project.dagger_annotations.DependenciesKey
import pat.project.ecompatproject.di.AppComponent
import pat.project.ecompatproject.navigation.signup.SignUpNavCommandProviderImpl
import pat.project.signup.presentation.di.SignUpDeps
import pat.project.signup.presentation.navigation.SignUpNavCommandProvider

@Module
interface SignUpDepsModule {
    @Binds
    @IntoMap
    @DependenciesKey(SignUpDeps::class)
    fun bindSignUpScreenDeps(appComponent: AppComponent): Dependencies

    @Binds
    fun bindSignUpNavCommandProvider(signUpNavCommandProviderImpl: SignUpNavCommandProviderImpl): SignUpNavCommandProvider
}