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
import com.tecvuna.composables.AppButton
import com.tecvuna.composables.AppOutlinedTextField

@Composable
@Preview
fun FarmerPersonalDetailsScreen() {
    Scaffold(
        topBar = {


        },
        bottomBar = {
            Column(
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 50.dp)
            ) {
                AppButton(
                    text = "Done"
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
                        text = "Tell us about you...",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        text = "Personal Details",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )


                }
            }


            item {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Tell us your name:",
                        style = MaterialTheme.typography.labelMedium
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    AppOutlinedTextField(
                        value =  "",
                        onValueChange ={},
                        modifier = Modifier.fillMaxWidth(),
                        hint = "First Name"
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    AppOutlinedTextField(
                        value =  "",
                        onValueChange ={},
                        modifier = Modifier.fillMaxWidth(),
                        hint = "Last Name"
                    )

                }
            }

            item {
                Spacer(modifier = Modifier.height(8.dp))

            }

            item {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Tell us your location:",
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
                        value =  "",
                        onValueChange ={},
                        modifier = Modifier.fillMaxWidth(),
                        hint = "Street Information"
                    )

                }

            }

            item {
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(.5f),
                        verticalArrangement = Arrangement.Center
                    ) {
                        AppOutlinedTextField(
                            value =  "",
                            onValueChange ={},
                            modifier = Modifier.fillMaxWidth(),
                            hint = "Region/Province"
                        )

                    }

                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        AppOutlinedTextField(
                            value =  "",
                            onValueChange ={},
                            modifier = Modifier.fillMaxWidth(),
                            hint = "Zip Code"
                        )

                    }
                }
            }

            item {
                AppOutlinedTextField(
                    value =  "",
                    onValueChange ={},
                    modifier = Modifier.fillMaxWidth(),
                    hint = "Country"
                )
            }

            item {
                Spacer(modifier = Modifier.height(8.dp))
            }

        }
    }
}
