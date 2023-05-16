package models

data class User(
    val name: String
) {
    private val formations = mutableListOf<Formation>()

    fun inscribe(formation: Formation) : Boolean {
        if (formations.contains(formation)) return false
        return formations.add(formation)
    }

    fun getFormations() : List<Formation> = formations
}