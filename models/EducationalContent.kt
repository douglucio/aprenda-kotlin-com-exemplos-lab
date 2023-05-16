package models

data class EducationalContent(
    val name: String,
    private val activities: List<Activity>
)