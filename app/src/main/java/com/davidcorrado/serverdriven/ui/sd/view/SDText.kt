package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import com.davidcorrado.serverdriven.extension.toModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerText

@Composable
fun SDText(serverText: ServerText, scope: Any?) {
    Text(
        style = serverText.getTextStyle(),
        text = serverText.text,
        modifier = Modifier.toModifier(serverText.modifier, scope).semantics {
            if (serverText.isHeading()) heading()
        }
    )
}