package com.spamerl.monsterhunterworldexplorer.data.remote.model


import com.google.gson.annotations.SerializedName

data class ArmorSetsResponse(
    val bonus: Bonus,
    val id: Int,
    val name: String,
    val pieces: List<Piece>,
    val rank: String
) {
    data class Bonus(
        val id: Int,
        val name: String,
        val ranks: List<Rank>
    ) {
        data class Rank(
            val description: String,
            val pieces: Int,
            val skill: Skill
        ) {
            data class Skill(
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

    data class Piece(
        val armorSet: Int,
        val assets: Assets,
        val attributes: Attributes,
        val crafting: Crafting,
        val defense: Defense,
        val id: Int,
        val name: String,
        val rank: String,
        val rarity: Int,
        val resistances: Resistances,
        val skills: List<Skill>,
        val slots: List<Any>,
        val type: String
    ) {
        data class Assets(
            val imageFemale: String,
            val imageMale: String
        )

        class Attributes

        data class Crafting(
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

        data class Defense(
            val augmented: Int,
            val base: Int,
            val max: Int
        )

        data class Resistances(
            val dragon: Int,
            val fire: Int,
            val ice: Int,
            val thunder: Int,
            val water: Int
        )

        data class Skill(
            val description: String,
            val id: Int,
            val level: Int,
            val modifiers: Modifiers,
            val skill: Int,
            val skillName: String
        ) {
            data class Modifiers(
                val damageFire: Int,
                val resistFire: Int
            )
        }
    }
}