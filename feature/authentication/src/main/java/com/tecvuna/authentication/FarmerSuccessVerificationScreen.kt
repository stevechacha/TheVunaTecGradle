package com.tecvuna.authentication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tecvuna.composables.AppButton
import com.tecvuna.theme.R

@Composable
@Preview
fun FarmerSuccessVerificationScreen() {
    Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 50.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                AppButton(
                    text = "Done"
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
                    text = "Verification Successful!",
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "Welcome to Vunatec.",
                    style = MaterialTheme.typography.titleSmall,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center)
                    .size(200.dp)
                    .padding(top = 30.dp),
                verticalArrangement = Arrangement.Center

            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_image),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    tint = MaterialTheme.colorScheme.primary
                )
            }

        }


    }

}