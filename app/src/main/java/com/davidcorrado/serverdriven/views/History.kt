package com.davidcorrado.serverdriven.views

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.davidcorrado.serverdriven.ImageSource
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("History")
@Composable
fun HistoryPreview() {
    val data =
        ServerResponse(
            items = listOf(
                ServerColumn(
                    subviews = listOf(
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
            spacingStart = 20f, spacingEnd = 20f, spacingTop = 16f, spacingBottom = 16f,
        ),
        subviews = listOf(
            ServerRow(
                alignment = ServerAlignment.CENTER,
                subviews = listOf(
                    ServerColumn(
                        modifier = ServerModifier(
                            weight = 1f
                        ),
                        subviews = listOf(
                            ServerRow(
                                alignment = ServerAlignment.CENTER,
                                subviews = listOf(
                                    ServerText(text = "45m", size = 18, weight = "500"),
                                    ServerSpacer(),
                                    ServerText(text = "Nov 1", size = 12, weight = "500"),
                                ),
                            ),
                            ServerRow(
                                modifier = ServerModifier(
                                    spacingTop = 4f,
                                ),
                                alignment = ServerAlignment.CENTER,
                                subviews = listOf(
                                    ServerImage(
                                        url = ImageSource.RUNNING.url,
                                        modifier = ServerModifier(
                                            width = 14f,
                                            height = 14f,
                                            spacingEnd = 8f,
                                        ),
                                    ),
                                    generateBubble(),
                                    ServerText(
                                        modifier = ServerModifier(spacingStart = 8f),
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
                        url = ImageSource.CHEVRON.url,
                        modifier = ServerModifier(
                            spacingStart = 36f,
                            width = 5f,
                            height = 11f,
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
            spacingStart = 20f, spacingEnd = 20f, spacingTop = 16f, spacingBottom = 16f,
        ),
        subviews = listOf(
            ServerRow(
                alignment = ServerAlignment.CENTER,
                subviews = listOf(
                    ServerRow(
                        alignment = ServerAlignment.CENTER,
                        modifier = ServerModifier(
                            weight = 1f
                        ),
                        subviews = listOf(
                            ServerRow(
                                alignment = ServerAlignment.CENTER,
                                subviews = listOf(
                                    ServerImage(
                                        url = ImageSource.DISAPPOINTED.url,
                                        modifier = ServerModifier(
                                            width = 24f,
                                            height = 22f,
                                            spacingEnd = 10f,
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
                                subviews = listOf(
                                    ServerText(text = "Nov 1", size = 12, weight = "500", modifier = ServerModifier(spacingBottom = 8f)),
                                    ServerText(text = "10:45 AM", size = 12, weight = "700"),
                                ),
                            ),
                        ),
                    ),
                    ServerImage(
                        url = ImageSource.CHEVRON.url,
                        modifier = ServerModifier(
                            spacingStart = 36f,
                            width = 5f,
                            height = 11f,
                        ),
                    ),
                ),
            ),
        )
    )
}
