package io.github.ahocquard.sevenwonders.game.domain.resource

/**
 * Starting in Age II, some structures can be built either by paying the requisite
 * resource(s).
 * Alternatively, they can be built for free if the player has built
 * during the previous age the structure indicated on the card
 */
data class Cost(val coins: Coins = Coins(0), val resources: List<Resource> = emptyList(), val chainedBy: Name? = null) {
    companion object {
        fun free(): Cost = Cost(coins = Coins(0),resources = emptyList(), chainedBy = null)
    }
}
