package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import com.davidcorrado.serverdriven.ui.sd.data.*

@Composable
fun SDContent(items: List<Any>, scope: Any? = null) {
    for (item in items) {
        when (item) {
            is ServerCard -> {
                SDCard(item) {
                    SDContent(items = item.items)
                }
            }
            is ServerColumn -> {
                SDColumn(item) {
                    SDContent(items = item.items, scope = this)
                }
            }
            is ServerRow -> {
                SDRow(item) {
                    SDContent(items = item.items, scope = this)
                }
            }
            is ServerImage -> {
                SDImage(serverImage = item)
            }
            is ServerText -> {
                SDText(serverText = item)
            }
            is ServerBubble -> {
                SDBubble(serverBubble = item)
            }
            is ServerSpacer -> {
                if (scope is ColumnScope) {
                    scope.SDSpacer()
                } else if (scope is RowScope) {
                    scope.SDSpacer()
                }
            }
        }
    }
}