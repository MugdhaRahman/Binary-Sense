package com.mrapps.binarysense

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mrapps.binarysense.ui.theme.BinarySenseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
                setContent {
                    BinarySenseTheme {
                        MainScreen()

                    }
                }
            }
        }

        @Preview(showBackground = true)
        @Composable
        fun GreetingPreview() {
            BinarySenseTheme {
                MainScreen()
            }
        }