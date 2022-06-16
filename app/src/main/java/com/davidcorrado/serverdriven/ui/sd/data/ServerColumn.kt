package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerColumn(
    val type: ServerItemType = ServerItemType.COLUMN,
    val modifier: ServerModifier? = null,
    val alignment: ServerAlignment?= null,
    val items: List<Any>
)