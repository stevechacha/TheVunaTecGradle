package com.tecvuna.authentication.buyer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tecvuna.composables.AppButton
import com.tecvuna.composables.AppOutlinedTextField

@Composable
@Preview
fun BuyerDetailScreen() {
    Scaffold(
    )
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(horizontal = 16.dp, vertical = 16.dp),
        ){
            Column(
                modifier = Modifier.fillMaxWidth()

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
            }
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "What is your company called?",
                    style = MaterialTheme.typography.labelMedium

                )
                AppOutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    hint = "Street Information"
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "What does your company do?",
                        style = MaterialTheme.typography.labelMedium

                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "Why?",
                        style = MaterialTheme.typography.labelMedium,
                        textDecoration = TextDecoration.Underline
                    )
                }
                AppOutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    hint = "Street Information"
                )
                Spacer(modifier = Modifier.height(12.dp))

                Text(text = "How would you like to receive products?")

                AppOutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    hint = "Street Information"
                )


            }
            Column (
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            ){
                AppButton(text = "Done")
            }

        }
    }


}