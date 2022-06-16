package com.davidcorrado.serverdriven

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent
import com.davidcorrado.serverdriven.ui.theme.ServerDrivenTheme
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val items = ServerResponse(
            listOf(
                ServerCard(
                    items = listOf(
                        ServerColumn(
                            modifier = ServerModifier(
                                paddingStart = 20f,
                                paddingEnd = 20f,
                                paddingTop = 24f,
                                paddingBottom = 24f
                            ), items = listOf(
                                ServerRow(
                                    alignment = ServerAlignment.CENTER,
                                    items = listOf(
                                        ServerImage(
                                            drawableRes = R.drawable.ic_android,
                                            adaText = "Android",
                                            modifier = ServerModifier(
                                                width = 40f,
                                                height = 40f
                                            )
                                        ),
                                        ServerText(
                                            text = "Sleep",
                                            modifier = ServerModifier(paddingStart = 7f)
                                        ),
                                        ServerSpacer(),
                                        ServerText(text = "Nov 1 "),
                                        ServerText(text = "8:31 AM")
                                    )
                                ),
                                ServerText(
                                    text = "9h 15m",
                                    modifier = ServerModifier(paddingTop = 20f)
                                ),
                                ServerRow(
                                    alignment = ServerAlignment.CENTER,
                                    modifier = ServerModifier(paddingTop = 20f),
                                    items = listOf(
                                        ServerImage(
                                            drawableRes = R.drawable.ic_android,
                                            adaText = "Android",
                                            modifier = ServerModifier(
                                                width = 48f,
                                                height = 48f
                                            )
                                        ),
                                        ServerText(
                                            text = "Average Sleep",
                                            modifier = ServerModifier(paddingStart = 16f)
                                        )
                                    )
                                )
                            )
                        )
                    )
                )
            )
        )
        val moshi = Moshi.Builder().build()
        val jsonAdapter: JsonAdapter<ServerResponse> = moshi.adapter(ServerResponse::class.java)

        Log.v("DavidData", "DavidData" + jsonAdapter.toJson(items))
        setContent {
            ServerDrivenTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    color = MaterialTheme.colors.background
                ) {
                    SDContent(items = items.items)
                }
            }
        }
    }
}