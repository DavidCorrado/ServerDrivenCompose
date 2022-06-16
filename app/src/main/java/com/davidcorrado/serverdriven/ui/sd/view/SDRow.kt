package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SDRow(modifier: Modifier, verticalAlignment: Alignment.Vertical, content: @Composable RowScope.() -> Unit){
    Row(modifier = modifier, verticalAlignment = verticalAlignment, content=content)
}