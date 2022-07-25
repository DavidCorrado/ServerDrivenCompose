package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerBox(
    val type: ServerItemType = ServerItemType.BOX,
    val modifier: ServerModifier? = null,
    val items: List<Any>
)