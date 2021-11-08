package com.spamerl.monsterhunterworldexplorer.data.repository

import com.spamerl.monsterhunterworldexplorer.data.remote.api.MhwApi
import com.spamerl.monsterhunterworldexplorer.data.remote.model.*
import com.spamerl.monsterhunterworldexplorer.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

open class RepositoryImpl(private val api: MhwApi): Repository {
    override fun getArmorsList(): Flow<List<ArmorResponse>> = flow { emit(api.getArmorList())}

    override fun getArmorById(id: Int): Flow<ArmorResponse> = flow { emit(api.getArmorById(id))}

    override fun getArmorSetList(): Flow<List<ArmorSetsResponse>> = flow { emit(api.getArmorSetsList())}

    override fun getArmorSetById(id: Int): Flow<ArmorSetsResponse> = flow { emit(api.getArmorSetsById(id))}

    override fun getWeaponList(): Flow<List<WeaponsRespons>> = flow { emit(api.getWeaponList())}

    override fun getWeaponById(id: Int): Flow<WeaponsRespons> = flow { emit(api.getWeaponById(id))}

    override fun getMonsterList(): Flow<List<MonsterResponse>> = flow { emit(api.getMonsterList())}

    override fun getMonsterById(id: Int): Flow<MonsterResponse> = flow { emit(api.getMonsterById(id))}

    override fun getSkillsList(): Flow<List<SkillResponse>> = flow { emit(api.getSkillsList())}

    override fun getSkillById(id: Int): Flow<SkillResponse> = flow { emit(api.getSkillById(id))}

}