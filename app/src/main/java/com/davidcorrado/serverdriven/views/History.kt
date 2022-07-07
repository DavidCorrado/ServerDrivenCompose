package com.davidcorrado.serverdriven.views

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.davidcorrado.serverdriven.R
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("History")
@Composable
fun HistoryPreview() {
    val data =
        ServerResponse(
            items = listOf(
                ServerColumn(
                    items = listOf(
                        history1(),
                        history2()
                    )
                )
            )
        )
    Log.v("DavidData", "DavidHistory" + data.toJson())
    SDContent(items = data.items)
}

fun history1(): ServerColumn {
    return ServerColumn(
        modifier = ServerModifier(
            paddingStart = 20f, paddingEnd = 20f, paddingTop = 16f, paddingBottom = 16f,
        ),
        items = listOf(
            ServerRow(
                alignment = ServerAlignment.CENTER,
                items = listOf(
                    ServerColumn(
                        modifier = ServerModifier(
                            weight = 1f,
                        ),
                        items = listOf(
                            ServerRow(
                                alignment = ServerAlignment.CENTER,
                                items = listOf(
                                    ServerText(text = "45m", size = 18, weight = "500"),
                                    ServerSpacer(),
                                    ServerText(text = "Nov 1", size = 12, weight = "500"),
                                ),
                            ),
                            ServerRow(
                                modifier = ServerModifier(
                                    paddingTop = 4f,
                                ),
                                alignment = ServerAlignment.CENTER,
                                items = listOf(
                                    ServerImage(
                                        drawableRes = R.drawable.ic_running,
                                        width = 14f,
                                        height = 14f,
                                        modifier = ServerModifier(
                                            paddingEnd = 8f,
                                        ),
                                    ),
                                    ServerBubble(
                                        backgroundColor = "#70DEB0",
                                        text = ServerText(
                                            text = "NORMAL",
                                            color = "#094E44",
                                            weight = "700",
                                            size = 12,
                                        ),
                                        modifier = ServerModifier(
                                            paddingEnd = 8f,
                                        ),
                                    ),
                                    ServerText(
                                        text = "Jogging or running",
                                        size = 12,
                                        weight = "500",
                                    ),
                                    ServerSpacer(),
                                    ServerText(text = "10:45 AM", size = 12, weight = "700"),
                                ),
                            ),
                        ),
                    ),
                    ServerImage(
                        drawableRes = R.drawable.ic_chevron,
                        width = 5f,
                        height = 11f,
                        modifier = ServerModifier(
                            paddingStart = 36f,
                        ),
                    ),
                ),
            ),
        )
    )
}

fun history2(): ServerColumn {
    return ServerColumn(
        modifier = ServerModifier(
            paddingStart = 20f, paddingEnd = 20f, paddingTop = 16f, paddingBottom = 16f,
        ),
        items = listOf(
            ServerRow(
                alignment = ServerAlignment.CENTER,
                items = listOf(
                    ServerRow(
                        alignment = ServerAlignment.CENTER,
                        modifier = ServerModifier(
                            weight = 1f,
                        ),
                        items = listOf(
                            ServerRow(
                                alignment = ServerAlignment.CENTER,
                                items = listOf(
                                    ServerImage(
                                        drawableRes = R.drawable.ic_disappointed,
                                        width = 24f,
                                        height = 22f,
                                        modifier = ServerModifier(
                                            paddingEnd = 10f,
                                        ),
                                    ),
                                    ServerText(
                                        text = "Disappointed",
                                        weight = "500",
                                    ),
                                ),
                            ),
                            ServerSpacer(),
                            ServerColumn(
                                alignment = ServerAlignment.END,
                                items = listOf(
                                    ServerText(text = "Nov 1", size = 12, weight = "500", modifier = ServerModifier(paddingBottom = 8f)),
                                    ServerText(text = "10:45 AM", size = 12, weight = "700"),
                                ),
                            ),
                        ),
                    ),
                    ServerImage(
                        drawableRes = R.drawable.ic_chevron,
                        width = 5f,
                        height = 11f,
                        modifier = ServerModifier(
                            paddingStart = 36f,
                        ),
                    ),
                ),
            ),
        )
    )
}