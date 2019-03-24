package io.github.ahocquard.sevenwonders.specification.game.domain.deck

import game.domain.game.Game
import io.github.ahocquard.sevenwonders.game.domain.player.Player
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import player.infrastructure.game.inmemory.InMemoryGameRepository

class InMemoryGameRepositorySpec : StringSpec({
    "A game is created" {
        val repository = InMemoryGameRepository()
        repository.createNewGame(Game(emptyList()))
        val game = repository.getGame()
        game.players shouldBe emptyList<Player>()
    }
})