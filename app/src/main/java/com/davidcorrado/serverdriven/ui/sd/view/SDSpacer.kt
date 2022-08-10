package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.extension.toModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerSpacer

@Composable
fun SDSpacer(serverSpacer: ServerSpacer, scope: Any?) {
    var serverModifier =
        (serverSpacer.modifier ?: ServerModifier())
    if (serverModifier.height == null && serverModifier.width == null) {
        serverModifier = serverModifier.copy(weight = serverSpacer.modifier?.weight ?: 1f)
    }
    Spacer(modifier = Modifier.toModifier(serverModifier, scope))
}
