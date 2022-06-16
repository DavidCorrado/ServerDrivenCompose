package com.davidcorrado.serverdriven.extension

import androidx.compose.ui.graphics.Color

fun CharSequence.toColor() = Color(android.graphics.Color.parseColor(this.toString()))