package com.tecvuna.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import java.util.Locale

@Composable
fun AppButton(
    text: String,
    enable: Boolean = false
) {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(8.dp),
        enabled = enable,
        modifier = Modifier.fillMaxWidth()
            .height(58.dp)
    ) {
        Text(
            text = text.uppercase(),
            modifier = Modifier.padding(8.dp),
        )
    }

}