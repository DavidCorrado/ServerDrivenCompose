package com.davidcorrado.serverdriven.extension

import android.util.Log
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.ui.Modifier

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