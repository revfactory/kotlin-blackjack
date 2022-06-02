package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CardDeckTest : FunSpec({
    test("카드덱은 무늬별, 등급별 총 52장으로 구성된다.") {
        val cardDeck = CardDeck()

        cardDeck.cards.size shouldBe 52
    }

    test("카드덱은 기본적으로 1덱으로 설정한다.") {
        val cardDeck = CardDeck()
        cardDeck.cards.size shouldBe 52

        val cardDoubleDeck = CardDeck(2)
        cardDoubleDeck.cards.size shouldBe 104
    }
})
