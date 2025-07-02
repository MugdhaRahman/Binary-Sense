package com.mrapps.binarysense

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    Scaffold(
        topBar = {
            Box {
                TopAppBar(
                    title = {
                        Text(
                            text = "Binary Sense",
                            style = MaterialTheme.typography.titleLarge
                        )
                    },
                    actions = {
                        Icon(
                            imageVector = Icons.Outlined.Settings,
                            contentDescription = "Settings",
                            modifier = Modifier.padding(end = 16.dp)
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
        // Content of the main screen goes here
        Box(modifier = Modifier.padding(innerPadding)) {
            // Add your content here
        }
    }
}
@Preview
@Composable
fun PreviewHomeScreen() {
    MainScreen()

}