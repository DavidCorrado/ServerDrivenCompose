package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerRow(
    val type: ServerItemType = ServerItemType.ROW,
    val modifier: ServerModifier?,
    val alignment: ServerAlignment?,
    val items: List<Any>
)