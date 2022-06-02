package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CardDeckTest : FunSpec({
    test("카드덱은 무늬별, 등급별 총 52장으로 구성된다.") {
        val cardDeck = CardDeck()

        cardDeck.cardCount() shouldBe 52
    }

    test("카드덱은 기본적으로 1덱으로 설정한다.") {
        val cardDeck = CardDeck()
        cardDeck.cardCount() shouldBe 52

        val cardDoubleDeck = CardDeck(2)
        cardDoubleDeck.cardCount() shouldBe 104
    }

    test("카드덱에서 랜덤으로 하나씩 카드를 꺼낼 수 있다.") {
        val cardDeck = CardDeck()
        val cards = mutableListOf<Card>()
        while (cardDeck.hasCard()) {
            cards.add(cardDeck.draw())
        }

        cardDeck.hasCard() shouldBe false
        cards.size shouldBe 52
    }
})
