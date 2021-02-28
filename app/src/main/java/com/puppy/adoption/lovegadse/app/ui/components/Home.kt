package com.puppy.adoption.lovegadse.app.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.puppy.adoption.lovegadse.app.data.DependenciesHolder
import com.puppy.adoption.lovegadse.app.data.PuppyRepository
import com.puppy.adoption.lovegadse.app.ui.theme.LoveGadseTheme


@Composable
fun Home(dependencies: DependenciesHolder, navController: NavHostController) {
    val puppyRepository = dependencies.puppyRepository
    LoveGadseTheme {
        Surface(color = MaterialTheme.colors.background) {
            PuppyList(
                puppyRepository.puppies(),
                navController
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewHome() {
    val navController = rememberNavController()
    val dependencies = object : DependenciesHolder {
        override val puppyRepository by lazy { PuppyRepository() }
    }
    LoveGadseTheme {
        Surface(color = MaterialTheme.colors.background) {
            Home(dependencies, navController)
        }
    }
}