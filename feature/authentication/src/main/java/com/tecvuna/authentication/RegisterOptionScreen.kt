package com.tecvuna.authentication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tecvuna.authentication.components.RegisterButtonOption
import com.tecvuna.composables.AppButton
import androidx.compose.runtime.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun RegisterOptionScreen() {
    Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 30.dp)
            ) {
                AppButton(text = "Continue")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(vertical = 16.dp)
                .fillMaxSize()
        ) {
            DefaultHorizontalsIndicator()
            Spacer(modifier = Modifier.height(16.dp))
            RegisterOptionContent()

        }
    }

}

@Composable
fun RegisterOptionContent() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Text(
            text = "Create new account",
            fontSize = 20.sp,
            fontWeight = FontWeight.W400,
            lineHeight = 30.sp
        )
        Text(
            text = "Account status",
            fontSize = 14.sp,
            fontWeight = FontWeight.W700,
            lineHeight = 21.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Are you a farmer or a buyer?",
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Learn More",
                fontSize = 12.sp,
                fontWeight = FontWeight.W700,
                lineHeight = 18.sp
            )
        }

        RegisterButtonOption(
            text = "Farmer",
            onClick = {}
        )
        Spacer(modifier = Modifier.height(16.dp))
        RegisterButtonOption(
            text = "Buyer",
            onClick = {}
        )
    }

}

@Composable
fun DefaultHorizontalsIndicator() {
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
    ) {
        repeat(3) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(2.dp)
                    .padding(horizontal = 4.dp)
                    .background(
                        color = Color.LightGray,
                        shape = RoundedCornerShape(6.dp)
                    )
            )
        }

    }
}