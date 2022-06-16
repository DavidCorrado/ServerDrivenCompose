package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerAlignment
import com.davidcorrado.serverdriven.ui.sd.data.ServerRow

@Composable
fun SDRow(serverRow: ServerRow, content: @Composable RowScope.() -> Unit){
    Row(modifier = serverRow.modifier?.toModifier()?: Modifier, verticalAlignment = if (serverRow.alignment == ServerAlignment.CENTER) Alignment.CenterVertically else Alignment.Top, content=content)
}