package blackjack.domain

class CardGame private constructor (players: List<Player>) {
    private val cardDeck: CardDeck = CardDeck()
    private val hands: List<Hand> = players.map { Hand(it) }

    fun players(): List<Player> {
        return hands.map { it.player }
    }

    fun playerCards(): List<Pair<Player, List<Card>>> {
        return hands.map { Pair(it.player, it.getCards()) }
    }

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
