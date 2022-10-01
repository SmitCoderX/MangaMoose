package com.smitcoderx.mangamoose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.smitcoderx.mangamoose.ui.home.HomeScreen
import com.smitcoderx.mangamoose.ui.onboard.OnBoardingScreen
import com.smitcoderx.mangamoose.ui.theme.MangaMooseTheme
import com.smitcoderx.mangamoose.ui.theme.OnBoardBgColor
import com.smitcoderx.mangamoose.utils.Constants.MAIN_SCREEN
import com.smitcoderx.mangamoose.utils.Constants.ON_BOARD

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MangaMooseTheme {
                val navController = rememberNavController()
                val systemUiController: SystemUiController = rememberSystemUiController()
                systemUiController.setStatusBarColor(OnBoardBgColor)
                NavHost(
                    navController = navController,
                    startDestination = ON_BOARD
                ) {
                    composable(ON_BOARD) {
                        OnBoardingScreen(navController = navController)
                    }
                    composable(MAIN_SCREEN) {
                        HomeScreen()
                    }
                }
            }
        }
    }
}
