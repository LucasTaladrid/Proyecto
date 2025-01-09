package com.example.proyecto.data.routes

sealed class Routes(val route: String) {
    object Login : Routes("login")
    object Register : Routes("register")
    object Pantalla1 : Routes("pantalla1")

}

