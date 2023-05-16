
import models.*

fun main() {
    val formationKotlin = doFomationKotlin()
    val user1 = User("Mary")
    val user2 = User("David")

    formationKotlin.apply {
        signUp(user1)
        signUp(user2)
    }

    println(formationKotlin.getUserSubscribers())
    println(user1.getFormations())
    println(user2.getFormations())
}

fun doFomationKotlin() : Formation {
    return Formation(
        "Kotlin Experience", listOf(
            EducationalContent(
                "Getting to know the Kotlin Programming Language ", listOf(
                    Course("Visiting the Official Documentation of kotlin ", Level.BASIC, 1),
                    ProjectChallenge(
                        "Using Object Orientation programming with Kotlin ",
                        Level.BASIC,
                        2
                    )
                )
            ),
            EducationalContent(
                "Perfecting the technique to develop with Kotlin", listOf(
                    CodeChallenge("Exploring Functions, Maps, Loops, and Rules with Kotlin ", Level.INTERMEDIARY),
                    CodeChallenge("Using the Keywokrd Object with kotlin", Level.HARD)
                )
            )
        )
    )
}