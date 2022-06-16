package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerAlignment
import com.davidcorrado.serverdriven.ui.sd.data.ServerColumn

@Composable
fun SDColumn(serverColumn: ServerColumn , content: @Composable ColumnScope.() -> Unit){
    Column(modifier = serverColumn.modifier?.toModifier() ?: Modifier,content = content, horizontalAlignment = if (serverColumn.alignment == ServerAlignment.CENTER) Alignment.CenterHorizontally else Alignment.Start)
}
