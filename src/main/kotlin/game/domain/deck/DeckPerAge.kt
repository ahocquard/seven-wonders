package io.github.ahocquard.sevenwonders.game.domain.resource

class DeckPerAge {
    fun deckForFirstAge(numberPlayer: Int): List<Card> {
        return cards().filter { it.numberPlayer <= numberPlayer && it.age == Age.AGE_1 }
    }

    private fun cards(): List<Card> {
        return listOf(
            Card(Name("Lumber Yard"), StructureType.RAW_MATERIAL, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Lumber Yard"), StructureType.RAW_MATERIAL, Cost.free(), emptyList(), 4, Age.AGE_1),
            Card(Name("Stone Pit"), StructureType.RAW_MATERIAL, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Stone Pit"), StructureType.RAW_MATERIAL, Cost.free(), emptyList(), 5, Age.AGE_1),
            Card(Name("Clay Pool"), StructureType.RAW_MATERIAL, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Clay Pool"), StructureType.RAW_MATERIAL, Cost.free(), emptyList(), 5, Age.AGE_1),
            Card(Name("Ore Vein"), StructureType.RAW_MATERIAL, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Ore Vein"), StructureType.RAW_MATERIAL, Cost.free(), emptyList(), 4, Age.AGE_1),
            Card(Name("Tree Farm"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 6, Age.AGE_1),
            Card(Name("Excavation"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 4, Age.AGE_1),
            Card(Name("Clay Pit"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 3, Age.AGE_1),
            Card(Name("Timber Yard"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 3, Age.AGE_1),
            Card(Name("Forest Cave"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 5, Age.AGE_1),
            Card(Name("Mine"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 6, Age.AGE_1),

            Card(Name("Loom"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Loom"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 6, Age.AGE_1),
            Card(Name("Glassworks"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Glassworks"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 6, Age.AGE_1),
            Card(Name("Press"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Press"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 6, Age.AGE_1),

            Card(Name("Pawn Shop"), StructureType.CIVIL, Cost.free(), emptyList(), 4, Age.AGE_1),
            Card(Name("Pawn Shop"), StructureType.CIVIL, Cost.free(), emptyList(), 7, Age.AGE_1),
            Card(Name("Altar"), StructureType.CIVIL, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Altar"), StructureType.CIVIL, Cost.free(), emptyList(), 5, Age.AGE_1),
            Card(Name("Theater"), StructureType.CIVIL, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Theater"), StructureType.CIVIL, Cost.free(), emptyList(), 6, Age.AGE_1),

            Card(Name("Tavern"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 4, Age.AGE_1),
            Card(Name("Tavern"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 5, Age.AGE_1),
            Card(Name("Tavern"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 7, Age.AGE_1),
            Card(Name("East Trading Post"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("East Trading Post"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 7, Age.AGE_1),
            Card(Name("West Trading Post"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("West Trading Post"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 7, Age.AGE_1),
            Card(Name("Market Place"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 3, Age.AGE_1),
            Card(Name("Market Place"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 6, Age.AGE_1)
        )
    }
}