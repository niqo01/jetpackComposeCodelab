package com.nicolasmilliard.testcompose.ui

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun Codelab1Screen(names: List<String> = listOf("Android", "there")) {
    Column(modifier = Modifier.fillMaxHeight()) {
        Column(modifier = Modifier.weight(1f)) {
            for (name in names) {
                Greeting(name = name)
                Divider(color = Color.Black)
            }
        }
        Counter()
    }
}

@Composable
fun Greeting(name: String) {
    Text(
            text = "Hello $name!",
            Modifier.padding(24.dp),
            style = MaterialTheme.typography.h1)
}

@Composable
fun Counter() {
    val count = remember { mutableStateOf(0) }
    Button(
            onClick = { count.value++ },
            backgroundColor = if (count.value > 5) Color.Green else Color.White) {
        Text("I have benn clicked ${count.value} times")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApp {
        Codelab1Screen()
    }
}