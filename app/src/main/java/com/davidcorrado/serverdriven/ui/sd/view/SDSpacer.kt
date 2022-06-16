package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ColumnScope.SDSpacer() {
    Spacer(modifier = Modifier.weight(1f))
}

@Composable
fun RowScope.SDSpacer() {
    Spacer(modifier = Modifier.weight(1f))
}