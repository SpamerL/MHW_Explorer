package com.spamerl.monsterhunterworldexplorer.data.remote.model


import com.google.gson.annotations.SerializedName

data class WeaponsRespons(
    val assets: Assets,
    val attack: Attack,
    val attributes: Attributes,
    val crafting: Crafting,
    val damageType: String,
    val durability: List<Durability>,
    val elderseal: Any?,
    val elements: List<Any>,
    val id: Int,
    val name: String,
    val rarity: Int,
    val slots: List<Any>,
    val type: String
) {
    data class Assets(
        val icon: String,
        val image: String
    )

    data class Attack(
        val display: Int,
        val raw: Int
    )

    class Attributes

    data class Crafting(
        val branches: List<Int>,
        val craftable: Boolean,
        val craftingMaterials: List<CraftingMaterial>,
        val previous: Any?,
        val upgradeMaterials: List<Any>
    ) {
        data class CraftingMaterial(
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

    data class Durability(
        val blue: Int,
        val green: Int,
        val orange: Int,
        val purple: Int,
        val red: Int,
        val white: Int,
        val yellow: Int
    )
}