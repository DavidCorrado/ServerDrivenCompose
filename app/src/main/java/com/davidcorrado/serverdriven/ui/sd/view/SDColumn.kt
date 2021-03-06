package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.davidcorrado.serverdriven.extension.toModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerAlignment
import com.davidcorrado.serverdriven.ui.sd.data.ServerColumn

@Composable
fun SDColumn(
    serverColumn: ServerColumn,
    scope: Any?,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = Modifier.toModifier(serverColumn.modifier, scope),
        content = content,
        horizontalAlignment = if (serverColumn.alignment == ServerAlignment.CENTER) Alignment.CenterHorizontally else if (serverColumn.alignment == ServerAlignment.END) Alignment.End else Alignment.Start,
        verticalArrangement = if (serverColumn.spacing != null) Arrangement.spacedBy(Dp(serverColumn.spacing)) else Arrangement.Top
    )
}
