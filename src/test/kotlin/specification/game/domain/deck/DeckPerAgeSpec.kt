package io.github.ahocquard.sevenwonders.specification.game.domain.deck

import io.github.ahocquard.sevenwonders.game.domain.resource.DeckPerAge
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class DeckPerAgeSpec : StringSpec({
    "There are 7 cards per player" {
        DeckPerAge().deckForFirstAge(3).count() shouldBe 21
        DeckPerAge().deckForFirstAge(4).count() shouldBe 28
        DeckPerAge().deckForFirstAge(5).count() shouldBe 35
        DeckPerAge().deckForFirstAge(6).count() shouldBe 42
        DeckPerAge().deckForFirstAge(7).count() shouldBe 49
    }
})