package com.spamerl.monsterhunterworldexplorer.ui.screen.armor.detailScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.spamerl.monsterhunterworldexplorer.data.remote.model.ArmorResponse

@Composable
fun ArmorDetailScreen() {

}

@Composable
fun Body(
    modifier: Modifier
) {
    Column(
        modifier.padding(horizontal = 16.dp)
    ) {
        Text(
            text = "name",
            modifier = modifier
                .fillMaxWidth()
                .align(
                    alignment = Alignment.CenterHorizontally
                )
        )
        Box(
            modifier
                .size(128.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .background(color = Color.DarkGray)
        ) {
        }


    }
}

@Composable
fun HeadPart(modifier: Modifier) {
    Column(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Name",
            modifier
                .fillMaxWidth()
                .align(
                    alignment = Alignment.CenterHorizontally
                )
        )

        Box(
            modifier = modifier.size(128.dp),
            contentAlignment = Alignment.Center) {

        }
    }
}

@Composable
fun ArmorStats(modifier: Modifier) {
    Column() {
        Text(text = "base defense: 32")
        Text(text = "resistance")
    }
}