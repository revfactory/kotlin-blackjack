package blackjack

import blackjack.domain.newGame
import blackjack.ui.CardGameView.newGamePrint
import blackjack.ui.PlayerView.inputPlayers

fun main() {
    newGame {
        players(inputPlayers())
    }.also {
        newGamePrint(it)
    }
}
