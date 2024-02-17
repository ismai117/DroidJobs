package com.ncgroup.droidjobs.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import kotlinx.coroutines.delay


private typealias  navigateToSplashScreen = () -> Unit

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    navigateToSplashScreen: navigateToSplashScreen
){

    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.Url("https://lottie.host/0094976a-6a83-4795-b0ce-6da075ca5b6b/HSbPWOOaJV.json")
    )

    val animationState = animateLottieCompositionAsState(
        composition = composition,
        iterations = 1
    )

    LaunchedEffect(animationState.progress){
        if (animationState.progress == 1f){
            navigateToSplashScreen()
        }
    }

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = modifier
                    .size(200.dp),
                contentAlignment = Alignment.Center
            ){
                LottieAnimation(
                    composition = composition,
                    progress = { animationState.progress },
                    modifier = modifier.fillMaxSize()
                )
            }

            Text(
                text = "DroidJobs",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}