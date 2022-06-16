package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.ui.sd.data.*

@Composable
fun SDContent(items: List<Any>, scope: Any? = null) {
    for (item in items) {
        when (item) {
            is ServerCard -> {
                SDCard(modifier = item.modifier?.toModifier() ?: Modifier) {
                    SDContent(items = item.items)
                }
            }
            is ServerColumn -> {
                SDColumn(
                    modifier = item.modifier?.toModifier() ?: Modifier,
                    horizontalAlignment = if (item.alignment == ServerAlignment.CENTER) Alignment.CenterHorizontally else Alignment.Start
                ) {
                    SDContent(items = item.items, scope = this)
                }
            }
            is ServerRow -> {
                SDRow(
                    modifier = item.modifier?.toModifier() ?: Modifier,
                    verticalAlignment = if (item.alignment == ServerAlignment.CENTER) Alignment.CenterVertically else Alignment.Top
                ) {
                    SDContent(items = item.items, scope = this)
                }
            }
            is ServerImage -> {
                SDImage(
                    drawableRes = item.drawableRes,
                    contentDescription = item.contentDescription,
                    modifier = item.modifier?.toModifier() ?: Modifier
                )
            }
            is ServerText -> {
                SDText(
                    text = item.text,
                    modifier = item.modifier?.toModifier() ?: Modifier
                )
            }
            is ServerSpacer -> {
                if(scope is ColumnScope) {
                    scope.SDSpacer()
                } else if(scope is RowScope){
                    scope.SDSpacer()
                }
            }
        }
    }
}