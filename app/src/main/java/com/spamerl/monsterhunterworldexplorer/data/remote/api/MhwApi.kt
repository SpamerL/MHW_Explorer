package com.spamerl.monsterhunterworldexplorer.data.remote.api

import com.spamerl.monsterhunterworldexplorer.data.remote.model.*
import retrofit2.http.GET
import retrofit2.http.Path

interface MhwApi {

    companion object {
       const val BASE_URL = "https://mhw-db.com"
    }

    @GET("/armor")
    suspend fun getArmorList(): List<ArmorResponse>

    @GET("/armor/{id}")
    suspend fun getArmorById(@Path("id")id: Int): ArmorResponse

    @GET("/armor/sets")
    suspend fun getArmorSetsList(): List<ArmorSetsResponse>

    @GET("/armor/sets/{id}")
    suspend fun getArmorSetsById(@Path("id")id: Int): ArmorSetsResponse

    @GET("/weapon")
    suspend fun getWeaponList(): List<WeaponsRespons>

    @GET("/weapon/{id}")
    suspend fun getWeaponById(@Path("id")id: Int): WeaponsRespons

    @GET("/monsters")
    suspend fun getMonsterList(): List<MonsterResponse>

    @GET("/monsters/{id}")
    suspend fun getMonsterById(@Path("id")id: Int): MonsterResponse

    @GET("/charm")
    suspend fun getCharmList(): List<CharmResponse>

    @GET("/charm/{id}")
    suspend fun getCharmById(@Path("id")id: Int): CharmResponse

    @GET("/skill")
    suspend fun getSkillsList(): List<SkillResponse>

    @GET("/skill/{id}")
    suspend fun getSkillById(@Path("id")id: Int): SkillResponse
}