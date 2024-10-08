package com.example.smartapp

// Screen.kt
sealed class Screen(val route: String) {

    object Login: Screen("login_screen")
    object Registration: Screen("registration_screen")
    object Home: Screen("home_screen")
    object FeedBack: Screen("feed_back")
}