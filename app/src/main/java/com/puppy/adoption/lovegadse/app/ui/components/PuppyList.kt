package com.puppy.adoption.lovegadse.app.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.puppy.adoption.lovegadse.app.data.Puppy
import com.puppy.adoption.lovegadse.app.data.PuppyRepository
import com.puppy.adoption.lovegadse.app.ui.theme.LoveGadseTheme


@Composable
fun PuppyList(
    puppies: List<Puppy>,
    navController: NavHostController,
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    ) {
        items(puppies) { puppy ->
            PuppyCard(puppy, navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewPuppyList() {
    LoveGadseTheme {
        Surface(color = MaterialTheme.colors.background) {
            PuppyList(
                PuppyRepository().puppies(),
                rememberNavController(),
            )
        }
    }
}