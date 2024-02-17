package com.ncgroup.droidjobs.jobs.domain.repository


import com.ncgroup.droidjobs.jobs.domain.model.Jobs
import com.ncgroup.droidjobs.utils.ResultState
import kotlinx.coroutines.flow.Flow
import java.util.UUID


interface JobsRepository {
    suspend fun getAllJobs(): Flow<ResultState<List<Jobs>>>
    suspend fun getJob(jobID: String): Flow<ResultState<Jobs>>
}