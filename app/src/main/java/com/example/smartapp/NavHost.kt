package com.example.smartapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smartapp.screens.FeedBack
import com.example.smartapp.screens.LoginScreen
import com.example.smartapp.screens.RegistrationScreen
import com.example.smartapp.screens.ScreeningQuestions

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        // add all destinations here
        composable(route = "login") { LoginScreen(navController) } // login destination
        composable(route = "registration") { RegistrationScreen (navController) } // registration destination
        composable(route = "homepage") { ScreeningQuestions (navController) } // screening questions destination
        composable(route = "feedBack") { FeedBack (navController) } // Feedback destination

    }

}
