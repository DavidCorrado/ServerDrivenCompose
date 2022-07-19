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
    Row(
        modifier = (serverRow.modifier?.toModifier(scope) ?: Modifier),
        verticalAlignment = if (serverRow.alignment == ServerAlignment.CENTER) Alignment.CenterVertically else if (serverRow.alignment == ServerAlignment.END) Alignment.Bottom else Alignment.Top,
        horizontalArrangement = if (serverRow.spacing != null) Arrangement.spacedBy(Dp(serverRow.spacing)) else Arrangement.Start,
        content = content
    )
}