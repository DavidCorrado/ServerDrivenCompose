package com.davidcorrado.serverdriven

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent
import com.davidcorrado.serverdriven.ui.theme.ServerDrivenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val items = ServerResponse(
            listOf(
                ServerCard(
                    subviews = listOf(
                        ServerColumn(
                            modifier = ServerModifier(
                                spacingStart = 20f,
                                spacingEnd = 20f,
                                spacingTop = 24f,
                                spacingBottom = 24f
                            ),
                            subviews = listOf(
                                ServerRow(
                                    alignment = ServerAlignment.CENTER,
                                    subviews = listOf(
                                        ServerImage(
                                            url = R.drawable.ic_streak,
                                            modifier = ServerModifier(
                                                width = 40f,
                                                height = 40f,
                                                adaText = "Android",
                                            )
                                        ),
                                        ServerText(
                                            text = "Sleep",
                                            modifier = ServerModifier(spacingStart = 7f)
                                        ),
                                        ServerSpacer(),
                                        ServerText(text = "Nov 1 "),
                                        ServerText(text = "8:31 AM")
                                    )
                                ),
                                ServerText(
                                    text = "9h 15m",
                                    modifier = ServerModifier(spacingTop = 20f)
                                ),
                                ServerRow(
                                    alignment = ServerAlignment.CENTER,
                                    modifier = ServerModifier(spacingTop = 20f),
                                    subviews = listOf(
                                        ServerImage(
                                            url = R.drawable.ic_streak,
                                            modifier = ServerModifier(
                                                width = 48f,
                                                height = 48f,
                                                adaText = "Android",
                                            )
                                        ),
                                        ServerText(
                                            text = "Average Sleep",
                                            modifier = ServerModifier(spacingStart = 16f)
                                        ),
                                        ServerBubble(
                                            text = ServerText(text = "Bubble"),
                                            backgroundColor = "#00FF00"
                                        )
                                    )
                                )
                            )
                        )
                    )
                )
            )
        )

        setContent {
            ServerDrivenTheme() {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 20.dp, vertical = 24.dp),
                ) {
                    SDContent(items = items.items)
                }
            }
        }
    }
}
