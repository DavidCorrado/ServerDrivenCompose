package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SDCard(modifier: Modifier = Modifier, content: @Composable () -> Unit){
    Card(modifier = modifier,content =content)
}