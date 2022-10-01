package com.smitcoderx.mangamoose.ui.onboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.smitcoderx.mangamoose.R
import com.smitcoderx.mangamoose.ui.theme.LoadingColor
import com.smitcoderx.mangamoose.ui.theme.OnBoardBgColor
import com.smitcoderx.mangamoose.utils.Constants.MAIN_SCREEN

@Composable
fun OnBoardingScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(OnBoardBgColor)
            .padding(10.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painterResource(id = R.drawable.onboard_img),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = stringResource(id = R.string.onboarding_text),
                color = Color.White,
                letterSpacing = 1.5.sp,
                fontWeight = FontWeight.Black,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = stringResource(id = R.string.onboarding_desc),
                color = Color.Gray,
                letterSpacing = 1.5.sp,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Box(contentAlignment = Center, modifier = Modifier
                .align(CenterHorizontally)
                .clickable {
                    navController.navigate(MAIN_SCREEN)
                }) {
                CircularProgressIndicator(
                    modifier = Modifier
                        .size(80.dp)
                        .fillMaxWidth(),
                    color = LoadingColor,
                    strokeWidth = 2.dp,
                )
                Image(
                    imageVector = Icons.Default.ArrowForward,
                    colorFilter = ColorFilter.tint(Color.White),
                    contentDescription = "Next",
                    modifier = Modifier
                        .background(
                            color = LoadingColor, shape = CircleShape
                        )
                        .padding(20.dp)
                )
            }
        }
    }
}