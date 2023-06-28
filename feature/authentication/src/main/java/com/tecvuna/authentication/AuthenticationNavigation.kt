package com.tecvuna.authentication

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet
import com.tecvuna.core.DestinationGraph.AUTHENTICATION_ROUTE



fun NavGraphBuilder.authenticationNavGraph(navController: NavController) {
    composable(route = AUTHENTICATION_ROUTE) {
        AuthenticationScreen(navController)
    }
}

@Composable
fun AuthenticationScreen(navController: NavController) {

}