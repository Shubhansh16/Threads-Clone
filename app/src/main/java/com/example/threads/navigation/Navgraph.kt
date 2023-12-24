package com.example.threads.navigation
import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.threads.screens.AddThread
import com.example.threads.screens.BottomNav
import com.example.threads.screens.Home
import com.example.threads.screens.Notification
import com.example.threads.screens.Profile
import com.example.threads.screens.Search
import com.example.threads.screens.Splash

@Composable
fun NavGraph(navController: NavHostController){

    NavHost(navController = navController,
        startDestination = Routes.Splash.routes){

        composable(Routes.Splash.routes)
        {
            Splash(navController)
        }
        composable(Routes.Home.routes)
        {
            Home()
        }
        composable(Routes.Search.routes)
        {
           Search()
        }
        composable(Routes.AddThread.routes)
        {
            AddThread()
        }
        composable(Routes.Notification.routes)
        {
            Notification()
        }
        composable(Routes.Profile.routes)
        {
            Profile()
        }
        composable(Routes.BottomNav.routes){
            BottomNav(navController)
        }
    }
}