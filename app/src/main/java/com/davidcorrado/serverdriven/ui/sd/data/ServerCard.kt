package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerCard(
    val type: ServerItemType = ServerItemType.CARD,
    val modifier: ServerModifier?,
    val items: List<Any>
)