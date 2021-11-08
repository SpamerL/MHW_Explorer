package com.spamerl.monsterhunterworldexplorer.data.remote.model


import com.google.gson.annotations.SerializedName


data class ArmorListResponseShort(
        val assets: Assets?,
        val id: Int,
        val name: String,
        val type: String
    ) {
        data class Assets(
            val imageFemale: String,
            val imageMale: String
        )
    }