package com.ncgroup.droidjobs.jobs.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.ncgroup.droidjobs.DroidJobsApplication
import com.ncgroup.droidjobs.jobs.domain.repository.JobsRepository
import com.ncgroup.droidjobs.utils.ResultState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.UUID


class JobsViewModel(
    private val jobsRepository: JobsRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    var state by mutableStateOf(JobsState())

    fun setJobID(jobID: String) {
        savedStateHandle["jobID"] = jobID
    }

    init {
        getAllJobs()
    }

    private fun getAllJobs() {

        viewModelScope.launch(Dispatchers.IO) {
            jobsRepository.getAllJobs().collect { result ->
                withContext(Dispatchers.Main){
                    when(result) {
                        is ResultState.Loading -> {
                            state = state.copy(
                                isLoading = true
                            )
                        }
                        is ResultState.Success -> {
                            state = state.copy(
                                isLoading = false,
                                allJobs = result.data.orEmpty()
                            )
                        }
                        is ResultState.Error -> {
                            state = state.copy(
                                isLoading = false,
                                error = result.message.orEmpty()
                            )
                        }
                    }
                }
            }
        }
    }

    fun getJob() {
        viewModelScope.launch(Dispatchers.IO) {
            jobsRepository.getJob(
                jobID = checkNotNull(savedStateHandle.get(key = "jobID"))
            ).collect { result ->
                when(result) {
                    is ResultState.Loading -> {
                        state = state.copy(
                            isLoading = true
                        )
                    }
                    is ResultState.Success -> {
                        state = state.copy(
                            isLoading = false,
                            job = result.data
                        )
                    }
                    is ResultState.Error -> {
                        state = state.copy(
                            isLoading = false,
                            error = result.message.orEmpty()
                        )
                    }
                }
            }
        }
    }

    companion object {
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                val savedStateHandle = extras.createSavedStateHandle()
                return JobsViewModel(
                    DroidJobsApplication.jobsRepository,
                    savedStateHandle = savedStateHandle
                ) as T
            }
        }
    }

}