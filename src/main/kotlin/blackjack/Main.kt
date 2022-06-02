package blackjack

import blackjack.domain.newGame
import blackjack.ui.CardGameView.newGamePrint
import blackjack.ui.InitializeView.inputPlayerInfo

fun main() {
    val cardGame = newGame {
        players(inputPlayerInfo())
    }

    newGamePrint(cardGame)
}
