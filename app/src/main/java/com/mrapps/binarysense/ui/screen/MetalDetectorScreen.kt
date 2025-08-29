package com.mrapps.binarysense.ui.screen

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MetalDetectorScreen(navController: NavController) {

    Scaffold(

        topBar = {
            Box {
                TopAppBar(
                    navigationIcon = {
                        IconButton(
                            onClick = { navController.navigate("main_screen") }
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.KeyboardArrowLeft,
                                contentDescription = "Back"
                            )
                        }
                    },
                    title = {
                        Text(
                            text = "Binary Sense",
                            style = MaterialTheme.typography.titleLarge
                        )
                    },
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .fillMaxWidth()
                        .shadow(elevation = 4.dp)

                )
            }
        }

    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {




        }

    }

}

@Preview
@Composable
fun PreviewMetalDetectorScreen() {
    MetalDetectorScreen(navController = NavController(LocalContext.current))
}
