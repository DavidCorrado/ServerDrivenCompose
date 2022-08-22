package com.davidcorrado.serverdriven.views

import android.util.Log
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

@Preview("CompleteList")
@Composable
fun CompleteList() {
    val leftCounter = counter(27, "Active streak", ImageSource.STREAK.url)
    val rightCounter = counter(451, "Total entries", ImageSource.TOTAL_ENTRIES.url)
    val data =
        ServerResponse(
            items = listOf(
                ServerSpacer(modifier = ServerModifier(height = 20f)),
                BlueCard(),
                ServerSpacer(modifier = ServerModifier(height = 24f)),
                ServerRow(
                    spacing = 10f,
                    subviews = listOf(leftCounter, rightCounter),
                    modifier = ServerModifier(spacingStart = 20f, spacingEnd = 20f)
                ),
                ServerSpacer(modifier = ServerModifier(height = 30f)),
                ServerText(text = "MOST RECENT", size = 12, weight = "700", color = "#4C5870", modifier = ServerModifier(spacingStart = 20f, spacingEnd = 20f)),
                ServerSpacer(modifier = ServerModifier(height = 12f)),
                Entry()
            )
        )
    val jsonString = data.toJson()
    Log.v("DavidData", "DavidWholeList = $jsonString")
    LazyColumn(
        modifier = Modifier.background(color = Color.Black.copy(alpha = 0.5f))
            .fillMaxSize()
    ) {
        items(data.items) { item ->
            SDContent(item = item)
        }
    }
}
