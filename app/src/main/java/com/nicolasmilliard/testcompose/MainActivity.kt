package com.nicolasmilliard.testcompose

import CodeLabScreen3
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.nicolasmilliard.testcompose.ui.Codelab1Screen
import com.nicolasmilliard.testcompose.ui.Codelab2Screen
import com.nicolasmilliard.testcompose.ui.MyApp
import com.nicolasmilliard.testcompose.ui.TestComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp{
                CodeLabScreen3()
            }
        }
    }
}


