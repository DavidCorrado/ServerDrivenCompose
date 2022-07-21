package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerSpacer

@Composable
fun SDSpacer(serverSpacer: ServerSpacer, scope: Any?) {
    val serverModifier =
        (serverSpacer.modifier ?: ServerModifier())
            .copy(weight = serverSpacer.modifier?.weight ?: 1f)
    Spacer(modifier = serverModifier.toModifier(scope))
}