package com.example.proyecto.ui.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController



@Composable
fun Pantalla4(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp) // Padding alrededor del marco
    ) {
        // Área de Contenido (con el borde)
        Box(
            modifier = Modifier
                .weight(1f) // Ocupa todo el espacio disponible
                .fillMaxWidth()
                .border(2.dp, Color.Black) // Borde del marco
        ) {
            Text("Contenido Principal Pantalla 4", modifier = Modifier.align(Alignment.Center))
        }

        // Fila de Botones
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp) // Padding alrededor de los botones
        ) {
            // Botón 1
            Button(
                onClick = { navController.navigate("pantalla1") /* Acción del Botón 1 */ },
                modifier = Modifier.weight(1f) // Ocupa el mismo espacio que los demás botones
            ) {
                Text("Botón 1")
            }
            // Botón 2
            Button(
                onClick = { navController.navigate("pantalla2") /* Acción del Botón 1 */ },
                modifier = Modifier.weight(1f) // Ocupa el mismo espacio que los demás botones
            ) {
                Text("Botón 2")
            }
            // Botón 3
            Button(
                onClick = { navController.navigate("pantalla3")  },
                modifier = Modifier.weight(1f) // Ocupa el mismo espacio que los demás botones
            ) {
                Text("Botón 3")
            }
            Button(
                onClick = { navController.navigate("pantalla4")  },
                modifier = Modifier.weight(1f) // Ocupa el mismo espacio que los demás botones
            ) {
                Text("Botón 4")

            }
        }
    }
}

