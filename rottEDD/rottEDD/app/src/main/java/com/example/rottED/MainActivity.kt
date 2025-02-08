package com.example.rottED

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.rottED.ui.screens.ReelsScreen
import com.example.rottED.ui.theme.rottEDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // ✅ Corrected argument
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            rottEDTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Surface(modifier = Modifier.padding(innerPadding)) {
                        ReelsScreen(this) // ✅ Loads Reels screen correctly
                    }
                }
            }
        }
    }
}
