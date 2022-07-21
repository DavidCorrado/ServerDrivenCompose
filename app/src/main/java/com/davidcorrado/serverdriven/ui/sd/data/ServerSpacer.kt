package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerSpacer(
    val type: ServerItemType = ServerItemType.SPACER,
    val modifier: ServerModifier? = null
)