package com.tecvuna.thevunatec.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tecvuna.alerts.alertsNavGraph
import com.tecvuna.authentication.authenticationNavGraph
import com.tecvuna.calender.calenderNavGraph
import com.tecvuna.core.DestinationGraph.FARM_SCREEN_ROUTE
import com.tecvuna.detections.detectionsNavGraph
import com.tecvuna.farm.farmNavGraph
import com.tecvuna.payments.paymentsNavGraph

@Composable
fun RootGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = FARM_SCREEN_ROUTE
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        authenticationNavGraph(navController)
        farmNavGraph(navController)
        calenderNavGraph(navController)
        detectionsNavGraph(navController)
        paymentsNavGraph(navController)
        alertsNavGraph(navController)
    }
}


