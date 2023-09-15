package com.rujirakongsomran.jc_loginscreen

sealed class Screen(val route: String) {
    object Login : Screen(route = "login_screen")
    object Home : Screen(route = "home_screen")
}