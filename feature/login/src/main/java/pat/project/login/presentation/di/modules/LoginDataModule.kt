package pat.project.login.presentation.di.modules

import dagger.Binds
import dagger.Module
import pat.project.login.data.LoginApiRepository
import pat.project.login.data.LoginApiRepositoryImpl

@Module
interface LoginDataModule {
    @Binds
    fun bindLoginApiRepository(loginApiRepository : LoginApiRepositoryImpl) : LoginApiRepository
}