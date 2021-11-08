package com.spamerl.monsterhunterworldexplorer.domain.usecase

import com.spamerl.monsterhunterworldexplorer.data.remote.model.ArmorResponse
import com.spamerl.monsterhunterworldexplorer.data.remote.model.MonsterResponse
import com.spamerl.monsterhunterworldexplorer.data.remote.model.SkillResponse
import com.spamerl.monsterhunterworldexplorer.data.remote.model.WeaponsRespons
import com.spamerl.monsterhunterworldexplorer.domain.repository.Repository
import kotlinx.coroutines.flow.Flow

class GetArmorListUseCase(private val repository: Repository) {
    fun execute(): Flow<List<ArmorResponse>> = repository.getArmorsList()
}

class GetArmorByIdUseCase(private val repository: Repository) {
    fun execute(id: Int): Flow<ArmorResponse> = repository.getArmorById(id)
}

class GetWeaponListUseCase(private val repository: Repository){
    fun execute(): Flow<List<WeaponsRespons>> = repository.getWeaponList()
}

class GetWeaponByIdUseCase(private val repository: Repository) {
    fun execute(id: Int): Flow<WeaponsRespons> = repository.getWeaponById(id)
}

class GetMonsterListUseCase(private val repository: Repository){
    fun execute(): Flow<List<MonsterResponse>> = repository.getMonsterList()
}

class GetMonsterByIdUseCase(private val repository: Repository) {
    fun execute(id: Int): Flow<MonsterResponse> = repository.getMonsterById(id)
}

class GetSkillsListUseCase(private val repository: Repository){
    fun execute(): Flow<List<SkillResponse>> = repository.getSkillsList()
}

class GetSkillByIdUseCase(private val repository: Repository) {
    fun execute(id: Int): Flow<SkillResponse> = repository.getSkillById(id)
}