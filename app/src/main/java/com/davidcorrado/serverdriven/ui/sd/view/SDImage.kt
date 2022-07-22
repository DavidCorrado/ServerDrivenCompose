package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.davidcorrado.serverdriven.extension.toModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerImage

@Composable
fun SDImage(serverImage: ServerImage, scope: Any?) {
    Image(
        painter = painterResource(serverImage.drawableRes),
        contentDescription = null,
        modifier = Modifier.toModifier(serverImage.modifier, scope)
    )
}