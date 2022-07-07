package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerImage(
    val type: ServerItemType = ServerItemType.IMAGE,
    val drawableRes: Int,
    val adaText: String? = null,
    val modifier: ServerModifier? = null,
    val width: Float,
    val height: Float
)