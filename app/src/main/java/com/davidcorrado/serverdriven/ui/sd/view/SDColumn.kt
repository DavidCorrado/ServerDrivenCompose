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
    Column(
        modifier = (serverColumn.modifier?.toModifier(scope)
            ?: Modifier).background(
            serverColumn.color?.toColor() ?: Color.Transparent, shape = RoundedCornerShape(
                Dp(serverColumn.colorCornerRadius ?: 0f)
            )
        ),
        content = content,
        horizontalAlignment = if (serverColumn.alignment == ServerAlignment.CENTER) Alignment.CenterHorizontally else if (serverColumn.alignment == ServerAlignment.END) Alignment.End else Alignment.Start,
        verticalArrangement = if (serverColumn.spacing != null) Arrangement.spacedBy(Dp(serverColumn.spacing)) else Arrangement.Top
    )
}
