package com.tecvuna.thevunatec

import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AuthScreen() {
    var currentPage by remember { mutableStateOf(0) }

    val backDispatcher = LocalOnBackPressedDispatcherOwner.current


    val onBackPressedCallback = remember {
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Close the app instead of going back to the previous screen
                // Add any necessary logic here before closing the app
                backDispatcher!!.onBackPressedDispatcher.onBackPressed()
            }
        }
    }

    SideEffect {
        backDispatcher!!.onBackPressedDispatcher.addCallback(onBackPressedCallback)
        onBackPressedCallback.isEnabled = currentPage != 0
        onBackPressedCallback.isEnabled = currentPage != 1
        onBackPressedCallback.isEnabled = currentPage != 2

    }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalIndicator(currentPage, 3)

            Text("Welcome to the App!", style = MaterialTheme.typography.labelSmall)

            Spacer(modifier = Modifier.height(16.dp))

            Column(modifier = Modifier.fillMaxWidth()) {
                when (currentPage) {
                    0 -> SignInPage()
                    1 -> SignUpPage()
                    2 -> ForgotPasswordPage()
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Button(text = "Sign In", onClick = { currentPage = 0 }, selected = currentPage == 0)
                Spacer(modifier = Modifier.width(8.dp))
                Button(text = "Sign Up", onClick = { currentPage = 1 }, selected = currentPage == 1)
                Spacer(modifier = Modifier.width(8.dp))
                Button(
                    text = "Forgot Password",
                    onClick = { currentPage = 2 },
                    selected = currentPage == 2
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun SignInPage() {
    Column {
        TextField(
            value = "",
            onValueChange = { },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = "",
            onValueChange = { },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(text = "Sign In", onClick = { /* Handle sign in */ })
    }
}

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun SignUpPage() {
    Column {
        TextField(
            value = "",
            onValueChange = { },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = "",
            onValueChange = { },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(text = "Sign Up", onClick = { /* Handle sign up */ })
    }
}

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ForgotPasswordPage() {
    Column {
        TextField(
            value = "",
            onValueChange = { },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(text = "Reset Password", onClick = { /* Handle password reset */ })
    }
}

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun Button(text: String, onClick: () -> Unit, selected: Boolean = false) {
    Surface(
        modifier = Modifier
            .height(48.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .background(
                color = if (selected) MaterialTheme.colorScheme.primary else Color.LightGray,
                shape = RoundedCornerShape(24.dp)
            ),
        onClick = onClick
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall.copy(
                fontSize = 16.sp,
                color = if (selected) Color.White else MaterialTheme.colorScheme.onSurface
            ),
            modifier = Modifier.padding(vertical = 12.dp)
        )
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
            val indicatorColor = if (pageIndex <= currentPage) {
                MaterialTheme.colorScheme.primary
            } else {
                Color.LightGray
            }

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







        /*@Composable
        fun HorizontalIndicator(currentPage: Int, pageCount: Int) {
            Row(horizontalArrangement = Arrangement.Center) {
                repeat(pageCount) { pageIndex ->
                    val indicatorColor =
                        if (pageIndex == currentPage) MaterialTheme.colorScheme.primary else Color.LightGray

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(2.dp)
                            .padding(horizontal = 4.dp)
                            .background(
                                color = indicatorColor,
                                shape = RoundedCornerShape(6.dp)
                            )
                    )
                }

            }
        }*/

@Composable
fun App() {
    AuthScreen()
}

@Preview
@Composable
fun Preview() {
    App()
}


