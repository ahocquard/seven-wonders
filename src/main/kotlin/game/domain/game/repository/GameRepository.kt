package game.domain.game.repository

import game.domain.game.Game

interface GameRepository {
    fun createNewGame(game: Game)

    // TODO: We should have an ID to identify a game and persist several games\
    // how to get this id from a command not returning anything
    fun getGame(): Game
}