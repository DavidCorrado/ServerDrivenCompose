package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerCard

@Composable
fun SDCard(serverCard: ServerCard, content: @Composable () -> Unit){
    Card(modifier = serverCard.modifier?.toModifier() ?: Modifier,content =content)
}