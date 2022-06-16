package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SDColumn(modifier: Modifier, horizontalAlignment: Alignment.Horizontal , content: @Composable ColumnScope.() -> Unit){
    Column(modifier = modifier,content = content, horizontalAlignment = horizontalAlignment)
}
