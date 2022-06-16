package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerImage(
    val drawableRes: Int, val contentDescription: String?, val modifier: ServerModifier?
)