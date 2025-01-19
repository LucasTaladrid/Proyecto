package com.example.proyecto.data.routes

sealed class Routes(val route: String) {
    object Login : Routes("login")
    object Register : Routes("register")
    object Pantalla1 : Routes("pantalla1")
    object Pantalla2 : Routes("pantalla2")
    object Pantalla3 : Routes("pantalla3")
    object Pantalla4 : Routes("pantalla4")

}

