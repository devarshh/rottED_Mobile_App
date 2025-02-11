package com.example.rottED

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rottED.ui.screens.LandingScreen
import com.example.rottED.ui.screens.ReelsScreen
import com.example.rottED.ui.theme.rottEDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // ✅ Corrected argument
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            rottEDTheme {
                val navController: NavHostController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "landing",
                        modifier = Modifier.padding(innerPadding)
                    ){
                        composable("landing") { LandingScreen(navController) }
                        composable("reels") { ReelsScreen(this@MainActivity) }
                    }
                }
            }
        }
    }
}
