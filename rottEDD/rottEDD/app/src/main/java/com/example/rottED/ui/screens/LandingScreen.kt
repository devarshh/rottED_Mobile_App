package com.example.rottED.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.rottED.R

@Composable
fun LandingScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color(0xFFFFAFAF), Color(0xFFFF9A9A))
                    )
                )
                .padding(32.dp)
        ) {
            // App Logo (JPG Support)
            Image(
                painter = painterResource(id = R.drawable.logo), // Make sure logo.jpg is in res/drawable/
                contentDescription = "RottED Logo",
                modifier = Modifier
                    .size(120.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Welcome Text
            Text(
                text = "Welcome to RottED",
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Let's Go Button
            Button(
                onClick = { navController.navigate("reels") },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFF3B6C)),
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .padding(8.dp)
                    .width(150.dp)
            ) {
                Text(text = "Let's Go", color = Color.White, fontSize = 18.sp)
            }
        }
    }
}
