package io.github.ahocquard.sevenwonders.game.application.command

import game.domain.game.Game
import game.domain.game.repository.GameRepository
import io.github.ahocquard.sevenwonders.game.application.CommandHandler
import io.github.ahocquard.sevenwonders.game.domain.player.Player
import io.github.ahocquard.sevenwonders.game.domain.resource.Coins

class StartNewGameHandler(private val gameRepository: GameRepository) : CommandHandler<StartNewGame> {
    override fun invoke(command: StartNewGame) {
        var players = mutableListOf<Player>()

        for (playerNumber in 1..command.numberPlayer) {
            players.add(Player(Coins(3)))
        }

        val game = Game(players)
        gameRepository.createNewGame(game)
    }
}
