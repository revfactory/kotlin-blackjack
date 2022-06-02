package blackjack.domain

class Player {
    private val cards = mutableListOf<Card>()

    fun addCard(card: Card) {
        cards.add(card)
    }

    fun totalPoint(): Int {
        return cards.sumOf { it.point() }
    }

    fun isOverMaxPoint(): Boolean {
        return totalPoint() >= CardGame.RULE_MAX_POINT
    }

    fun cardCount(): Int {
        return cards.size
    }
}
