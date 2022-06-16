package com.davidcorrado.serverdriven.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun AppBubble(
    modifier: Modifier = Modifier,
    drawableRes: Int? = null,
    text: String,
    backgroundColor: Color,
    strokeColor: Color = backgroundColor,
    textStyle: TextStyle
) {
    Row(
        modifier = modifier
            .border(
                color = strokeColor,
                width = Dp.Hairline,
                shape = RoundedCornerShape(6.dp)
            )
            .background(color = backgroundColor, shape = RoundedCornerShape(6.dp))
            .padding(horizontal = 8.dp, vertical = 6.dp),
        horizontalArrangement = Arrangement.End,
    ) {
        drawableRes?.run {
            Image(
                painter = painterResource(this),
                contentDescription = null,
                alignment = Alignment.CenterStart,
                modifier = Modifier
                    .padding(end = 6.dp)
                    .align(Alignment.CenterVertically)
                    .height(16.dp)
                    .width(16.dp)
            )
        }
        Text(
            style = textStyle,
            text = text
        )
    }
}