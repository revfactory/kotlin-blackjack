package blackjack.ui

import blackjack.domain.Card
import blackjack.domain.CardGame
import blackjack.domain.Player

object CardGameView {
    fun newGamePrint(cardGame: CardGame) {
        println(initGameResult(cardGame.players()))
        cardGame.playerCards().forEach {
            val (player, cards) = it
            println(playerCards(player, cards))
        }
    }

    private fun initGameResult(players: List<Player>): String {
        return buildString {
            append(players.joinToString(", ") { it.name })
            append("에게 2장의 카드를 나누었습니다.")
        }
    }

    private fun playerCards(player: Player, cards: List<Card>): String {
        return buildString {
            append("${player.name}카드: ")
            append(cards.joinToString(", ") { it.str() })
        }
    }

    private fun Card.str(): String {
        return "${this.grade}${this.suit}"
    }
}
