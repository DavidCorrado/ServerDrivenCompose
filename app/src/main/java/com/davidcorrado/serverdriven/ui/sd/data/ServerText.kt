package com.davidcorrado.serverdriven.ui.sd.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.davidcorrado.serverdriven.extension.toColor
import com.squareup.moshi.JsonClass

private const val DEFAULT_WEIGHT = "400"
private const val DEFAULT_SIZE = 16

@JsonClass(generateAdapter = true)
data class ServerText(
    val type: ServerItemType = ServerItemType.TEXT,
    val text: String,
    val size: Int? = null,
    val style: FontType? = null,
    val color: String? = null,
    val decoration: List<DecorationType>? = null,
    val weight: String? = null,
    val isHeading: Boolean? = null,
    val modifier: ServerModifier?
) {
    fun getTextStyle() =
        TextStyle(
            fontWeight = FontWeight(weight?.toInt() ?: DEFAULT_WEIGHT.toInt()),
            fontSize = (size ?: DEFAULT_SIZE).sp,
            fontStyle = style?.fontStyle ?: FontType.NORMAL.fontStyle,
            color = color?.toColor() ?: Color.Black,
            textDecoration = decoration?.let { decoration -> TextDecoration.combine(decoration.map { it.textDecoration }) }
        )

    fun isHeading() = isHeading ?: false
}

enum class DecorationType(val textDecoration: TextDecoration) {
    STRIKETHROUGH(TextDecoration.LineThrough),
    UNKNOWN(TextDecoration.None)
}

enum class FontType(val fontStyle: FontStyle) {
    NORMAL(FontStyle.Normal),
    ITALIC(FontStyle.Italic),
    UNKNOWN(FontStyle.Normal)
}