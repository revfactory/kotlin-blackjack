package blackjack.domain

class CardGame(private val players: List<Player>) {

    private val cardDeck = CardDeck()

    fun start() {
        for (player in players) {
            player.cards.add(cardDeck.draw())
            player.cards.add(cardDeck.draw())
        }
    }
}
