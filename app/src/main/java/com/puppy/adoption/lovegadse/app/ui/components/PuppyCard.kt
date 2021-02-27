package com.puppy.adoption.lovegadse.app.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.puppy.adoption.lovegadse.app.ui.theme.Typography

@Composable
fun PuppyCard(puppy: String) {
    Card(modifier = Modifier.padding(16.dp), elevation = 4.dp) {
        Column(modifier = Modifier.padding(8.dp)) {
            Image(
                ColorPainter(Color.Blue),
                contentDescription = "$puppy picture",
                modifier = Modifier.height(200.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp))
            )
            Text(text = puppy)
            Text(text = "puppy description", style = Typography.caption)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewPuppyCard() {
    PuppyCard("Bellgadse")
}