package com.example.workermanagercounttime.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.workermanagercounttime.ui.model.HomeViewModel

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel(),
) {
    Column() {
        Button(onClick = {
            homeViewModel.onClick()
        }) {
            Text(text = "StartDownload")
        }
    }
}

@Preview
@Composable
fun PrevHomeScreen() {
    HomeScreen()
}