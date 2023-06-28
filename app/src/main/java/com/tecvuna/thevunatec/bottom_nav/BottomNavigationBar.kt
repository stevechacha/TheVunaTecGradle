package com.tecvuna.thevunatec.bottom_nav

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

import com.tecvuna.core.DestinationGraph.ALERTS_SCREEN_ROUTE
import com.tecvuna.core.DestinationGraph.CALENDER_SCREEN_ROUTE
import com.tecvuna.core.DestinationGraph.DETECTIONS_SCREEN_ROUTE
import com.tecvuna.core.DestinationGraph.FARM_SCREEN_ROUTE
import com.tecvuna.core.DestinationGraph.PAYMENTS_SCREEN_ROUTE


@SuppressLint("RememberReturnType")
@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val isShowBottomBar = when (currentDestination?.route) {
        FARM_SCREEN_ROUTE, CALENDER_SCREEN_ROUTE, DETECTIONS_SCREEN_ROUTE,PAYMENTS_SCREEN_ROUTE, ALERTS_SCREEN_ROUTE, null -> true
        else -> false
    }

    if (isShowBottomBar){
        NavigationBar(
            modifier = Modifier
                .fillMaxWidth(),
            containerColor = MaterialTheme.colorScheme.background,
            tonalElevation = LocalAbsoluteTonalElevation.current,
        ) {
            BottomBarDestination.values().asList().forEach { destination ->
                NavigationBarItem(
                    selected = currentDestination?.hierarchy?.any { it.route == destination.route } == true,
                    icon = {
                        Icon(
                            painterResource(id = destination.icon),
                            contentDescription = destination.title,
                            tint = if (currentDestination?.route == destination.route) {
                                MaterialTheme.colorScheme.primary
                            } else {
                                MaterialTheme.colorScheme.onSurfaceVariant
                            },
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    label = {
                        Text(
                            text = destination.title,
                            color = if (currentDestination?.route == destination.route) {
                                MaterialTheme.colorScheme.primary
                            } else {
                                MaterialTheme.colorScheme.onSurfaceVariant
                            },
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            overflow = TextOverflow.Ellipsis,

                        )
                    },
                    alwaysShowLabel = true,
                    onClick = {
                        navController.navigate(destination.route) {
                            popUpTo(FARM_SCREEN_ROUTE) { inclusive = false }
                            launchSingleTop = false
                            restoreState = false
                        }
                    },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = MaterialTheme.colorScheme.background,
                        selectedIconColor = MaterialTheme.colorScheme.primary,
                        selectedTextColor = MaterialTheme.colorScheme.primary,
                        )

                )
            }
        }
    }

}


@Preview
@Composable
fun BottomNavigationPreview() {
    BottomNavigationBar(rememberNavController())

}