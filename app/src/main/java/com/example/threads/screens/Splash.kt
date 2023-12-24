package com.example.threads.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.threads.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavHostController){

    Text(text = "Splash Screen")

    LaunchedEffect( key1  = true){
        delay(3000)

        navController.navigate(Routes.Splash.routes)
    }
}