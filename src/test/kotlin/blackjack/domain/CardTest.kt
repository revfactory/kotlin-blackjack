package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldBeIn
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

    test("숫자 카드는 기본적으로 해당 숫자 만큼의 포인트로 계산하며, Ace 카드는 1 또는 11 포인트로, Face Card는 10 포인트로 계산") {
        Card(grade = "A").point() shouldBeIn listOf(1, 11)
        Card(grade = "2").point() shouldBe 2
        Card(grade = "3").point() shouldBe 3
        Card(grade = "4").point() shouldBe 4
        Card(grade = "5").point() shouldBe 5
        Card(grade = "6").point() shouldBe 6
        Card(grade = "7").point() shouldBe 7
        Card(grade = "8").point() shouldBe 8
        Card(grade = "9").point() shouldBe 9
        Card(grade = "10").point() shouldBe 10
        Card(grade = "J").point() shouldBe 10
        Card(grade = "Q").point() shouldBe 10
        Card(grade = "K").point() shouldBe 10
    }
})
