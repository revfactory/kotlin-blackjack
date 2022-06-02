package blackjack.ui

import blackjack.domain.Player

object PlayerView {
    fun inputPlayers(): List<Player> {
        println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
        return readln().split(",")
            .map { Player((it.trim())) }
    }
}
