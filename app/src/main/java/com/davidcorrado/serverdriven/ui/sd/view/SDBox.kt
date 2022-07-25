package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.extension.toModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerBox
import com.davidcorrado.serverdriven.ui.sd.data.ServerColumn

@Composable
fun SDBox(
    serverBox: ServerBox,
    scope: Any?,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = Modifier.toModifier(serverBox.modifier, scope),
        content = content,
    )
}
