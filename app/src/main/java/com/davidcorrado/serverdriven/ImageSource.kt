package com.davidcorrado.serverdriven

import androidx.annotation.DrawableRes

const val IMAGE_SOURCE_URL = "https://sdui.s3.eu-west-1.amazonaws.com"
enum class ImageSource(val url: String, @DrawableRes val drawableRes: Int = 0) {
    ARROW_RIGHT("$IMAGE_SOURCE_URL/arrow_right.svg", R.drawable.ic_arrow_right),
    BACKGROUND("$IMAGE_SOURCE_URL/background.svg", R.drawable.ic_background),
    BARBELL("$IMAGE_SOURCE_URL/barbell.svg", R.drawable.ic_barbell),
    BP("$IMAGE_SOURCE_URL/bp.svg", R.drawable.ic_bp),
    CIRCLE_ARROW_HIGH("$IMAGE_SOURCE_URL/circle_arrow_high.svg", R.drawable.ic_circle_arrow_high),
    CHEVRON("$IMAGE_SOURCE_URL/chevron.svg", R.drawable.ic_chevron),
    CYCLING("$IMAGE_SOURCE_URL/cycling.svg", R.drawable.ic_cycling),
    DISAPPOINTED("$IMAGE_SOURCE_URL/disappointed.svg", R.drawable.ic_disappointed),
    MASKED_CHECKED("$IMAGE_SOURCE_URL/masked_check.png", R.drawable.ic_masked_check),
    RUNNING("$IMAGE_SOURCE_URL/running.svg", R.drawable.ic_running),
    PIE_CHART_GREEN("$IMAGE_SOURCE_URL/pie_chart_green.svg", R.drawable.ic_pie_chart_green),
    STREAK("$IMAGE_SOURCE_URL/streak.svg", R.drawable.ic_streak),
    TOTAL_ENTRIES("$IMAGE_SOURCE_URL/total_entries.svg", R.drawable.ic_total_entries),
}
