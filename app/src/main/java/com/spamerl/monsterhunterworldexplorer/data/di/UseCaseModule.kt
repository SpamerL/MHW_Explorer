package com.spamerl.monsterhunterworldexplorer.data.di

import com.spamerl.monsterhunterworldexplorer.domain.repository.Repository
import com.spamerl.monsterhunterworldexplorer.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    @ViewModelScoped
    fun provideGetArmorListUseCase(repository: Repository) = GetArmorListUseCase(repository = repository)

    @Provides
    @ViewModelScoped
    fun provideGetArmorByIdUseCase(repository: Repository) = GetArmorByIdUseCase(repository = repository)

    @Provides
    @ViewModelScoped
    fun provideGetWeaponListUseCase(repository: Repository) = GetWeaponListUseCase(repository = repository)

    @Provides
    @ViewModelScoped
    fun provideGetWeaponByIdUseCase(repository: Repository) = GetWeaponByIdUseCase(repository = repository)

    @Provides
    @ViewModelScoped
    fun provideGetMonsterListUseCase(repository: Repository) = GetMonsterListUseCase(repository = repository)

    @Provides
    @ViewModelScoped
    fun provideGetMonsterByIdUseCase(repository: Repository) = GetMonsterByIdUseCase(repository = repository)

    @Provides
    @ViewModelScoped
    fun provideGetSkillsListUseCase(repository: Repository) = GetSkillsListUseCase(repository = repository)

    @Provides
    @ViewModelScoped
    fun provideGetSkillByIdUseCase(repository: Repository) = GetSkillByIdUseCase(repository = repository)
}