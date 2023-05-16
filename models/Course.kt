package models

data class Course(
    override val name: String,
    val level: Level = Level.BASIC,
    val duration: Int = 1
) : Activity()