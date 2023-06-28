package com.tecvuna.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppOutlinedTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    hint: String = "",
    maxLines: Int = 1
) {

    val colors = TextFieldDefaults.outlinedTextFieldColors(
        containerColor = Color.LightGray,
        focusedBorderColor = Color.Transparent,
        unfocusedBorderColor = Color.Transparent,
    )

    OutlinedTextField(

            value = value,
            onValueChange = {
                onValueChange(it)
            },
            placeholder = {
                Text(
                    text = hint,
                )
            },
            singleLine = true,
            colors = colors,
            modifier = modifier,
            shape = RoundedCornerShape(8.dp),
             maxLines = maxLines


        )

}

@Composable
@Preview(showBackground = true)
fun PreviewAppOutlinedTextField() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        AppOutlinedTextField(
            hint = "Hello World",
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        AppOutlinedTextField(
            hint = "Hello World",
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
    }


}