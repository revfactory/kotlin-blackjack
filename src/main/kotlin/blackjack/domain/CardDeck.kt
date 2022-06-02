package blackjack.domain

class CardDeck(deckCount: Int = 1) {

    private val cards = mutableListOf<Card>()

    init {
        for (n in 1..deckCount) {
            for (suit in Card.suits) {
                for (grade in Card.grades) {
                    cards.add(Card(suit = suit, grade = grade))
                }
            }
        }
        cards.shuffle()
    }

    fun cardCount(): Int {
        return cards.size
    }

    fun hasCard(): Boolean {
        return cards.isNotEmpty()
    }

    fun draw(): Card {
        return cards.removeFirst()
    }
}
