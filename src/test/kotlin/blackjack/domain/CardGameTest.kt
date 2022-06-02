package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CardGameTest : FunSpec({
    test("게임 시작시 랜덤의 2장의 카드가 주어짐") {
        val cardGame = newGame {
            players(listOf(Player()))
        }
        cardGame.players().size shouldBe 1
        val (_, cards) = cardGame.playerCards().first()
        cards.size shouldBe 2
    }
})
