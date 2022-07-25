package com.davidcorrado.serverdriven.ui.sd.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerModifier(
    val paddingStart: Float? = null,
    val paddingEnd: Float? = null,
    val paddingTop: Float? = null,
    val paddingBottom: Float? = null,
    val width: Float? = null,
    val height: Float? = null,
    val weight: Float? = null,
    val backgroundColor: String? = null,
    val cornerRadius: Float? = null,
    val adaText: String? = null,
    val aspectRatio: Float? = null
)