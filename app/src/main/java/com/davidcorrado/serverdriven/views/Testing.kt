package com.davidcorrado.serverdriven.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("Testing2")
@Composable
fun Testing2Preview() {
    Column {
        Surface {
            Column(modifier = Modifier.fillMaxWidth()) {
                Image(
                    modifier = Modifier.padding(20.dp).height(20.dp).width(20.dp),
                    painter = painterResource(com.davidcorrado.serverdriven.R.drawable.ic_disappointed),
                    contentDescription = "Test"
                )
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
                                width = 0f,
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
                        width = 0f,
                        backgroundColor = "#ff0000",
                        cornerRadius = 20f
                    )
                ),
                ServerSpacer(
                    modifier = ServerModifier(
                        width = 0f,
                        height = 20f,
                        backgroundColor = "#0000ff",
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
                            drawableRes = com.davidcorrado.serverdriven.R.drawable.ic_disappointed,
                            modifier = ServerModifier(height = 24f, width = 24f)
                        ),
                        //The below does not work padding and height and width do not work together with padding right.  Padding goes inside of height and width
//                        ServerImage(
//                            drawableRes = com.davidcorrado.serverdriven.R.drawable.ic_disappointed,
//                            modifier = ServerModifier(
//                                height = 24f,
//                                width = 24f,
//                                paddingStart = 20f,
//                                paddingEnd = 20f,
//                                paddingTop = 20f,
//                                paddingBottom = 20f
//                            )
//                        ),
                    )
                )
            )
        )
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)
    ) {
        items(data.items) { item ->
            SDContent(item = item, this)
        }
    }
}