package com.davidcorrado.serverdriven.ui.sd.data

import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ServerImage(
    val type: ServerItemType = ServerItemType.IMAGE,
    val drawableRes: Int,
    val tint: String? = null,
    val contentScale: ImageContentScale? = null,
    val alignment: ImageAlignment? = null,
    val modifier: ServerModifier?
)

enum class ImageContentScale(val contentScale: ContentScale) {
    NONE(ContentScale.None),
    FILL_HEIGHT(ContentScale.FillHeight),
    FILL_WIDTH(ContentScale.FillWidth),
    CROP(ContentScale.Crop),
    FIT(ContentScale.Fit)
}

enum class ImageAlignment(val alignment: Alignment) {
    TOP_START(Alignment.TopStart),
    TOP_CENTER(Alignment.TopCenter),
    TOP_END(Alignment.TopEnd),
    CENTER_START(Alignment.CenterStart),
    CENTER_CENTER(Alignment.Center),
    CENTER_END(Alignment.CenterEnd),
    BOTTOM_START(Alignment.BottomStart),
    BOTTOM_CENTER(Alignment.BottomCenter),
    BOTTOM_END(Alignment.BottomEnd)
}