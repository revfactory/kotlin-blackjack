package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CardGameTest : FunSpec({
    test("게임 시작시 랜덤의 2장의 카드가 주어짐") {
        val cardGame = newGame {
            players(listOf(Player()))
        }
        cardGame.cardDeck.cardCount() shouldBe 50
        cardGame.hands.size shouldBe 1
        cardGame.hands[0].cardCount() shouldBe 2
    }
})
