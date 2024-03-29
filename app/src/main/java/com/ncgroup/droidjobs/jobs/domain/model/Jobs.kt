package com.ncgroup.droidjobs.jobs.domain.model

import java.util.UUID


data class Jobs(
    val id: String,
    val title: String,
    val role: String,
    val description: String,
    val requirements: String,
    val skills: List<String>,
    val employmentType: String,
    val workEnvironment: String,
    val companyBenefits: String,
    val visaSponsorship: String,
    val experienceLevel: String,
    val company: String,
    val companyLogo: Int,
    val companyMotto : String,
    val aboutUs: String,
    val industry: String,
    val city: String,
    val country: String,
    val address: String,
    val salary: String,
    val postedDate: String,
    val link: String
)
