package com.example.proyecto.ui.view

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyecto.data.routes.Routes

@Composable
fun Main(){
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = Routes.Login.route){
        composable(Routes.Login.route){Login(navController)}
        composable(Routes.Register.route){ RegisterScreen(navController) }
        composable(Routes.Pantalla1.route) { Pantalla1(navController) }

    }
}