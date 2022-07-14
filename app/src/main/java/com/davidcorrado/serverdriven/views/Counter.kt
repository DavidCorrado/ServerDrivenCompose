package com.davidcorrado.serverdriven.views

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.davidcorrado.serverdriven.R
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("Counters")
@Composable
fun Counters() {
    val leftCounter = Counter(27, "Active streak", R.drawable.ic_streak)
    val rightCounter = Counter(451, "Total entries", R.drawable.ic_total_entries)
    val data =
        ServerResponse(
            items = listOf(
                ServerRow(
                    spacing = 10f,
                    items = listOf(leftCounter, rightCounter)
                )
            )
        )
    Log.v("DavidData", "DavidCounter" + data.toJson())
    SDContent(items = data.items)
}

fun Counter(count: Int, label: String, @DrawableRes image: Int): ServerColumn {
    return ServerColumn(
        color = "#F5F5F5", colorCornerRadius = 16f,
        modifier = ServerModifier(weight = 1f), items = listOf(//TODO
            ServerText(
                text = count.toString(),
                color = "#002F8C",
                size = 32,
                weight = "300",
                modifier = ServerModifier(paddingStart = 18f, paddingTop = 18f)
            ),
            ServerRow(
                alignment = ServerAlignment.CENTER, items = listOf(
                    ServerText(
                        text = label,
                        size = 12,
                        weight = "500"
                    ),
                    ServerSpacer(),
                    ServerImage(
                        drawableRes = image,
                        modifier = ServerModifier(
                            width = 33f,
                            height = 33f,
                            paddingStart = 8f
                        )
                    )
                ),
                modifier = ServerModifier(
                    paddingStart = 18f,
                    paddingBottom = 14f,
                    paddingEnd = 14f
                )
            )
        )
    )
}