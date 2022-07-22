package com.davidcorrado.serverdriven.extension

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import com.davidcorrado.serverdriven.ui.sd.data.ServerModifier

fun Modifier.modifyIf(condition: Boolean, modify: Modifier.() -> Modifier) =
    if (condition) modify() else this

fun Modifier.weightWithScope(scope: Any?, wt: Float?): Modifier {
    when (scope) {
        is ColumnScope -> {
            with(scope) {
                if (wt == null) {
                    return weight(1f, false)
                } else {
                    return weight(wt)
                }
            }
        }
        is RowScope -> {
            with(scope) {
                if (wt == null) {
                    return weight(1f, false)
                } else {
                    return weight(wt)
                }
            }
        }
        else -> {
            Log.e("DavidData", "DavidErrorWeightNotFound")
        }
    }
    return this
}

fun Modifier.toModifier(serverModifier: ServerModifier?, scope: Any?): Modifier {
    return Modifier
        .modifyIf(serverModifier?.weight != null) { weightWithScope(scope, serverModifier?.weight) }
        .modifyIf(serverModifier?.width != null) {
            width(
                Dp(
                    serverModifier?.width!! + (serverModifier.paddingStart
                        ?: 0f) + (serverModifier.paddingEnd ?: 0f)
                )
            )
        }
        .modifyIf(serverModifier?.height != null) {
            height(
                Dp(
                    serverModifier?.height!! + (serverModifier.paddingTop
                        ?: 0f) + (serverModifier.paddingBottom ?: 0f)
                )
            )
        }
        .modifyIf(serverModifier?.backgroundColor != null) {
            background(
                serverModifier?.backgroundColor!!.toColor(),
                RoundedCornerShape(Dp(serverModifier.cornerRadius ?: 0f))
            )
        }
        .modifyIf(serverModifier?.cornerRadius != null) { clip(RoundedCornerShape(Dp(serverModifier?.cornerRadius!!))) }
        .modifyIf(serverModifier?.paddingStart != null) { padding(start = Dp(serverModifier?.paddingStart!!)) }
        .modifyIf(serverModifier?.paddingEnd != null) { padding(end = Dp(serverModifier?.paddingEnd!!)) }
        .modifyIf(serverModifier?.paddingTop != null) { padding(top = Dp(serverModifier?.paddingTop!!)) }
        .modifyIf(serverModifier?.paddingBottom != null) { padding(bottom = Dp(serverModifier?.paddingBottom!!)) }
}