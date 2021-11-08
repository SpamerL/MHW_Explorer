package com.spamerl.monsterhunterworldexplorer.domain.repository

import com.spamerl.monsterhunterworldexplorer.data.remote.model.*
import kotlinx.coroutines.flow.Flow

interface Repository {
    
    fun getArmorsList(): Flow<List<ArmorResponse>>

    fun getArmorById(id: Int): Flow<ArmorResponse>

    fun getArmorSetList(): Flow<List<ArmorSetsResponse>>

    fun getArmorSetById(id: Int): Flow<ArmorSetsResponse>

    fun getWeaponList(): Flow<List<WeaponsRespons>>

    fun getWeaponById(id: Int): Flow<WeaponsRespons>

    fun getMonsterList(): Flow<List<MonsterResponse>>

    fun getMonsterById(id: Int): Flow<MonsterResponse>

    fun getSkillsList(): Flow<List<SkillResponse>>

    fun getSkillById(id: Int): Flow<SkillResponse>
}