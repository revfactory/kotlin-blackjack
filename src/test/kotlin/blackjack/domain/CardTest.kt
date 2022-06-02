package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CardTest : FunSpec({
    test("카드는 클로버, 다이아, 스페이드, 하트로 구성") {
        Card.suits.map { Card(it) } shouldBe listOf(
            Card("클로버"),
            Card("다이아"),
            Card("스페이드"),
            Card("하트")
        )
    }
})
