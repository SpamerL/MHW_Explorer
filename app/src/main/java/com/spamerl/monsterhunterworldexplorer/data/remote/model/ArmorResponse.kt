package com.spamerl.monsterhunterworldexplorer.data.remote.model


import com.google.gson.annotations.SerializedName

data class ArmorResponse(
    val armorSet: ArmorSet,
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
    data class ArmorSet(
        val bonus: Any?,
        val id: Int,
        val name: String,
        val pieces: List<Int>,
        val rank: String
    )

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
        class Modifiers
    }
}