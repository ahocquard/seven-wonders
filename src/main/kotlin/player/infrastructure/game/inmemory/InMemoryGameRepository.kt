package player.infrastructure.game.inmemory

import game.domain.game.Game
import game.domain.game.repository.GameRepository

class InMemoryGameRepository : GameRepository {

    private lateinit var game: Game

    override fun getGame(): Game {
        return game
    }

    override fun createNewGame(game: Game) {
        this.game = game
    }
}