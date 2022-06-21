package com.davidcorrado.serverdriven.extension

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.ui.Modifier

fun Modifier.modifyIf(condition: Boolean, modify: Modifier.() -> Modifier) =
    if (condition) modify() else this

fun Modifier.weightWithScope(scope: Any?, wt: Float): Modifier {
    if (scope is ColumnScope) {
        with(scope) {
            return weight(wt)
        }
    } else if (scope is RowScope) {
        with(scope) {
            return weight(wt)
        }
    }
    return this
}