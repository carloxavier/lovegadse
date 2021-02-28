package com.puppy.adoption.lovegadse.app.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.puppy.adoption.lovegadse.app.data.DependenciesHolder
import com.puppy.adoption.lovegadse.app.ui.theme.Typography

@Composable
fun Detail(dependencies: DependenciesHolder, puppyID: String, navController: NavController) {
    val puppy = dependencies.puppyRepository.findPuppy(puppyID)!!
    Column {
        Image(
            ColorPainter(Color.Blue),
            contentDescription = "$puppy picture",
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = puppy.name)
        Text(text = puppy.description, style = Typography.caption)
        Text(text = puppy.ownerPhoneNumber, style = Typography.caption)
    }
}