package com.tecvuna.thevunatec.bottom_nav

import androidx.annotation.DrawableRes
import com.tecvuna.thevunatec.R
import com.tecvuna.core.DestinationGraph.ALERTS_SCREEN_ROUTE
import com.tecvuna.core.DestinationGraph.CALENDER_SCREEN_ROUTE
import com.tecvuna.core.DestinationGraph.DETECTIONS_SCREEN_ROUTE
import com.tecvuna.core.DestinationGraph.FARM_SCREEN_ROUTE
import com.tecvuna.core.DestinationGraph.PAYMENTS_SCREEN_ROUTE

enum class BottomBarDestination(val route: String, @DrawableRes val icon: Int, val title: String) {
    FARM(FARM_SCREEN_ROUTE, R.drawable.home_icon, "Farm"),
    CALENDER(CALENDER_SCREEN_ROUTE, R.drawable.calenda_icon, "Calender"),
    DETECTIONS(DETECTIONS_SCREEN_ROUTE, R.drawable.data_icon, "Data"),
    PAYMENTS(PAYMENTS_SCREEN_ROUTE, R.drawable.payment_icon, "Payment"),
    ALERTS(ALERTS_SCREEN_ROUTE, R.drawable.alert_icon, "Alerts")

}