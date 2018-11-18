package io.github.ahocquard.sevenwonders.game.domain.resource

/**
 * It means that it produces one of the resources in the list during a turn, but not another one available in the list.
 * So, it never produces several resources from the list at once during a turn.
 *
 * For example, it's useful to represent cards that allows to produce Stone or Clay during a turn,
 * which is different from Stone and Clay.
 *
 * @see ProduceAll
 */
class ProduceOneOf(val resources: List<Resource>)