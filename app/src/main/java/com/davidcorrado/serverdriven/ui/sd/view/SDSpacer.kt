package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.extension.weightWithScope

@Composable
fun SDSpacer(scope: Any?) {
    Spacer(modifier = Modifier.weightWithScope(scope, 1f))
}