package com.puppy.adoption.lovegadse.app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.puppy.adoption.lovegadse.app.data.Puppy
import com.puppy.adoption.lovegadse.app.ui.theme.Typography
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppyCard(
    puppy: Puppy,
    navController: NavHostController,
) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .clickable {
                navController.navigate(Route.Detail.withParam(puppy.name))
            },
        elevation = 0.dp,
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            CoilImage(
                puppy.photoUrl,
                contentDescription = "$puppy picture",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp)),
                loading = {
                    Box(Modifier.matchParentSize()) {
                        CircularProgressIndicator(Modifier.align(Alignment.Center))
                    }
                },
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = puppy.name)
            Text(text = puppy.description, style = Typography.caption)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewPuppyCard() {
    PuppyCard(
        Puppy(
            name = "Paquita",
            description = "Clothes destroyer, be careful.. but will never harm people",
            photoUrl = "https://images.pexels.com/photos/2171583/pexels-photo-2171583.jpeg?w=400&q=30",
            ownerPhoneNumber = "09001728888"
        ),
        rememberNavController(),
    )
}