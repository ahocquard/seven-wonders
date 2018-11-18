package io.github.ahocquard.sevenwonders.game.domain.resource

/**
 * It means that it produces all the resources in the list during a turn.
 *
 * For example, it's useful to represent cards that allows to produce two Stones during a turn,
 * which is different from Stone or Clay.
 *
 * @see ProduceOneOf
 */
class ProduceAll(val resources: List<Resource>) {
}
