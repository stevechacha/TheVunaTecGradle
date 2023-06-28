package com.tecvuna.authentication.farmers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tecvuna.authentication.farmers.tabs.FarmerFarmDetailsScreen
import com.tecvuna.authentication.farmers.tabs.FarmerLoginDetailsScreen
import com.tecvuna.authentication.farmers.tabs.FarmerPersonalDetailsScreen

@Composable
@Preview
fun FarmerRegistrationScreen() {
    val currentPage by remember { mutableStateOf(0) }
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 16.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalIndicator(currentPage, 3)
            Column(modifier = Modifier.fillMaxWidth()) {
                when (currentPage) {
                    0 -> FarmerFarmDetailsScreen()
                    1 -> FarmerPersonalDetailsScreen()
                    2 -> FarmerLoginDetailsScreen()
                }
            }
        }
    }

}

@Composable
fun HorizontalIndicator(currentPage: Int, pageCount: Int) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 12.dp)
    ) {
        repeat(pageCount) { pageIndex ->
            val indicatorColor =
                if (pageIndex == currentPage) MaterialTheme.colorScheme.primary else Color.LightGray

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(3.dp)
                    .padding(horizontal = 4.dp)
                    .background(
                        color = indicatorColor,
                        shape = RoundedCornerShape(6.dp)
                    )
            )
        }

    }
}