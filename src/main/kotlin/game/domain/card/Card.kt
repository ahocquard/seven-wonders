package io.github.ahocquard.sevenwonders.game.domain.resource

import game.domain.effect.Effect

data class Card(
    val name: Name,
    val chainedBy: List<Name>,
    val cost: Cost,
    val effects: List<Effect>,
    val numberPlayer: Int
)
