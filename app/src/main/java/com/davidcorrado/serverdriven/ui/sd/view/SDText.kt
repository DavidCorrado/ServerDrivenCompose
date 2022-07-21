package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import com.davidcorrado.serverdriven.ui.sd.data.ServerText

@Composable
fun SDText(serverText: ServerText, scope: Any?) {
    Text(
        style = serverText.getTextStyle(),
        text = serverText.text,
        modifier = (serverText.modifier?.toModifier(scope)
            ?: Modifier).semantics {
            contentDescription = serverText.adaText ?: serverText.text
            if (serverText.isHeading()) heading()
        }
    )
}