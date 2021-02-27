package com.puppy.adoption.lovegadse.app.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.puppy.adoption.lovegadse.app.ui.theme.LoveGadseTheme


@Composable
fun Home() {
    LoveGadseTheme {
        Surface(color = MaterialTheme.colors.background) {
            PuppyList(
                listOf(
                    "Water-gadse",
                    "Bell-gadse",
                    "Winter-gadse",
                ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewHome() {
    LoveGadseTheme {
        Surface(color = MaterialTheme.colors.background) {
            Home()
        }
    }
}