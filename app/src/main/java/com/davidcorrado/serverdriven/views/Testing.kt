package com.davidcorrado.serverdriven.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.davidcorrado.serverdriven.ui.sd.data.ServerCard
import com.davidcorrado.serverdriven.ui.sd.data.ServerModifier
import com.davidcorrado.serverdriven.ui.sd.data.ServerResponse
import com.davidcorrado.serverdriven.ui.sd.data.ServerText
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("Testing")
@Composable
fun TestingPreview() {
    val data =
        ServerResponse(
            items = listOf(
                ServerCard(
                    items = listOf(ServerText(text = "Card"))
                ),
                ServerCard(
                    items = listOf(ServerText(text = "Card Padding")),
                    modifier = ServerModifier(
                        paddingStart = 30f,
                        paddingEnd = 30f,
                        paddingTop = 30f,
                        paddingBottom = 30f
                    )
                ),
                ServerCard(
                    items = listOf(ServerText(text = "Card Padding HW")),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        paddingStart = 30f,
                        paddingEnd = 30f,
                        paddingTop = 30f,
                        paddingBottom = 30f
                    )
                )
            )
        )
    LazyColumn {
        items(data.items) { item ->
            SDContent(item = item, this)
        }
    }
}