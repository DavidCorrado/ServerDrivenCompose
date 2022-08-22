package com.davidcorrado.serverdriven.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.davidcorrado.serverdriven.ImageSource
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Composable
@Preview("Bubble")
fun Bubble() {
    val data =
        ServerResponse(
            items = listOf(
                generateBubble(),
                ServerSpacer(modifier = ServerModifier(height = 20f)),
                generateBubbleWithImage()
            )
        )

    LazyColumn(
        modifier = Modifier.background(color = Color.Black.copy(alpha = 0.5f))
            .fillMaxSize()
    ) {
        items(data.items) { item ->
            SDContent(item = item)
        }
    }
}

fun generateBubble(): ServerRow {
    return ServerRow(
        modifier = ServerModifier(backgroundColor = "#70DEB0", cornerRadius = 6f),
        subviews = listOf(
            ServerText(
                modifier = ServerModifier(
                    spacingStart = 8f,
                    spacingEnd = 8f,
                    spacingTop = 6f,
                    spacingBottom = 6f
                ),
                text = "NORMAL",
                color = "#094E44",
                weight = "700",
                size = 12
            )
        )
    )
}

fun generateBubbleWithImage(): ServerRow {
    return ServerRow(
        alignment = ServerAlignment.CENTER,
        modifier = ServerModifier(backgroundColor = "#70DEB0", cornerRadius = 6f),
        subviews = listOf(
            ServerImage(
                url = ImageSource.BARBELL.url,
                modifier = ServerModifier(width = 16f, height = 16f, spacingStart = 8f)
            ),
            ServerText(
                modifier = ServerModifier(
                    spacingStart = 6f,
                    spacingEnd = 8f,
                    spacingTop = 6f,
                    spacingBottom = 6f
                ),
                text = "NORMAL",
                color = "#094E44",
                weight = "700",
                size = 12
            )
        )
    )
}
