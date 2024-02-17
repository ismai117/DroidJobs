package com.ncgroup.droidjobs.jobs.data.repository


import com.ncgroup.droidjobs.jobs.data.service.JobsService
import com.ncgroup.droidjobs.jobs.domain.model.Jobs
import com.ncgroup.droidjobs.jobs.domain.repository.JobsRepository
import com.ncgroup.droidjobs.utils.ResultState
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import java.util.UUID


class JobsRepositoryImpl(
    private val jobsService: JobsService
) : JobsRepository {

    override suspend fun getAllJobs(): Flow<ResultState<List<Jobs>>> = callbackFlow {
        runCatching {
            trySend(ResultState.Loading())
            jobsService.getAllJobs()
        }.onSuccess {
            trySend(ResultState.Success(it))
        }.onFailure {
            trySend(ResultState.Error(message = it.message))
        }
        awaitClose {
            close()
        }
    }

    override suspend fun getJob(jobID: String): Flow<ResultState<Jobs>> = callbackFlow {
        runCatching {
            trySend(ResultState.Loading())
            jobsService.getJob(jobID)
        }.onSuccess {
            trySend(ResultState.Success(it))
        }.onFailure {
            trySend(ResultState.Error(message = it.message))
        }
        awaitClose {
            close()
        }
    }

}