package com.ncgroup.droidjobs


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ncgroup.droidjobs.navigation.RootNavigation
import com.ncgroup.droidjobs.ui.theme.DroidJobsTheme


@Preview(showBackground = true)
@Composable
fun AppPreview() {
    App()
}


@Composable
fun App(
    modifier: Modifier = Modifier
) = DroidJobsTheme {

    Scaffold(
        containerColor = Color(0xFF1C1C23)
    ) { paddingValues ->
        Box(
            modifier = modifier.padding(paddingValues)
        ){
            RootNavigation()
        }
    }

}