package com.tecvuna.thevunatec.buyer_bottomNav

import androidx.annotation.DrawableRes
import com.tecvuna.core.DestinationGraph
import com.tecvuna.thevunatec.R

enum class BuyerBottomBarDestinations(val route: String, @DrawableRes val icon: Int, val title: String) {
    BROWS(DestinationGraph.BROWS_SCREEN_ROUTE, R.drawable.brows_icon, "Brows"),
    PAYMENTS(DestinationGraph.PAYMENTS_SCREEN_ROUTE, R.drawable.payment_icon, "Payment"),
    ACCOUNTS(DestinationGraph.ACCOUNTS_SCREEN_ROUTE, R.drawable.account_icon, "Accounts")

}