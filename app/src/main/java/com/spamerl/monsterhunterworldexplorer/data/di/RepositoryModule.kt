package com.spamerl.monsterhunterworldexplorer.data.di

import com.spamerl.monsterhunterworldexplorer.data.remote.api.MhwApi
import com.spamerl.monsterhunterworldexplorer.data.repository.RepositoryImpl
import com.spamerl.monsterhunterworldexplorer.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(api: MhwApi): Repository =
        RepositoryImpl(api)
}