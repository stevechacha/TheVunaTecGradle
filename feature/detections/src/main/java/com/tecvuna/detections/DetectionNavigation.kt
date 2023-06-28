package com.tecvuna.detections

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
import com.tecvuna.core.DestinationGraph.AUTHENTICATION_ROUTE
import com.tecvuna.core.DestinationGraph.DETECTIONS_SCREEN_ROUTE


@OptIn(ExperimentalMaterialNavigationApi::class)
fun NavGraphBuilder.detectionsNavGraph(navController: NavController) {
    composable(route = DETECTIONS_SCREEN_ROUTE) {
        DetectionsScreen()
    }
}

@Composable
fun DetectionsScreen() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Detection Screen"  )
    }

}