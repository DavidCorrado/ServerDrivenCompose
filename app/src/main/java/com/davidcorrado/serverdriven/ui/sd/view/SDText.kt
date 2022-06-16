package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import com.davidcorrado.serverdriven.ui.sd.data.ServerText

@Composable
fun SDText(serverText: ServerText) {
    Text(
        style = serverText.getTextStyle(),
        text = serverText.text,
        modifier = (serverText.modifier?.toModifier()
            ?: Modifier).semantics { if (serverText.isHeading()) heading() }
    )
}