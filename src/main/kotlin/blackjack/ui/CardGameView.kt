package blackjack.ui

import blackjack.domain.Card
import blackjack.domain.CardGame
import blackjack.domain.Hand

object CardGameView {
    fun newGamePrint(cardGame: CardGame) {
        println(initGameResult(cardGame.hands))
        cardGame.hands.forEach {
            println(playerCards(it))
        }
    }

    private fun initGameResult(players: List<Hand>): String {
        return buildString {
            append(players.joinToString(", ") { it.player.name })
            append("에게 2장의 카드를 나누었습니다.")
        }
    }

    private fun playerCards(hand: Hand): String {
        return buildString {
            append("${hand.player.name}카드: ")
            append(hand.getCards().joinToString(", ") { it.str() })
        }
    }

    private fun Card.str(): String {
        return "${this.grade}${this.suit}"
    }
}
