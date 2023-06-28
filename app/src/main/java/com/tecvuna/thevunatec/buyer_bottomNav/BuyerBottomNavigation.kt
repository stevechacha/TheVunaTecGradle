package com.tecvuna.thevunatec.buyer_bottomNav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalAbsoluteTonalElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.tecvuna.core.DestinationGraph
import com.tecvuna.thevunatec.bottom_nav.BottomBarDestination

@Composable
fun BuyerBottomNavigation(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val isShowBottomBar = when (currentDestination?.route) {
        DestinationGraph.BROWS_SCREEN_ROUTE, DestinationGraph.PAYMENTS_SCREEN_ROUTE, DestinationGraph.ACCOUNTS_SCREEN_ROUTE, null -> true
        else -> false
    }

    if (isShowBottomBar){
        NavigationBar(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background),
            containerColor = MaterialTheme.colorScheme.background,
            tonalElevation = LocalAbsoluteTonalElevation.current,
        ) {
            BuyerBottomBarDestinations.values().asList().forEach { destination ->
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
                            popUpTo(DestinationGraph.BROWS_SCREEN_ROUTE) { inclusive = false }
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

@Composable
@Preview
fun BuyerBottomNavigationPreview() {
    BuyerBottomNavigation(navController = NavHostController(LocalContext.current))
}