package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.davidcorrado.serverdriven.ui.sd.data.ServerImage

@Composable
fun SDImage(serverImage: ServerImage, scope: Any?) {
    Image(
        painter = painterResource(serverImage.drawableRes),
        contentDescription = serverImage.adaText,
        modifier = (serverImage.modifier?.toModifier(scope) ?: Modifier).width(Dp(serverImage.width)).height(Dp(serverImage.height))
    )
}