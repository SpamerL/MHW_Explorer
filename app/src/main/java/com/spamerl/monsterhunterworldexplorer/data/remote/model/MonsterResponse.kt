package com.spamerl.monsterhunterworldexplorer.data.remote.model


import com.google.gson.annotations.SerializedName

data class MonsterResponse(
    val ailments: List<Any>,
    val description: String,
    val elements: List<Any>,
    val id: Int,
    val locations: List<Location>,
    val name: String,
    val resistances: List<Any>,
    val rewards: List<Reward>,
    val species: String,
    val type: String,
    val weaknesses: List<Weaknesse>
) {
    data class Location(
        val id: Int,
        val name: String,
        val zoneCount: Int
    )

    data class Reward(
        val conditions: List<Condition>,
        val id: Int,
        val item: Item
    ) {
        data class Condition(
            val chance: Int,
            val quantity: Int,
            val rank: String,
            val subtype: String,
            val type: String
        )

        data class Item(
            val carryLimit: Int,
            val description: String,
            val id: Int,
            val name: String,
            val rarity: Int,
            val value: Int
        )
    }

    data class Weaknesse(
        val condition: Any?,
        val element: String,
        val stars: Int
    )
}