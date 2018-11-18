package io.github.ahocquard.sevenwonders.game.domain.resource

import game.domain.effect.Effect

data class Card(
    val identifier: String,
    val name: Name,
    val structureType: StructureType,
    val chainedBy: List<Name>,
    val cost: List<Resource>,
    val effects: List<Effect>,
    val numberPlayer: Int
)
