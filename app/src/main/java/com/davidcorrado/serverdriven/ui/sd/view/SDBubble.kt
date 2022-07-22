package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import com.davidcorrado.serverdriven.extension.toModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerBubble
import com.davidcorrado.serverdriven.ui.view.AppBubble

@Composable
fun SDBubble(serverBubble: ServerBubble, scope: Any?) {
    AppBubble(
        drawableRes = serverBubble.drawableRes,
        text = serverBubble.text.text,
        modifier = Modifier.toModifier(serverBubble.modifier, scope).semantics {
            contentDescription = serverBubble.getTextAda()
        },
        backgroundColor = serverBubble.getBackgroundColor(),
        strokeColor = serverBubble.getStrokeColor(),
        textStyle = serverBubble.text.getTextStyle()
    )
}