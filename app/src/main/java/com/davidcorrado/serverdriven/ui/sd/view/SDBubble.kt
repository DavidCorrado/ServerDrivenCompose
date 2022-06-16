package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import com.davidcorrado.serverdriven.ui.sd.data.ServerBubble
import com.davidcorrado.serverdriven.ui.view.AppBubble

@Composable
fun SDBubble(serverBubble: ServerBubble) {
    AppBubble(
        drawableRes = serverBubble.drawableRes,
        text = serverBubble.text.text,
        modifier = (serverBubble.modifier?.toModifier() ?: Modifier).semantics {
            contentDescription = serverBubble.getTextAda()
        },
        backgroundColor = serverBubble.getBackgroundColor(),
        strokeColor = serverBubble.getStrokeColor(),
        textStyle = serverBubble.text.getTextStyle()
    )
}