package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CardTest : FunSpec({
    test("카드는 클로버, 다이아, 스페이드, 하트로 구성") {
        Card.suits.map { Card(suit = it) } shouldBe listOf(
            Card(suit = "클로버"),
            Card(suit = "다이아"),
            Card(suit = "스페이드"),
            Card(suit = "하트")
        )
    }

    test("카드의 각 문양은 1(Ace) 부터 10까지 10장의 숫자 카드와 J(Jack), Q(Queen), K(King) 얼굴 카드로 구성") {
        Card.grades.map { Card(grade = it) } shouldBe listOf(
            Card(grade = "A"),
            Card(grade = "2"),
            Card(grade = "3"),
            Card(grade = "4"),
            Card(grade = "5"),
            Card(grade = "6"),
            Card(grade = "7"),
            Card(grade = "8"),
            Card(grade = "9"),
            Card(grade = "10"),
            Card(grade = "J"),
            Card(grade = "Q"),
            Card(grade = "K"),
        )
    }
})
