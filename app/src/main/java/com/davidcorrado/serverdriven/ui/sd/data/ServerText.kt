package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerText(
    val type: ServerItemType = ServerItemType.TEXT,
    val text: String,
    val modifier: ServerModifier?
)