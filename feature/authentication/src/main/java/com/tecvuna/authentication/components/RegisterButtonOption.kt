package com.tecvuna.authentication.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RegisterButtonOption(
    text: String,
    enable: Boolean = false,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .fillMaxWidth()
            .height(95.dp),
        shape = RoundedCornerShape(8.dp),
        enabled = enable
    ) {
        Text(
            text = text.uppercase(),
            modifier = Modifier.fillMaxWidth().padding(8.dp),
        )
    }

}