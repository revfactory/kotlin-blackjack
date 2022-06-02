package blackjack.domain

class CardGame private constructor (players: List<Player>) {
    val cardDeck: CardDeck = CardDeck()
    val hands: List<Hand> = players.map { Hand(it) }

    private fun deal() {
        hands.forEach {
            it.addCard(cardDeck.draw())
            it.addCard(cardDeck.draw())
        }
    }

    class CardGameBuilder {
        private lateinit var players: List<Player>

        fun players(players: List<Player>) {
            this.players = players
        }

        fun build(): CardGame {
            return CardGame(players)
                .apply { deal() }
        }
    }

    companion object {
        const val RULE_MAX_POINT = 21
    }
}

fun newGame(block: CardGame.CardGameBuilder.() -> Unit): CardGame = CardGame.CardGameBuilder().apply(block).build()
