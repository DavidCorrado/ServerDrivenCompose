package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.davidcorrado.serverdriven.extension.toColor
import com.davidcorrado.serverdriven.ui.sd.data.ServerAlignment
import com.davidcorrado.serverdriven.ui.sd.data.ServerColumn

@Composable
fun SDColumn(
    serverColumn: ServerColumn,
    scope: Any?,
    content: @Composable ColumnScope.() -> Unit
) {
    val horizontalAlignment = when (serverColumn.alignment) {
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
    val verticalAlignment = when (serverColumn.alignment) {
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
    Column(
        modifier = (serverColumn.modifier?.toModifier(scope)
            ?: Modifier).background(
            serverColumn.color?.toColor() ?: Color.Transparent, shape = RoundedCornerShape(
                Dp(serverColumn.colorCornerRadius ?: 0f)
            )
        ),
        content = content,
        horizontalAlignment = horizontalAlignment,
        verticalArrangement = Arrangement.spacedBy(
            Dp(serverColumn.spacing ?: 0f),
            verticalAlignment
        )
    )
}
