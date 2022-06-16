package com.davidcorrado.serverdriven.ui.sd.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun SDImage(@DrawableRes drawableRes: Int, contentDescription: String?, modifier: Modifier = Modifier){
    Image(painter = painterResource(drawableRes), contentDescription = contentDescription,modifier = modifier)
}