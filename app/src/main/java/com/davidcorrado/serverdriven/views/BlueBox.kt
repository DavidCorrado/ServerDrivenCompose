package com.davidcorrado.serverdriven.views

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.davidcorrado.serverdriven.R
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("BlueBox")
@Composable
fun BlueBox() {
    val data =
        ServerResponse(
            items = listOf(
                blueCard()
            )
        )
    Log.v("DavidData", "DavidBlueBox" + data.toJson())
    SDContent(items = data.items)
}

fun blueCard(): ServerBox {
    return ServerBox(
        modifier = ServerModifier(backgroundColor = "#002F8C", cornerRadius = 16f),
        items = listOf(
            ServerColumn(
                modifier = ServerModifier(
                    paddingStart = 24f,
                    paddingEnd = 36f,
                    paddingTop = 61f,
                    paddingBottom = 33f
                ),
                items = listOf(
                    ServerText(text = "Introducing", size = 14, weight = "600", color = "#FFFFFF"),
                    ServerText(text = "Check-ins", size = 28, weight = "700", color = "#87C5FF"),
                    ServerSpacer(modifier = ServerModifier(height = 22f)),
                    ServerText(text = "Create your first entry and let’s start connecting the dots for your health.", size = 16, weight = "500", color = "#FFFFFF"),
                    ServerSpacer(modifier = ServerModifier(height = 27f)),
                    ServerRow(
                        items = listOf(
                            ServerImage(
                                drawableRes = R.drawable.ic_arrow_right,
                                modifier = ServerModifier(width = 10f, height = 6f, paddingTop = 5f, paddingEnd = 5f)
                            ),
                            ServerText(text = "Some of the data you record in journeys will appear here, too.", size = 12, weight = "500", color = "#FFFFFF")
                        )
                    )
                )
            )
        )
    )
}
