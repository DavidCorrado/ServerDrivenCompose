package com.davidcorrado.serverdriven.ui.sd.data

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import com.davidcorrado.serverdriven.extension.modifyIf
import com.davidcorrado.serverdriven.extension.toColor
import com.davidcorrado.serverdriven.extension.weightWithScope
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerModifier(
    val paddingStart: Float? = null,
    val paddingEnd: Float? = null,
    val paddingTop: Float? = null,
    val paddingBottom: Float? = null,
    val width: Float? = null,
    val height: Float? = null,
    val weight: Float? = null,
    val backgroundColor: String? = null,
    val cornerRadius: Float? = null,
)