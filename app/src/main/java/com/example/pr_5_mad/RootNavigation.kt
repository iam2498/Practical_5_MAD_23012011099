package com.example.pr_5_mad

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pr_5_mad.screen.Login
import com.example.pr_5_mad.screen.RegisterPage

@Composable
fun RootNavigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            Login(
                onSignUpClick = {
                    navController.navigate("register")
                }
            )
        }

        composable("register") {
            RegisterPage(
                onLoginClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
