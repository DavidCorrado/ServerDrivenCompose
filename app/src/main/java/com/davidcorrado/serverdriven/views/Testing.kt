package com.davidcorrado.serverdriven.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.davidcorrado.serverdriven.ui.sd.data.*
import com.davidcorrado.serverdriven.ui.sd.view.SDContent

@Preview("Testing2")
@Composable
fun Testing2Preview() {
    Column {
        Card(
            modifier = Modifier
                .size(Dp(200f), Dp(200f))
                .background(Color.Green)
        ) {
            Text("Test", modifier = Modifier.background(Color.Red))
            Text("Test", modifier = Modifier.background(Color.Red))
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
                                ServerText(text = "Card2")
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
                    alignment = ServerAlignment.TOP_START,
                    items = listOf(
                        ServerText(text = "Column Top Start"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.TOP_CENTER,
                    items = listOf(
                        ServerText(text = "Column Top Center"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.TOP_END,
                    items = listOf(
                        ServerText(text = "Column Top End"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.CENTER_START,
                    items = listOf(
                        ServerText(text = "Column Center Start"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.CENTER_CENTER,
                    items = listOf(
                        ServerText(text = "Column Center Center"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.CENTER_END,
                    items = listOf(
                        ServerText(text = "Column Center End"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.BOTTOM_START,
                    items = listOf(
                        ServerText(text = "Column Bottom Start"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.BOTTOM_CENTER,
                    items = listOf(
                        ServerText(text = "Column Bottom Center"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerColumn(
                    alignment = ServerAlignment.BOTTOM_END,
                    items = listOf(
                        ServerText(text = "Column Bottom End"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.TOP_START,
                    items = listOf(
                        ServerText(text = "Row Top Start"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.TOP_CENTER,
                    items = listOf(
                        ServerText(text = "Row Top Center"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.TOP_END,
                    items = listOf(
                        ServerText(text = "Row Top End"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.CENTER_START,
                    items = listOf(
                        ServerText(text = "Row Center Start"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.CENTER_CENTER,
                    items = listOf(
                        ServerText(text = "Row Top Center"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.CENTER_END,
                    items = listOf(
                        ServerText(text = "Row Center End"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.BOTTOM_START,
                    items = listOf(
                        ServerText(text = "Row Bottom Center"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.BOTTOM_CENTER,
                    items = listOf(
                        ServerText(text = "Row Bottom Center"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
                    )
                ),
                ServerRow(
                    alignment = ServerAlignment.BOTTOM_END,
                    items = listOf(
                        ServerText(text = "Row Bottom End"),
                    ),
                    modifier = ServerModifier(
                        width = 200f,
                        height = 200f
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
                        paddingBottom = 30f
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
                        paddingBottom = 30f
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
                                paddingBottom = 30f
                            )
                        )
                    ),
                    modifier = ServerModifier(
                        paddingStart = 30f,
                        paddingEnd = 30f,
                        paddingTop = 30f,
                        paddingBottom = 30f
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
                        height = 200f
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
                        height = 200f
                    )
                ),
            )
        )
    LazyColumn {
        items(data.items) { item ->
            SDContent(item = item, this)
        }
    }
}