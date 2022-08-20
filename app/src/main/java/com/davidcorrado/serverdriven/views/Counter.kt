package com.davidcorrado.serverdriven.views

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.davidcorrado.serverdriven.ImageSource
import com.davidcorrado.serverdriven.R
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("Counters")
@Composable
fun Counters() {
    val leftCounter = counter(27, "Active streak", ImageSource.STREAK.url)
    val rightCounter = counter(451, "Total entries", ImageSource.TOTAL_ENTRIES.url)
    val data =
        ServerResponse(
            items = listOf(
                ServerRow(
                    spacing = 10f,
                    subviews = listOf(leftCounter, rightCounter)
                )
            )
        )
    Log.v("DavidData", "DavidCounter" + data.toJson())
    SDContent(items = data.items)
}

fun counter(count: Int, label: String, image: String): ServerColumn {
    return ServerColumn(
        modifier = ServerModifier(weight = 1f, backgroundColor = "#F5F5F5", cornerRadius = 16f), subviews = listOf(
            ServerText(
                text = count.toString(),
                color = "#002F8C",
                size = 32,
                weight = "300",
                modifier = ServerModifier(spacingStart = 18f, spacingTop = 18f)
            ),
            ServerRow(
                alignment = ServerAlignment.CENTER, subviews = listOf(
                    ServerText(
                        text = label,
                        size = 12,
                        weight = "500"
                    ),
                    ServerSpacer(),
                    ServerImage(
                        url = image,
                        modifier = ServerModifier(
                            width = 33f,
                            height = 33f,
                            spacingStart = 8f
                        )
                    )
                ),
                modifier = ServerModifier(
                    spacingStart = 18f,
                    spacingBottom = 14f,
                    spacingEnd = 14f
                )
            )
        )
    )
}