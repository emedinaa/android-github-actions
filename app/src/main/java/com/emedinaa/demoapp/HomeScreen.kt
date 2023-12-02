package com.emedinaa.demoapp

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.emedinaa.demoapp.ui.theme.DemoAppTheme

@Suppress("FunctionNaming")
@Composable
fun HomeScreen(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Suppress("FunctionNaming")
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    DemoAppTheme {
        Greeting("Android")
    }
}
