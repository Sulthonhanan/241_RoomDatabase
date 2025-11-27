package com.example.roomdatabase.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.roomdatabase.view.EntrySiswaScreen
import com.example.roomdatabase.view.HomeScreen
import com.example.roomdatabase.view.route.DestinasiEntry
import com.example.roomdatabase.view.route.DestinasiHome


@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {

        composable(route = DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(route = DestinasiEntry.route)
                }
            )
        }


        composable(route = DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}


