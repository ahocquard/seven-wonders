package io.github.ahocquard.sevenwonders.game.domain.resource

/**
 * Starting in Age II, some structures can be built either by paying the requisite
 * resource(s).
 * Alternatively, they can be built for free if the player has built
 * during the previous age the structure indicated on the card
 */
data class Cost(val coins: Coins, val resources: List<Resource>, val chainedBy: Name)