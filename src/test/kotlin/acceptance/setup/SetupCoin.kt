package io.github.ahocquard.sevenwonders.acceptance.setup

import cucumber.api.java8.En
import game.domain.game.repository.GameRepository
import io.github.ahocquard.sevenwonders.game.application.command.StartNewGame
import io.github.ahocquard.sevenwonders.game.application.command.StartNewGameHandler
import io.kotlintest.shouldBe
import player.infrastructure.game.inmemory.InMemoryGameRepository

class SetupCoin : En {
    private var numberPlayers: Int = 4
    private lateinit var gameRepository: GameRepository

    init {

        Given("several players") {
            numberPlayers = 4
        }

        When("the players want to start a new game") {
            val command = StartNewGame(numberPlayers)
            gameRepository = InMemoryGameRepository()
            val commandHandler = StartNewGameHandler(gameRepository)
            commandHandler.invoke(command)
        }

        Then("each player has a Wonders board randomly picked") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Then("each player has the face of the board to use during the game which is randomly picked also") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Then("each player has {int} coins") { numberCoins: Int ->
            // Write code here that turns the phrase above into concrete actions
            gameRepository.getGame().players.filter { it.coins.number != numberCoins } shouldBe emptyList()
        }

        Given("a number of players between {int} and {int}") { int1: Int, int2: Int ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Then("there is one deck per age with only the used card based on the number of users") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Then("there is {int} cards per player per age") { int1: Int ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Given("{int} players") { int1: Int ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Then("there the deck of the third age has {int} guilds randomly picked") { int1: Int ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }
    }
}
