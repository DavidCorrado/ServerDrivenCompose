package com.davidcorrado.serverdriven.views

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.davidcorrado.serverdriven.R
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("Entry")
@Composable
fun Entries() {
    val data =
        ServerResponse(
            items = listOf(
                Entry()
            )
        )
    Log.v("DavidData", "DavidEntries" + data.toJson())
    SDContent(items = data.items)
}

fun Entry(): ServerCard {
    return ServerCard(
        items = listOf(
            ServerColumn(
                modifier = ServerModifier(
                    paddingStart = 20f,
                    paddingEnd = 20f,
                    paddingTop = 24f,
                    paddingBottom = 24f
                ),
                items = listOf(
                    ServerRow(
                        alignment = ServerAlignment.CENTER,
                        items = listOf(
                            ServerImage(
                                drawableRes = R.drawable.ic_bp,
                                modifier = ServerModifier(
                                    width = 18f,
                                    height = 18f,
                                    paddingEnd = 7f
                                )
                            ),
                            ServerText(text = "Blood Pressure", size = 14, weight = "500"),
                            ServerSpacer(),
                            ServerText(text = "Nov 1 ", size = 12, weight = "500"),
                            ServerText(text = "8:31 AM", size = 12, weight = "700")
                        )
                    ),
                    ServerText(
                        text = "123/82",
                        weight = "300",
                        size = 36,
                        color = "#002F8C",
                        modifier = ServerModifier(paddingTop = 21f, paddingBottom = 15f)
                    ),
                    ServerRow(
                        alignment = ServerAlignment.CENTER,
                        items = listOf(
                            ServerImage(
                                drawableRes = R.drawable.ic_running,
                                modifier = ServerModifier(
                                    width = 20f,
                                    height = 20f,
                                    paddingEnd = 8f
                                )
                            ),
                            ServerBubble(text = ServerText(text = "Normal")),
                            ServerText(text = "Per AHA guidelines", size = 12, weight = "500"),
                        )
                    ),
                )
            )
        )
    )
}