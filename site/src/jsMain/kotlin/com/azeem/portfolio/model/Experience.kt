package com.azeem.portfolio.model

data class Experience(
    val id: Int,
    val designation: String,
    val employerName: String,
    val workDuration: String,
    val workLocation: String,
    val companyLogo: String,
    val keyDuties: List<String>,
    val projects: List<Projects>
) {
    data class Projects(
        val name: String,
        val description: List<String>,
        val link: String? = null
    )
}