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
                    spacing = 10f,
                    modifier = ServerModifier(
                        spacingStart = 10f,
                        spacingEnd = 10f,
                        spacingTop = 10f,
                        spacingBottom = 10f,
                        height = 100f
                    ),
                    subviews = listOf(
                        ServerColumn(
                            modifier = ServerModifier(weight = 1f, backgroundColor = "#00FF00", cornerRadius = 20f),
                            subviews = listOf(
                                ServerText(text = "Column Left"),
                                ServerSpacer(),
                                ServerText(text = "Column Left Description")
                            )
                        ),
                        ServerColumn(
                            modifier = ServerModifier(weight = 1f, backgroundColor = "#00FF00", cornerRadius = 20f),
                            subviews = listOf(
                                ServerText(text = "Column Right"),
                                ServerSpacer(),
                                ServerText(text = "Column Right Description")
                            )
                        )
                    )
                ),
                ServerRow(
                    modifier = ServerModifier(height = 150f, backgroundColor = "#00ffff"),
                    subviews = listOf(
                        ServerColumn(
                            modifier = ServerModifier(weight = 1f, backgroundColor = "#00ff00"),
                            subviews = listOf(
                                ServerRow(
                                    modifier = ServerModifier(weight = 0.5f, backgroundColor = "#ff0000"),
                                    subviews = listOf(
                                        ServerText(text = "row/column/row/text", modifier = ServerModifier(backgroundColor = "#ffff00"))
                                    )
                                ),
                                ServerRow(
                                    modifier = ServerModifier(weight = 0.5f, backgroundColor = "#0000ff"),
                                    subviews = listOf(
                                        ServerText(text = "row/column/row/text", modifier = ServerModifier(backgroundColor = "#ffff00"))
                                    )
                                )
                            )
                        )
                    )
                ),
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerRow(
                    modifier = ServerModifier(height = 150f, backgroundColor = "#00ffff"),
                    subviews = listOf(
                        ServerColumn(
                            modifier = ServerModifier(weight = 1f, backgroundColor = "#00ff00"),
                            subviews = listOf(
                                ServerRow(
                                    modifier = ServerModifier(weight = 0.5f, backgroundColor = "#ff0000"),
                                    subviews = listOf(
                                        ServerText(text = "row/column/row/text", modifier = ServerModifier(backgroundColor = "#ffff00"))
                                    )
                                ),
                            )
                        )
                    )
                ),
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerRow(
                    modifier = ServerModifier(height = 150f, backgroundColor = "#00ffff"),
                    subviews = listOf(
                        ServerColumn(
                            modifier = ServerModifier(weight = 1f, backgroundColor = "#00ff00"),
                            subviews = listOf(
                                ServerRow(
                                    modifier = ServerModifier(weight = 0.5f, backgroundColor = "#ff00ff"),
                                    subviews = listOf(
                                        ServerColumn(
                                            modifier = ServerModifier(weight = 0.5f, backgroundColor = "#ff0000"),
                                            subviews = listOf(
                                                ServerText(text = "row/column/row/text", modifier = ServerModifier(backgroundColor = "#ffff00"))
                                            )
                                        )
                                    )
                                ),
                            )
                        )
                    )
                ),
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerColumn(
                    modifier = ServerModifier(height = 150f, backgroundColor = "#00ffff"),
                    subviews = listOf(
                        ServerColumn(
                            modifier = ServerModifier(weight = 1f, backgroundColor = "#00ff00"),
                            subviews = listOf(
                                ServerRow(
                                    modifier = ServerModifier(weight = 0.5f, backgroundColor = "#ff0000"),
                                    subviews = listOf(
                                        ServerText(text = "row/column/row/text", modifier = ServerModifier(backgroundColor = "#ffff00"))
                                    )
                                ),
                                ServerRow(
                                    modifier = ServerModifier(weight = 0.5f, backgroundColor = "#0000ff"),
                                    subviews = listOf(
                                        ServerText(text = "row/column/row/text", modifier = ServerModifier(backgroundColor = "#ffff00"))
                                    )
                                )
                            )
                        )
                    )
                ),
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerRow(
                    modifier = ServerModifier(
                        spacingStart = 20f,
                        spacingEnd = 20f,
                        spacingTop = 20f,
                        spacingBottom = 20f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 20f
                    ),
                    subviews = listOf(
                        ServerRow(
                            subviews = listOf(
                                ServerRow(
                                    modifier = ServerModifier(
                                        spacingStart = 20f,
                                        spacingEnd = 20f,
                                        spacingTop = 20f,
                                        spacingBottom = 20f,
                                        weight = 1f,
                                        backgroundColor = "#00ff00",
                                        cornerRadius = 20f
                                    ),
                                    subviews = listOf(
                                        ServerText(text = "Row Border Background")
                                    )
                                )
                            )
                        )
                    )
                ),
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerRow(
                    subviews = listOf(
                        ServerText(text = "Left 30", modifier = ServerModifier(weight = 0.3f, backgroundColor = "#ff0000")),
                        ServerText(text = "Mid 50", modifier = ServerModifier(weight = 0.5f, backgroundColor = "#00ff00")),
                        ServerText(text = "Right 30", modifier = ServerModifier(weight = 0.3f, backgroundColor = "#0000ff")),
                    )
                ),
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerColumn(
                    modifier = ServerModifier(height = 200f, backgroundColor = "#ffff00"),
                    subviews = listOf(
                        ServerText(text = "Top 25 is going to get really long", modifier = ServerModifier(weight = 0.25f, backgroundColor = "#ff0000")),
                        ServerText(text = "Mid 50 is going to get really long", modifier = ServerModifier(weight = 0.5f, backgroundColor = "#00ff00")),
                        ServerText(text = "Bottom 25 is going to get really long", modifier = ServerModifier(weight = 0.25f, backgroundColor = "#0000ff")),
                    )
                ),
                ServerRow(
                    subviews = listOf(
                        ServerText(text = "Read Me"),
                        ServerText(
                            text = "Do Not Read",
                            modifier = ServerModifier(adaText = "Read Me")
                        ),
                        ServerText(text = "Read me Heading", isHeading = true),
                        ServerImage(
                            url = R.drawable.ic_disappointed,
                            modifier = ServerModifier(
                                adaText = "Disappointed",
                                height = 20f,
                                width = 20f
                            )
                        ),
                        ServerImage(
                            url = R.drawable.ic_disappointed,
                            modifier = ServerModifier(height = 20f, width = 20f)
                        )
                    )
                ),
                ServerRow(
                    modifier = ServerModifier(adaText = "Read Me"),
                    subviews = listOf(
                        ServerText(text = "Don't Read"),
                        ServerText(
                            text = "Don't Read",
                            modifier = ServerModifier(adaText = "Don't Read")
                        ),
                    )
                ),
                ServerCard(
                    subviews = listOf(ServerText(text = "Card"))
                ),
                ServerCard(
                    subviews = listOf(ServerText(text = "Card Padding")),
                    modifier = ServerModifier(
                        spacingStart = 30f,
                        spacingEnd = 30f,
                        spacingTop = 30f,
                        spacingBottom = 30f
                    )
                ),
                ServerCard(
                    subviews = listOf(
                        ServerColumn(
                            subviews = listOf(
                                ServerText(text = "Card Padding HW"),
                                ServerText(text = "Card 2")
                            )
                        )
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        spacingStart = 30f,
                        spacingEnd = 30f,
                        spacingTop = 30f,
                        spacingBottom = 30f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.CENTER,
                    subviews = listOf(
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
                    subviews = listOf(
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
                    subviews = listOf(
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
                    subviews = listOf(
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
                    subviews = listOf(
                        ServerText(text = "Row Padding HW"),
                        ServerText(text = "Row 2")
                    ),
                    spacing = 20f,
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        spacingStart = 30f,
                        spacingEnd = 30f,
                        spacingTop = 30f,
                        spacingBottom = 30f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 5f
                    )
                ),
                ServerRow(
                    subviews = listOf(
                        ServerText(text = "Row Padding HW"),
                        ServerText(text = "Row 2")
                    ),
                    spacing = 20f,
                    modifier = ServerModifier(
                        spacingStart = 30f,
                        spacingEnd = 30f,
                        spacingTop = 30f,
                        spacingBottom = 30f,
                        backgroundColor = "#ffff00",
                        cornerRadius = 5f
                    )
                ),
                ServerColumn(
                    subviews = listOf(
                        ServerText(text = "Col Padding HW"),
                        ServerText(text = "Col 2")
                    ),
                    spacing = 20f,
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f,
                        spacingStart = 30f,
                        spacingEnd = 30f,
                        spacingTop = 30f,
                        spacingBottom = 30f,
                        backgroundColor = "#00ff00",
                        cornerRadius = 5f
                    )
                ),
                ServerRow(
                    subviews = listOf(
                        ServerText(text = "Row"),
                        ServerColumn(
                            subviews = listOf(
                                ServerText(text = "Col Padding HW"),
                                ServerText(text = "Col 2")
                            ),
                            modifier = ServerModifier(
                                spacingStart = 30f,
                                spacingEnd = 30f,
                                spacingTop = 30f,
                                spacingBottom = 30f,
                                backgroundColor = "#00ff00",
                                cornerRadius = 5f
                            )
                        )
                    ),
                    modifier = ServerModifier(
                        spacingStart = 30f,
                        spacingEnd = 30f,
                        spacingTop = 30f,
                        spacingBottom = 30f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 5f
                    )
                ),
                ServerColumn(
                    subviews = listOf(
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
                    subviews = listOf(
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
                    subviews = listOf(
                        ServerRow(
                            subviews = listOf(
                                ServerText(text = "Row Border Background"),
                            ),
                            modifier = ServerModifier(
                                spacingBottom = 20f,
                                spacingTop = 20f,
                                spacingStart = 20f,
                                spacingEnd = 20f,
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
                        spacingBottom = 20f,
                        spacingTop = 20f,
                        spacingStart = 20f,
                        spacingEnd = 20f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 20f
                    )
                ),
                ServerRow(
                    subviews = listOf(
                        ServerRow(
                            subviews = listOf(
                                ServerText(text = "Row Border Background"),
                            ),
                            modifier = ServerModifier(
                                weight = 1f,
                                spacingBottom = 20f,
                                spacingTop = 20f,
                                spacingStart = 20f,
                                spacingEnd = 20f,
                                backgroundColor = "#00ff00",
                                cornerRadius = 20f
                            )
                        ),
                    ),
                    modifier = ServerModifier(
                        spacingBottom = 20f,
                        spacingTop = 20f,
                        spacingStart = 20f,
                        spacingEnd = 20f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 20f
                    )
                ),
                ServerRow(
                    subviews = listOf(
                        ServerColumn(
                            subviews = listOf(
                                ServerText(text = "Column Border Background"),
                            ),
                            modifier = ServerModifier(
                                weight = 1f,
                                spacingBottom = 20f,
                                spacingTop = 20f,
                                spacingStart = 20f,
                                spacingEnd = 20f,
                                backgroundColor = "#00ff00",
                                cornerRadius = 20f
                            )
                        ),
                    ),
                    modifier = ServerModifier(
                        spacingBottom = 20f,
                        spacingTop = 20f,
                        spacingStart = 20f,
                        spacingEnd = 20f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 20f
                    )
                ),
                ServerRow(
                    subviews = listOf(
                        ServerRow(
                            subviews = listOf(
                                ServerText(text = "Row Border Background"),
                            ),
                            modifier = ServerModifier(
                                weight = 0.25f,
                                spacingBottom = 20f,
                                spacingTop = 20f,
                                spacingStart = 20f,
                                spacingEnd = 20f,
                                backgroundColor = "#00ff00",
                                cornerRadius = 20f
                            )
                        ),
                    ),
                    modifier = ServerModifier(
                        weight = 1f,
                        spacingBottom = 20f,
                        spacingTop = 20f,
                        spacingStart = 20f,
                        spacingEnd = 20f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 20f
                    )
                ),
                ServerRow(
                    subviews = listOf(
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
                    subviews = listOf(
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
                    subviews = listOf(
                        ServerImage(
                            url = R.drawable.ic_disappointed,
                            modifier = ServerModifier(height = 20f, width = 20f)
                        ),
                        ServerImage(
                            url = R.drawable.ic_disappointed,
                            modifier = ServerModifier(
                                height = 20f,
                                width = 20f,
                                spacingStart = 20f,
                                spacingEnd = 20f,
                                spacingTop = 20f,
                                spacingBottom = 20f
                            )
                        ),
                    )
                ),
                ServerRow(
                    subviews = listOf(
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
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerRow(
                    subviews = listOf(
                        ServerText(
                            text = "Left 30",
                            modifier = ServerModifier(
                                weight = .3f,
                                spacingStart = 20f,
                                spacingEnd = 20f,
                                spacingTop = 20f,
                                spacingBottom = 20f, backgroundColor = "#ff0000"
                            )
                        ),
                        ServerText(
                            text = "Mid 50",
                            modifier = ServerModifier(
                                weight = .5f,
                                spacingStart = 20f,
                                spacingEnd = 20f,
                                spacingTop = 20f,
                                spacingBottom = 20f, backgroundColor = "#00ff00"
                            )
                        ),
                        ServerText(
                            text = "Right 30",
                            modifier = ServerModifier(
                                weight = .3f,
                                spacingStart = 20f,
                                spacingEnd = 20f,
                                spacingTop = 20f,
                                spacingBottom = 20f, backgroundColor = "#0000ff"
                            )
                        )
                    )
                ),
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerRow(
                    subviews = listOf(
                        ServerRow(
                            modifier = ServerModifier(width = 200f),
                            subviews = listOf(
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
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerRow(
                    modifier = ServerModifier(weight = 1f, backgroundColor = "#ffff00"),
                    subviews = listOf(
                        ServerText(
                            text = "Left 30 is going to get really long",
                            modifier = ServerModifier(weight = .3f, backgroundColor = "#ff0000")
                        ),
                        ServerText(
                            text = "Mid 50 is going to get really long",
                            modifier = ServerModifier(weight = .5f, backgroundColor = "#00ff00")
                        ),
                        ServerText(
                            text = "Right 30 is going to get really long",
                            modifier = ServerModifier(weight = .3f, backgroundColor = "#0000ff")
                        )
                    )
                ),
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerColumn( // This case also fails on iOS, dynamic sized view with weights in container direction
                    // View frames broken on iOS, does not render at all on android
                    modifier = ServerModifier(weight = 1f, backgroundColor = "#ffff00"),
                    subviews = listOf(
                        ServerText(
                            text = "Top 30 is going to get really long",
                            modifier = ServerModifier(weight = .3f, backgroundColor = "#ff0000")
                        ),
                        ServerText(
                            text = "Mid 50 is going to get really long",
                            modifier = ServerModifier(weight = .5f, backgroundColor = "#00ff00")
                        ),
                        ServerText(
                            text = "Bottom 30 is going to get really long",
                            modifier = ServerModifier(weight = .3f, backgroundColor = "#0000ff")
                        )
                    )
                ),
                ServerSpacer(modifier = ServerModifier(height = 10f)),
                ServerColumn(
                    modifier = ServerModifier(weight = 1f, height = 200f, backgroundColor = "#ffff00"),
                    // Even the with weight = 1f column does not fill screen horizontally
                    // Maybe this should be embedded in a row on android
                    subviews = listOf(
                        ServerText(
                            text = "Top 30 is going to get really long",
                            modifier = ServerModifier(weight = .3f, backgroundColor = "#ff0000")
                        ),
                        ServerText(
                            text = "Mid 50 is going to get really long",
                            modifier = ServerModifier(weight = .5f, backgroundColor = "#00ff00")
                        ),
                        ServerText(
                            text = "Bottom 30 is going to get really long",
                            modifier = ServerModifier(weight = .3f, backgroundColor = "#0000ff")
                        )
                    )
                ),
                ServerCard(
                    subviews = listOf(
                        ServerText(
                            text = "Card BG",
                            modifier = ServerModifier(backgroundColor = "#ff0000")
                        ),
                    ),
                    modifier = ServerModifier(
                        backgroundColor = "#ff0000",
                        cornerRadius = 60f,
                        spacingBottom = 20f,
                        spacingEnd = 20f,
                        spacingTop = 20f,
                        spacingStart = 20f,
                    )
                ),
                ServerRow(
                    subviews = listOf(
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
                    subviews = listOf(
                        ServerRow(
                            modifier = ServerModifier(
                                weight = 1f,
                                backgroundColor = "#ff0000",
                                cornerRadius = 60f,
                                spacingBottom = 20f,
                                spacingEnd = 20f,
                                spacingTop = 20f,
                                spacingStart = 20f,
                            ),
                            subviews = listOf()
                        )
                    )
                ),
                ServerText(
                    text = "Test",
                    modifier = ServerModifier(
                        backgroundColor = "#ff0000",
                        cornerRadius = 60f,
                        spacingBottom = 20f,
                        spacingEnd = 20f,
                        spacingTop = 20f,
                        spacingStart = 20f,
                    )
                ),
                ServerImage(
                    url = R.drawable.ic_running,
                    tint = "#FF0000",
                    modifier = ServerModifier(height = 20f, width = 20f)
                ),
                ServerColumn(
                    subviews = listOf(
                        ServerBox(
                            subviews = listOf(
                                ServerRow(
                                    subviews = listOf(
                                        ServerImage(
                                            url = R.drawable.ic_background,
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
                                    subviews = listOf(
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
                    subviews = listOf(
                        ServerBox(
                            subviews = listOf(
                                ServerRow(
                                    subviews = listOf(
                                        ServerImage(
                                            url = R.drawable.ic_background,
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
                                    subviews = listOf(
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
                ),
                ServerSpacer(modifier = ServerModifier(height = 20f))
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
