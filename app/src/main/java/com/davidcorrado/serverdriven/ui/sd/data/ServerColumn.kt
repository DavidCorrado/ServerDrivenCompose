package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerColumn(
    val type: ServerItemType = ServerItemType.COLUMN,
    val spacing: Float? = null,
    val modifier: ServerModifier? = null,
    val alignment: ServerAlignment? = null,
    val color: String? = null,
    val colorCornerRadius: Float? = null,
    val items: List<Any>
)