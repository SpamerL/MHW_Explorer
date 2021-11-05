package com.spamerl.monsterhunterworldexplorer.data.remote.model


data class SkillResponse(
    val description: String,
    val id: Int,
    val name: String,
    val ranks: List<Rank>
) {
    data class Rank(
        val description: String,
        val id: Int,
        val level: Int,
        val modifiers: Modifiers,
        val skill: Int,
        val skillName: String
    ) {
        data class Modifiers(
            val affinity: Int,
            val attack: Int
        )
    }
}