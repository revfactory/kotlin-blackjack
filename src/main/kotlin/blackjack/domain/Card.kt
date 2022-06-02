package blackjack.domain

data class Card(val suit: String = "클로버", val grade: String = "A") {

    fun point(): Int {
        return when (grade) {
            "A" -> listOf(1, 11).random()
            "J", "Q", "K" -> 10
            else -> grade.toInt()
        }
    }

    companion object {
        val suits = arrayOf("클로버", "다이아", "스페이드", "하트")
        val grades = arrayOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    }
}
