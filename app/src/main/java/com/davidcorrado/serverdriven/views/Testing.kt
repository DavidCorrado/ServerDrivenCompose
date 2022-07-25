package com.davidcorrado.serverdriven.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.davidcorrado.serverdriven.R
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("Testing2")
@Composable
fun Testing2Preview() {
    Column(modifier = Modifier) {
        Surface {
            Box(
                modifier = Modifier
                    .background(Color.Red)
            ) {
                Row {
                    Image(
                        alignment = Alignment.TopCenter,//Maybe support this?
                        modifier = Modifier
                            //.height(300.dp)
                            .weight(1f)
                            .aspectRatio(.3f)
                            .background(Color.Green),//Fill width not working
                        painter = painterResource(id = R.drawable.ic_disappointed),
                        contentScale = ContentScale.Fit,//Support this
                        contentDescription = "test"
                    )
                }
            }
        }
    }
}

@Preview("Testing")
@Composable
fun TestingPreview() {
    val data =
        ServerResponse(
            items = listOf(
                ServerRow(
                    items = listOf(
                        ServerText(text = "Read Me"),
                        ServerText(
                            text = "Do Not Read",
                            modifier = ServerModifier(adaText = "Read Me")
                        ),
                        ServerText(text = "Read me Heading", isHeading = true),
                        ServerImage(
                            drawableRes = R.drawable.ic_disappointed,
                            modifier = ServerModifier(
                                adaText = "Disappointed",
                                height = 20f,
                                width = 20f
                            )
                        ),
                        ServerImage(
                            drawableRes = R.drawable.ic_disappointed,
                            modifier = ServerModifier(height = 20f, width = 20f)
                        )
                    )
                ),
                ServerRow(
                    modifier = ServerModifier(adaText = "Read Me"),
                    items = listOf(
                        ServerText(text = "Don't Read"),
                        ServerText(
                            text = "Don't Read",
                            modifier = ServerModifier(adaText = "Don't Read")
                        ),
                    )
                ),
                ServerCard(
                    items = listOf(ServerText(text = "Card"))
                ),
                ServerCard(
                    items = listOf(ServerText(text = "Card Padding")),
                    modifier = ServerModifier(
                        paddingStart = 30f,
                        paddingEnd = 30f,
                        paddingTop = 30f,
                        paddingBottom = 30f
                    )
                ),
                ServerCard(
                    items = listOf(
                        ServerColumn(
                            items = listOf(
                                ServerText(text = "Card Padding HW"),
                                ServerText(text = "Card 2")
                            )
                        )
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        paddingStart = 30f,
                        paddingEnd = 30f,
                        paddingTop = 30f,
                        paddingBottom = 30f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.CENTER,
                    items = listOf(
                        ServerText(text = "Column Center"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 5f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.END,
                    items = listOf(
                        ServerText(text = "Column End"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        backgroundColor = "#00ff00",
                        cornerRadius = 5f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.CENTER,
                    items = listOf(
                        ServerText(text = "Row Center"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 5f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.END,
                    items = listOf(
                        ServerText(text = "Row End"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        backgroundColor = "#00ff00",
                        cornerRadius = 5f
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerText(text = "Row Padding HW"),
                        ServerText(text = "Row 2")
                    ),
                    spacing = 20f,
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        paddingStart = 30f,
                        paddingEnd = 30f,
                        paddingTop = 30f,
                        paddingBottom = 30f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 5f
                    )
                ),
                ServerColumn(
                    items = listOf(
                        ServerText(text = "Col Padding HW"),
                        ServerText(text = "Col 2")
                    ),
                    spacing = 20f,
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        paddingStart = 30f,
                        paddingEnd = 30f,
                        paddingTop = 30f,
                        paddingBottom = 30f,
                        backgroundColor = "#00ff00",
                        cornerRadius = 5f
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerText(text = "Row"),
                        ServerColumn(
                            items = listOf(
                                ServerText(text = "Col Padding HW"),
                                ServerText(text = "Col 2")
                            ),
                            modifier = ServerModifier(
                                paddingStart = 30f,
                                paddingEnd = 30f,
                                paddingTop = 30f,
                                paddingBottom = 30f,
                                backgroundColor = "#00ff00",
                                cornerRadius = 5f
                            )
                        )
                    ),
                    modifier = ServerModifier(
                        paddingStart = 30f,
                        paddingEnd = 30f,
                        paddingTop = 30f,
                        paddingBottom = 30f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 5f
                    )
                ),
                ServerColumn(
                    items = listOf(
                        ServerText(text = "Col Spacer"),
                        ServerSpacer(),
                        ServerText(text = "Col Spacer")
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        backgroundColor = "#00ff00",
                        cornerRadius = 5f
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerText(text = "Row Spacer"),
                        ServerSpacer(),
                        ServerText(text = "Row Spacer")
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 5f
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerRow(
                            items = listOf(
                                ServerText(text = "Row Border Background"),
                            ),
                            modifier = ServerModifier(
                                paddingBottom = 20f,
                                paddingTop = 20f,
                                paddingStart = 20f,
                                paddingEnd = 20f,
                                width = 200f,
                                height = 200f,
                                backgroundColor = "#00ff00",
                                cornerRadius = 20f
                            )
                        ),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        paddingBottom = 20f,
                        paddingTop = 20f,
                        paddingStart = 20f,
                        paddingEnd = 20f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 20f
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerRow(
                            items = listOf(
                                ServerText(text = "Row Border Background"),
                            ),
                            modifier = ServerModifier(
                                weight = 1f,
                                paddingBottom = 20f,
                                paddingTop = 20f,
                                paddingStart = 20f,
                                paddingEnd = 20f,
                                backgroundColor = "#00ff00",
                                cornerRadius = 20f
                            )
                        ),
                    ),
                    modifier = ServerModifier(
                        paddingBottom = 20f,
                        paddingTop = 20f,
                        paddingStart = 20f,
                        paddingEnd = 20f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 20f
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerSpacer(
                            modifier = ServerModifier(
                                weight = 1f,
                                height = 20f,
                                backgroundColor = "#0000ff",
                            )
                        )
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerSpacer(),
                        ServerSpacer(
                            modifier = ServerModifier(
                                width = 50f,
                                height = 20f,
                                backgroundColor = "#0000ff",
                            )
                        ),
                        ServerSpacer(),
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerImage(
                            drawableRes = R.drawable.ic_disappointed,
                            modifier = ServerModifier(height = 20f, width = 20f)
                        ),
                        ServerImage(
                            drawableRes = R.drawable.ic_disappointed,
                            modifier = ServerModifier(
                                height = 20f,
                                width = 20f,
                                paddingStart = 20f,
                                paddingEnd = 20f,
                                paddingTop = 20f,
                                paddingBottom = 20f
                            )
                        ),
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerText(
                            text = "Left 30",
                            modifier = ServerModifier(weight = .3f, backgroundColor = "#ff0000")
                        ),
                        ServerText(
                            text = "Mid 50",
                            modifier = ServerModifier(weight = .5f, backgroundColor = "#00ff00")
                        ),
                        ServerText(
                            text = "Right 30",
                            modifier = ServerModifier(weight = .3f, backgroundColor = "#0000ff")
                        )
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerRow(
                            modifier = ServerModifier(width = 200f),
                            items = listOf(
                                ServerText(
                                    text = "Left 30 is going to get really long",
                                    modifier = ServerModifier(
                                        weight = .3f,
                                        backgroundColor = "#ff0000"
                                    )
                                ),
                                ServerText(
                                    text = "Mid 50 is going to get really long",
                                    modifier = ServerModifier(
                                        weight = .5f,
                                        backgroundColor = "#00ff00"
                                    )
                                ),
                                ServerText(
                                    text = "Right 30 is going to get really long",
                                    modifier = ServerModifier(
                                        weight = .3f,
                                        backgroundColor = "#0000ff"
                                    )
                                )
                            )
                        )
                    )
                ),
                ServerCard(
                    items = listOf(
                        ServerText(
                            text = "Card BG",
                            modifier = ServerModifier(backgroundColor = "#ff0000")
                        ),
                    ),
                    modifier = ServerModifier(
                        backgroundColor = "#ff0000",
                        cornerRadius = 60f,
                        paddingBottom = 20f,
                        paddingEnd = 20f,
                        paddingTop = 20f,
                        paddingStart = 20f,
                    )
                ),
                ServerRow(
                    items = listOf(
                        ServerText(
                            text = "Text is going to get really long.Left 30 is going to get really long",
                            modifier = ServerModifier(
                                backgroundColor = "#ff0000"
                            )
                        ),
                        ServerText(
                            text = "Text ",
                            modifier = ServerModifier(
                                backgroundColor = "#00ff00"
                            )
                        ),
                    )

                ),
                ServerRow(
                    items = listOf(
                        ServerSpacer(
                            modifier = ServerModifier(
                                weight = 1f,
                                backgroundColor = "#ff0000",
                                cornerRadius = 60f,
                                paddingBottom = 20f,
                                paddingEnd = 20f,
                                paddingTop = 20f,
                                paddingStart = 20f,
                            )
                        )
                    )
                ),
                ServerText(
                    text = "Test",
                    modifier = ServerModifier(
                        backgroundColor = "#ff0000",
                        cornerRadius = 60f,
                        paddingBottom = 20f,
                        paddingEnd = 20f,
                        paddingTop = 20f,
                        paddingStart = 20f,
                    )
                ),
                ServerImage(
                    drawableRes = R.drawable.ic_running,
                    tint = "#FF0000",
                    modifier = ServerModifier(height = 20f, width = 20f)
                ),
                ServerColumn(
                    items = listOf(
                        ServerBox(
                            items = listOf(
                                ServerRow(
                                    items = listOf(
                                        ServerImage(
                                            drawableRes = R.drawable.ic_background,
                                            alignment = ImageAlignment.TOP_END,
                                            modifier = ServerModifier(
                                                weight = 1f,
                                                aspectRatio = 1.2f
                                            ),
                                            contentScale = ImageContentScale.FILL_HEIGHT
                                        )
                                    )
                                ),
                                ServerColumn(
                                    items = listOf(
                                        ServerText(
                                            text = "Overlay",
                                            modifier = ServerModifier(backgroundColor = "#FF0000")
                                        ),
                                        ServerSpacer(),
                                        ServerText(
                                            text = "Overlay",
                                            modifier = ServerModifier(backgroundColor = "#FF0000")
                                        ),
                                    ),
                                    modifier = ServerModifier(
                                        weight = 1f,
                                        aspectRatio = 1.2f
                                    ),
                                )

                            )
                        ),
                    )
                ),
                ServerColumn(
                    items = listOf(
                        ServerBox(
                            items = listOf(
                                ServerRow(
                                    items = listOf(
                                        ServerImage(
                                            drawableRes = R.drawable.ic_background,
                                            alignment = ImageAlignment.BOTTOM_END,
                                            modifier = ServerModifier(
                                                weight = 1f,
                                                aspectRatio = 3f
                                            ),
                                            contentScale = ImageContentScale.FILL_WIDTH
                                        )
                                    )
                                ),
                                ServerRow(
                                    items = listOf(
                                        ServerText(
                                            text = "Overlay",
                                            modifier = ServerModifier(backgroundColor = "#FF0000")
                                        ),
                                        ServerSpacer(),
                                        ServerText(
                                            text = "Overlay",
                                            modifier = ServerModifier(backgroundColor = "#FF0000")
                                        ),
                                    ),
                                    modifier = ServerModifier(
                                        weight = 1f,
                                        aspectRatio = 3f
                                    ),
                                )
                            )
                        ),
                    )
                )
            )
        )
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        items(data.items) { item ->
            SDContent(item = item)
        }
    }
}