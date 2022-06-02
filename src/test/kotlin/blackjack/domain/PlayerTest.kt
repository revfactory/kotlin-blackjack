package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PlayerTest : FunSpec({
    test("소유한 카드의 포인트 합이 21을 초과할 수 없음") {
        val player = Player()
        player.addCard(Card(grade = "10"))
        player.addCard(Card(grade = "10"))
        player.isOverMaxPoint() shouldBe false

        player.addCard(Card(grade = "1"))
        player.isOverMaxPoint() shouldBe true
    }
})
