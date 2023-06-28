package com.tecvuna.alerts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet
import com.tecvuna.core.DestinationGraph.ALERTS_SCREEN_ROUTE
import com.tecvuna.core.DestinationGraph.AUTHENTICATION_ROUTE



@OptIn(ExperimentalMaterialNavigationApi::class)
fun NavGraphBuilder.alertsNavGraph(navController: NavController) {
    composable(route = ALERTS_SCREEN_ROUTE) {
        AlertsScreen()
    }
}

@Composable
fun AlertsScreen() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Alerts Screen"  )
    }

}