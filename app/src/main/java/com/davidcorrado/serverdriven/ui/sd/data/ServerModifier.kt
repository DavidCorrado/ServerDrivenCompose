package com.davidcorrado.serverdriven.ui.sd.data

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import com.davidcorrado.serverdriven.extension.modifyIf
import com.davidcorrado.serverdriven.extension.toColor
import com.davidcorrado.serverdriven.extension.weightWithScope
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
) {
    fun toModifier(scope: Any?): Modifier {
        return Modifier
            .modifyIf(weight != null) { weightWithScope(scope, weight!!) }
            .modifyIf(width != null) { width(Dp(width!!+(paddingStart ?:0f) + (paddingEnd ?: 0f))) }
            .modifyIf(height != null) { height(Dp(height!!+(paddingTop?:0f) + (paddingBottom ?: 0f))) }
            .modifyIf(backgroundColor != null) {
                background(
                    backgroundColor!!.toColor(),
                    RoundedCornerShape(Dp(cornerRadius ?: 0f))
                )
            }
            .modifyIf(cornerRadius != null) { clip(RoundedCornerShape(Dp(cornerRadius!!))) }
            .modifyIf(paddingStart != null) { padding(start = Dp(paddingStart!!)) }
            .modifyIf(paddingEnd != null) { padding(end = Dp(paddingEnd!!)) }
            .modifyIf(paddingTop != null) { padding(top = Dp(paddingTop!!)) }
            .modifyIf(paddingBottom != null) { padding(bottom = Dp(paddingBottom!!)) }
    }
}