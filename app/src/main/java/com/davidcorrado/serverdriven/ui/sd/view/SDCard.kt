package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerCard

@Composable
fun SDCard(serverCard: ServerCard, scope: Any?, content: @Composable () -> Unit) {
    Card(modifier = serverCard.modifier?.toModifier(scope) ?: Modifier) {
        Column {
            content.invoke()
        }
    }
}