package blackjack.domain

class CardDeck(deckCount: Int = 1) {

    val cards = mutableListOf<Card>()

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
}
