package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerRow(
    val type: ServerItemType = ServerItemType.ROW,
    val spacing: Float? = null,
    val modifier: ServerModifier? = null,
    val alignment: ServerAlignment? = null,
    val items: List<Any>
)