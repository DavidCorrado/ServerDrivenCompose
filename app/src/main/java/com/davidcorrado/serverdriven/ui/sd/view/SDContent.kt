package com.davidcorrado.serverdriven.ui.sd.view

import android.util.Log
import androidx.compose.runtime.Composable
import com.davidcorrado.serverdriven.ui.sd.data.*

@Composable
fun SDContent(item: Any?, scope: Any? = null) {
    when (item) {
        is ServerCard -> {
            SDCard(item, scope) {
                SDContent(items = item.items, scope = scope)
            }
        }
        is ServerColumn -> {
            SDColumn(item, scope) {
                SDContent(items = item.items, scope = this)
            }
        }
        is ServerRow -> {
            SDRow(item, scope) {
                SDContent(items = item.items, scope = this)
            }
        }
        is ServerImage -> {
            SDImage(serverImage = item, scope = scope)
        }
        is ServerText -> {
            SDText(serverText = item, scope = scope)
        }
        is ServerBubble -> {
            SDBubble(serverBubble = item, scope = scope)
        }
        is ServerSpacer -> {
            SDSpacer(serverSpacer = item, scope = scope)
        }
        else -> {
            Log.e("DavidData", "DavidError$item")
        }
    }
}

@Composable
fun SDContent(items: List<Any>, scope: Any? = null) {
    for (item in items) {
        SDContent(item = item, scope = scope)
    }
}