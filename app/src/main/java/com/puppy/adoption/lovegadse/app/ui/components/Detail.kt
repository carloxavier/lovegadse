package com.puppy.adoption.lovegadse.app.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.puppy.adoption.lovegadse.app.data.DependenciesHolder
import com.puppy.adoption.lovegadse.app.ui.theme.Typography
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun Detail(dependencies: DependenciesHolder, puppyID: String, navController: NavController) {
    val puppy = dependencies.puppyRepository.findPuppy(puppyID)!!
    Column {
        CoilImage(
            puppy.photoUrl,
            contentDescription = "$puppy picture",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            loading = {
                Box(Modifier.matchParentSize()) {
                    CircularProgressIndicator(Modifier.align(Alignment.Center))
                }
            }
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = puppy.name)
        Text(text = puppy.description, style = Typography.caption)
        Text(text = puppy.ownerPhoneNumber, style = Typography.caption)
    }
}