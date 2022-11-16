package pat.project.home.presentation.di.modules

import dagger.Binds
import dagger.Module
import pat.project.home.data.HomeApiRepository
import pat.project.home.data.HomeApiRepositoryImpl

@Module
interface HomeDataModule {
    @Binds
    fun bindHomeApiRepository(homeApiRepository : HomeApiRepositoryImpl) : HomeApiRepository
}