package com.ncgroup.droidjobs.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ncgroup.droidjobs.splash.SplashScreen
import com.ncgroup.droidjobs.jobs.presentation.JobDetailScreen
import com.ncgroup.droidjobs.jobs.presentation.JobsScreen
import com.ncgroup.droidjobs.jobs.presentation.JobsViewModel


private const val SPLASH = "splash_screen"
private const val JOBS = "home_screen"
private const val JOBS_DETAIL = "jobs_detail_screen"

@Composable
fun RootNavigation(
    jobsViewModel: JobsViewModel = viewModel(factory = JobsViewModel.factory)
){

    val navController = rememberNavController()

    val jobsState = jobsViewModel.state

    NavHost(
        navController = navController,
        startDestination = SPLASH
    ){
        composable(
            route = SPLASH
        ){
            SplashScreen(
                navigateToSplashScreen = {
                    navController.navigate(JOBS)
                }
            )
        }
        composable(
            route = JOBS
        ){
            JobsScreen(
                state = jobsState,
                navigateToJobDetailScreen = {
                    jobsViewModel.setJobID(it)
                    navController.navigate(JOBS_DETAIL)
                }
            )
        }
        composable(
            route = JOBS_DETAIL
        ){
            JobDetailScreen(
                navController = navController,
                state = jobsState,
                getJob = {
                   jobsViewModel.getJob()
                }
            )
        }
    }

}