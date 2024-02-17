package com.ncgroup.droidjobs

import android.app.Application
import com.ncgroup.droidjobs.jobs.data.repository.JobsRepositoryImpl
import com.ncgroup.droidjobs.jobs.data.service.JobsService
import com.ncgroup.droidjobs.jobs.domain.repository.JobsRepository


class DroidJobsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        jobsService = JobsService()
        jobsRepository = JobsRepositoryImpl(
            jobsService = jobsService
        )
    }

    companion object {
        lateinit var INSTANCE : DroidJobsApplication
        lateinit var jobsService: JobsService
        lateinit var jobsRepository: JobsRepository
    }

}