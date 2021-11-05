package com.spamerl.monsterhunterworldexplorer.data.remote.model


import com.google.gson.annotations.SerializedName

data class CharmResponse(
    val id: Int,
    val name: String,
    val ranks: List<Rank>
) {
    data class Rank(
        val crafting: Crafting,
        val level: Int,
        val name: String,
        val rarity: Int,
        val skills: List<Skill>
    ) {
        data class Crafting(
            val craftable: Boolean,
            val materials: List<Material>
        ) {
            data class Material(
                val item: Item,
                val quantity: Int
            ) {
                data class Item(
                    val carryLimit: Int,
                    val description: String,
                    val id: Int,
                    val name: String,
                    val rarity: Int,
                    val value: Int
                )
            }
        }

        data class Skill(
            val description: String,
            val id: Int,
            val level: Int,
            val modifiers: Modifiers,
            val skill: Int,
            val skillName: String
        ) {
            class Modifiers
        }
    }
}