package com.davidcorrado.serverdriven.ui.sd.data

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.davidcorrado.serverdriven.extension.modifyIf
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
    val weight: Float? = null
) {
    fun toModifier(scope: Any?): Modifier {
        return Modifier
            .modifyIf(paddingStart != null) { padding(start = Dp(paddingStart!!)) }
            .modifyIf(paddingEnd != null) { padding(end = Dp(paddingEnd!!)) }
            .modifyIf(paddingTop != null) { padding(top = Dp(paddingTop!!)) }
            .modifyIf(paddingBottom != null) { padding(bottom = Dp(paddingBottom!!)) }
            .modifyIf(width != null && height != null) { width(Dp(width!!)).height(Dp(height!!)) }
            .modifyIf(weight != null) { weightWithScope(scope, weight!!) }
    }
}