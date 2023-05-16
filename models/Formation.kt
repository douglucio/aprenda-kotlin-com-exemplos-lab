package models

data class Formation(
    val name: String,
    private val contents: List<EducationalContent>
) {
    private val subscribers = mutableListOf<User>()

    fun signUp(user: User) {
        if (!user.inscribe(this)) return
        subscribers.add(user)
    }

    fun getUserSubscribers() : List<User> = subscribers
}