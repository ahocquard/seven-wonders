package io.github.ahocquard.sevenwonders.context.setup

import cucumber.api.java8.En
import io.github.ahocquard.sevenwonders.game.domain.player.Player

class SetupCoinDefinition : En {
    init {

        Given("several players") {
            val players = listOf(Player(), Player());
        }

        Given("the {int} Wonders board of the game") { int1: Int ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        When("the players want to start a new game") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Then("each player has a Wonders board randomly picked") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Then("each player has the face of the board to use during the game which is randomly picked also") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Then("each player has {int} coins") { int1: Int ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
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
