package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.davidcorrado.serverdriven.ui.sd.data.ServerAlignment
import com.davidcorrado.serverdriven.ui.sd.data.ServerRow

@Composable
fun SDRow(
    serverRow: ServerRow,
    scope: Any?,
    content: @Composable RowScope.() -> Unit
) {
    val verticalAlignment = when (serverRow.alignment) {
        ServerAlignment.CENTER_START, ServerAlignment.CENTER_CENTER, ServerAlignment.CENTER_END -> {
            Alignment.CenterVertically
        }
        ServerAlignment.BOTTOM_START, ServerAlignment.BOTTOM_CENTER, ServerAlignment.BOTTOM_END -> {
            Alignment.Bottom
        }
        else -> {
            Alignment.Top
        }
    }
    val horizontalAlignment = when (serverRow.alignment) {
        ServerAlignment.TOP_CENTER, ServerAlignment.CENTER_CENTER, ServerAlignment.BOTTOM_CENTER -> {
            Alignment.CenterHorizontally
        }
        ServerAlignment.TOP_END, ServerAlignment.CENTER_END, ServerAlignment.BOTTOM_END -> {
            Alignment.End
        }
        else -> {
            Alignment.Start
        }
    }
    Row(
        modifier = (serverRow.modifier?.toModifier(scope) ?: Modifier),
        verticalAlignment = verticalAlignment,
        horizontalArrangement = Arrangement.spacedBy(
            Dp(serverRow.spacing ?: 0f),
            horizontalAlignment
        ),
        content = content
    )
}