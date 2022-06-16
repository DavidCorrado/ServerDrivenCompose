package com.davidcorrado.serverdriven.ui.sd.data

import androidx.compose.ui.graphics.Color
import com.davidcorrado.serverdriven.extension.toColor
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerBubble(
    val type: ServerItemType = ServerItemType.BUBBLE,
    val text: ServerText,
    val textADA: String? = null,
    val drawableRes: Int? = null,
    val backgroundColor: String? = null,
    val strokeColor: String? = null,
    val modifier: ServerModifier? = null,
) {

    fun getBackgroundColor() = backgroundColor?.toColor() ?: Color.White

    fun getStrokeColor() = strokeColor?.toColor() ?: getBackgroundColor()

    fun getTextAda() = textADA ?: text.text
}