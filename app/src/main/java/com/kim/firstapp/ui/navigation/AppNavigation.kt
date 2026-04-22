package com.kim.firstapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kim.firstapp.ui.pages.onboarding.OnboardingScreen

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier){
    NavHost(
        navController=navController,
        startDestination = Routes.OnBoarding
    ){
        composable (Routes.OnBoarding.name){ OnboardingScreen(navController) }

    }
}
