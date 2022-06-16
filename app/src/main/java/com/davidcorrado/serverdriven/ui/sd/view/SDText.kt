package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SDText(text: String, modifier: Modifier = Modifier){
    Text(text = text, modifier = modifier)
}