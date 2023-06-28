package com.tecvuna.authentication.farmers.tabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
fun FarmerLoginDetailsScreen() {
    Scaffold(
        topBar = {


        },
        bottomBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 50.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "By registering, I agree to the Privacy Policy",
                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.W700,
                    lineHeight = 15.sp,
                    fontSize = 10.sp

                    )
                AppButton(
                    text = "Register"
                )
            }

        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier.padding(horizontal = 16.dp),
            contentPadding = paddingValues,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            item {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Set up your account...",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        text = "Login Details",
                        style = MaterialTheme.typography.titleSmall,
                    )

                }
            }


            item {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Enter your email address:",
                            style = MaterialTheme.typography.labelMedium

                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Learn More",
                            style = MaterialTheme.typography.labelMedium,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                    AppOutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        hint = "First Name"
                    )
                }
            }
            item {
                Spacer(modifier = Modifier.height(8.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Enter your phone number:",
                            style = MaterialTheme.typography.labelMedium

                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Learn More",
                            style = MaterialTheme.typography.labelMedium,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                    AppOutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        hint = "First Name"
                    )
                }
            }


            item {
                Spacer(modifier = Modifier.height(8.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Enter your password:",
                            style = MaterialTheme.typography.labelMedium

                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Learn More",
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

                }

            }


            item {
                Spacer(modifier = Modifier.height(8.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {

                    Text(
                        text = "Re-enter your password:",
                        style = MaterialTheme.typography.labelMedium

                    )
                    AppOutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        hint = "Street Information"
                    )

                }

            }

            item {
                Spacer(modifier = Modifier.height(8.dp))
            }

        }
    }
}