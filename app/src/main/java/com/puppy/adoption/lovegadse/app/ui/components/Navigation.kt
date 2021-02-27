package com.puppy.adoption.lovegadse.app.ui.components

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    Scaffold {
        rememberNavController().let { navController ->
            NavHost(navController, startDestination = Route.Home.path) {
                composable(Route.Home.path) {
                    Home(navController)
                }
                composable(Route.Detail.path) {
                    Detail(it.arguments!!.getString("puppyID")!!, navController)
                }
            }
        }
    }
}

sealed class Route(val path: String) {
    object Home : Route("home")
    object Detail : Route("detail/{puppyID}") {
        fun withParam(id: String) = path.replaceAfter('/', id)
    }
}
