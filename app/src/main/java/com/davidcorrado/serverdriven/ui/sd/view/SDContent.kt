package com.davidcorrado.serverdriven.ui.sd.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.davidcorrado.serverdriven.ui.sd.data.*

@Composable
fun SDContent(items: List<Any>){
    for(item in items){
        when (item) {
            is ServerCard -> {
                SDCard(modifier = item.modifier?.toModifier()?:Modifier) {
                    SDContent(items = item.items)
                }
            }
            is ServerColumn -> {
                SDColumn(modifier = item.modifier?.toModifier()?:Modifier, horizontalAlignment = if(item.alignment == ServerAlignment.CENTER)  Alignment.CenterHorizontally else Alignment.Start) {
                    SDContent(items = item.items)
                }}
            is ServerRow -> {
                SDRow(modifier = item.modifier?.toModifier()?:Modifier, verticalAlignment = if(item.alignment == ServerAlignment.CENTER)  Alignment.CenterVertically else Alignment.Top) {
                    SDContent(items = item.items)
                }
            }
            is ServerImage -> {
                SDImage(drawableRes = item.drawableRes, contentDescription = item.contentDescription, modifier =  item.modifier?.toModifier()?:Modifier)
            }
            is ServerText -> {
                SDText(
                    text = item.text,
                    modifier = item.modifier?.toModifier() ?: Modifier
                )
            }
        }
//        else if(item is ServerSpacer) {
//            if(content is ColumnScope) {
//                return SDSpacer()
//            } else if(content is RowScope){
//                return content.SDSpacer()
//            }
//        }
    }
}