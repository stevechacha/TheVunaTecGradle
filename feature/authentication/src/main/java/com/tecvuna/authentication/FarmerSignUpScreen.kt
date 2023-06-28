package com.tecvuna.authentication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tecvuna.composables.AppButton
import com.tecvuna.composables.AppOutlinedTextField


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun FarmerSignUpScreen() {
    Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 30.dp)
            ) {
                AppButton(text = "Done")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 24.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            Text(
                text = "Tell us about you",
                fontSize = 20.sp,
                fontWeight = FontWeight.W400,
                lineHeight = 30.sp
            )
            Text(
                text = "Farmer Detail",
                fontSize = 14.sp,
                fontWeight = FontWeight.W700,
                lineHeight = 21.sp
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 35.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "What do you want to sell?",
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

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "How would you like to ship your products?",
                fontSize = 14.sp,
                fontWeight = FontWeight.W700,
                lineHeight = 21.sp
            )
            AppOutlinedTextField(
                hint = "Buyer Pick Up / Buyer Organized",
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth()
            )


        }
    }
}