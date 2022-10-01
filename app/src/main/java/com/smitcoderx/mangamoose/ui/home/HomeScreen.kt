package com.smitcoderx.mangamoose.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smitcoderx.mangamoose.R

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            TopBar(modifier = Modifier.padding(20.dp))
        }
    }
}

@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.fillMaxWidth()
    ) {

        Text(
            text = "Good Afternoon",
            fontSize = 20.sp,
            color = Color.DarkGray,
            modifier = Modifier.weight(3f)
        )

        Icon(painter = painterResource(id = R.drawable.menu),
            contentDescription = "Menu",
            modifier = Modifier
                .weight(0.5f)
                .border(
                    width = 1.dp, color = Color.Gray, shape = CircleShape
                )
                .clickable {

                }
                .padding(8.dp))
    }
}

@Composable
fun LatestManga() {
    
}