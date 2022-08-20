package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.LocalImageLoader
import coil.compose.rememberImagePainter
import coil.decode.SvgDecoder
import com.davidcorrado.serverdriven.extension.toColor
import com.davidcorrado.serverdriven.extension.toModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerImage

@Composable
fun SDImage(serverImage: ServerImage, scope: Any?) {

    Image(
        alignment = serverImage.alignment?.alignment ?: Alignment.Center,
        painter = rememberImagePainter(
            serverImage.url,
            LocalImageLoader.current.newBuilder().componentRegistry {
                add(SvgDecoder(LocalContext.current))
            }.build()
        ),
        contentDescription = null,
        colorFilter = serverImage.tint?.let { ColorFilter.tint(it.toColor()) },
        contentScale = serverImage.contentScale?.contentScale ?: ContentScale.Fit,
        modifier = Modifier.toModifier(serverImage.modifier, scope)
    )
}
