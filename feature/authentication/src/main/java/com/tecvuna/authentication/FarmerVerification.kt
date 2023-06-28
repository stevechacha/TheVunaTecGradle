package com.tecvuna.authentication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tecvuna.composables.AppButton
import com.tecvuna.theme.R

@Composable
@Preview
fun FarmerVerification() {
    Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 50.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                AppButton(
                    text = "Verify"
                )
                AppButton(
                    text = "SEND AGAIN (##s)"
                )
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(paddingValues),
            contentAlignment = Alignment.TopStart
        ){
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "One last step...",
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "SMS Verification",
                    style = MaterialTheme.typography.titleSmall,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(300.dp)
                    .padding(top = 30.dp),
                verticalArrangement = Arrangement.Center

            ) {
                Text(text = "Enter the 6-digit verification code:")
                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    items(6){
                        Box(
                            modifier = Modifier.size(50.dp)
                                .background(Color.LightGray),

                        ) {

                        }
                    }
                }

                Text(text = "Where can I find it?")
            }

        }


    }

}