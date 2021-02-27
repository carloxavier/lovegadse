package com.puppy.adoption.lovegadse.app.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.puppy.adoption.lovegadse.app.ui.theme.LoveGadseTheme


@Composable
fun Home(navController: NavHostController) {
    LoveGadseTheme {
        Surface(color = MaterialTheme.colors.background) {
            PuppyList(
                listOf(
                    "Water-gadse",
                    "Bell-gadse",
                    "Winter-gadse",
                ),
                navController
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewHome() {
    val navController = rememberNavController()
    LoveGadseTheme {
        Surface(color = MaterialTheme.colors.background) {
            Home(navController)
        }
    }
}