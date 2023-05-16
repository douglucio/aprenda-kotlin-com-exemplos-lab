package models

data class ProjectChallenge(
    override val name: String,
    override val level: Level,
    val duration: Int
) : Challenge()