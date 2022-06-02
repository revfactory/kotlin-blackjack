package blackjack.domain

data class Card(val suit: String) {

    companion object {
        val suits = arrayOf("클로버", "다이아", "스페이드", "하트")
    }
}
