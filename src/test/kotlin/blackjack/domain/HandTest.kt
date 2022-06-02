package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class HandTest : FunSpec({
    test("소유한 카드의 포인트 합이 21을 초과할 수 없음") {
        val hand = Hand(Player())
        hand.addCard(Card(grade = "10"))
        hand.addCard(Card(grade = "10"))
        hand.isOverMaxPoint() shouldBe false

        hand.addCard(Card(grade = "1"))
        hand.isOverMaxPoint() shouldBe true
    }
})
