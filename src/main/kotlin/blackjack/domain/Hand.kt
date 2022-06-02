package blackjack.domain

class Hand(val player: Player) {

    private val cards = mutableListOf<Card>()

    fun addCard(card: Card) {
        cards.add(card)
    }

    fun value(): Int {
        return cards.sumOf { it.point() }
    }

    fun isOverMaxPoint(): Boolean {
        return value() >= CardGame.RULE_MAX_POINT
    }

    fun cardCount(): Int {
        return cards.size
    }

    fun getCards(): List<Card> {
        return cards.toList()
    }
}
