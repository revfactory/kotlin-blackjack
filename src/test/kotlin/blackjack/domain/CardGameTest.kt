package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CardGameTest : FunSpec({
    test("게임 시작시 랜덤의 2장의 카드가 주어짐") {
        val player = Player()
        val game = CardGame(listOf(player))
        game.start()

        player.cards.size shouldBe 2
    }
})
