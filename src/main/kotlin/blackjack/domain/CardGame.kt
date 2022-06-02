package blackjack.domain

class CardGame(private val players: List<Player>) {

    private val cardDeck = CardDeck()

    fun start() {
        for (player in players) {
            player.addCard(cardDeck.draw())
            player.addCard(cardDeck.draw())
        }
    }

    fun turn() {
        players
    }

    companion object {
        const val RULE_MAX_POINT = 21
    }
}
