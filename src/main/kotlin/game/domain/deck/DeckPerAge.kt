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
            Card(Name("Baths"), StructureType.CIVIL, Cost(resources = listOf(Resource.STONE)), emptyList(), 3, Age.AGE_1),
            Card(Name("Baths"), StructureType.CIVIL, Cost(resources = listOf(Resource.STONE)), emptyList(), 7, Age.AGE_1),
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
            Card(Name("Market Place"), StructureType.COMMERCIAL, Cost.free(), emptyList(), 6, Age.AGE_1),


            Card(Name("Stockade"), StructureType.MILITARY, Cost(resources = listOf(Resource.WOOD)), emptyList(), 3, Age.AGE_1),
            Card(Name("Stockade"), StructureType.MILITARY, Cost(resources = listOf(Resource.WOOD)), emptyList(), 7, Age.AGE_1),
            Card(Name("Barracks"), StructureType.MILITARY, Cost(resources = listOf(Resource.ORE)), emptyList(), 3, Age.AGE_1),
            Card(Name("Barracks"), StructureType.MILITARY, Cost(resources = listOf(Resource.ORE)), emptyList(), 5, Age.AGE_1),
            Card(Name("Guard Tower"), StructureType.MILITARY, Cost(resources = listOf(Resource.CLAY)), emptyList(), 3, Age.AGE_1),
            Card(Name("Guard Tower"), StructureType.MILITARY, Cost(resources = listOf(Resource.CLAY)), emptyList(), 4, Age.AGE_1),

            Card(Name("Apothecary"), StructureType.SCIENTIFIC, Cost(resources = listOf(Resource.LOOM)), emptyList(), 3, Age.AGE_1),
            Card(Name("Apothecary"), StructureType.SCIENTIFIC, Cost(resources = listOf(Resource.LOOM)), emptyList(), 5, Age.AGE_1),
            Card(Name("Workshop"), StructureType.SCIENTIFIC, Cost(resources = listOf(Resource.GLASS)), emptyList(), 3, Age.AGE_1),
            Card(Name("Workshop"), StructureType.SCIENTIFIC, Cost(resources = listOf(Resource.GLASS)), emptyList(), 7, Age.AGE_1),
            Card(Name("Scriptorium"), StructureType.SCIENTIFIC, Cost(resources = listOf(Resource.PAPYRUS)), emptyList(), 3, Age.AGE_1),
            Card(Name("Scriptorium"), StructureType.SCIENTIFIC, Cost(resources = listOf(Resource.PAPYRUS)), emptyList(), 4, Age.AGE_1),

            Card(Name("Sawmill"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 3, Age.AGE_2),
            Card(Name("Sawmill"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 4, Age.AGE_2),
            Card(Name("Quarry"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 3, Age.AGE_2),
            Card(Name("Quarry"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 4, Age.AGE_2),
            Card(Name("Brickyard"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 3, Age.AGE_2),
            Card(Name("Brickyard"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 4, Age.AGE_2),
            Card(Name("Foundry"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 3, Age.AGE_2),
            Card(Name("Foundry"), StructureType.RAW_MATERIAL, Cost(coins = Coins(1)), emptyList(), 4, Age.AGE_2),

            Card(Name("Loom"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 3, Age.AGE_2),
            Card(Name("Loom"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 5, Age.AGE_2),
            Card(Name("Glassworks"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 3, Age.AGE_2),
            Card(Name("Glassworks"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 5, Age.AGE_2),
            Card(Name("Press"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 3, Age.AGE_2),
            Card(Name("Press"), StructureType.MANUFACTURED_GOODS, Cost.free(), emptyList(), 5, Age.AGE_2),

            Card(
                Name("Aqueduct"),
                StructureType.CIVIL,
                Cost(resources = listOf(Resource.STONE, Resource.STONE, Resource.STONE), chainedBy = Name("Baths")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Aqueduct"),
                StructureType.CIVIL,
                Cost(resources = listOf(Resource.STONE, Resource.STONE, Resource.STONE), chainedBy = Name("Baths")),
                emptyList(),
                6,
                Age.AGE_2
            ),
            Card(
                Name("Temple"),
                StructureType.CIVIL,
                Cost(resources = listOf(Resource.WOOD, Resource.CLAY, Resource.GLASS), chainedBy = Name("Temple")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Temple"),
                StructureType.CIVIL,
                Cost(resources = listOf(Resource.WOOD, Resource.CLAY, Resource.GLASS), chainedBy = Name("Temple")),
                emptyList(),
                6,
                Age.AGE_2
            ),
            Card(
                Name("Statue"),
                StructureType.CIVIL,
                Cost(resources = listOf(Resource.WOOD, Resource.ORE, Resource.ORE), chainedBy = Name("Theater")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Statue"),
                StructureType.CIVIL,
                Cost(resources = listOf(Resource.WOOD, Resource.ORE, Resource.ORE), chainedBy = Name("Theater")),
                emptyList(),
                7,
                Age.AGE_2
            ),

            // TODO : chained by two cards
            Card(
                Name("Forum"),
                StructureType.COMMERCIAL,
                Cost(resources = listOf(Resource.CLAY, Resource.CLAY), chainedBy = Name("East Trading Post")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Forum"),
                StructureType.COMMERCIAL,
                Cost(resources = listOf(Resource.CLAY, Resource.CLAY), chainedBy = Name("East Trading Post")),
                emptyList(),
                6,
                Age.AGE_2
            ),
            Card(
                Name("Forum"),
                StructureType.COMMERCIAL,
                Cost(resources = listOf(Resource.CLAY, Resource.CLAY), chainedBy = Name("East Trading Post")),
                emptyList(),
                7,
                Age.AGE_2
            ),
            Card(
                Name("Caravansery"),
                StructureType.COMMERCIAL,
                Cost(resources = listOf(Resource.WOOD, Resource.WOOD), chainedBy = Name("Marketplace")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Caravansery"),
                StructureType.COMMERCIAL,
                Cost(resources = listOf(Resource.WOOD, Resource.WOOD), chainedBy = Name("Marketplace")),
                emptyList(),
                5,
                Age.AGE_2
            ),
            Card(
                Name("Caravansery"),
                StructureType.COMMERCIAL,
                Cost(resources = listOf(Resource.WOOD, Resource.WOOD), chainedBy = Name("Marketplace")),
                emptyList(),
                6,
                Age.AGE_2
            ),
            Card(
                Name("Vineyard"),
                StructureType.COMMERCIAL,
                Cost(resources = emptyList()),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Vineyard"),
                StructureType.COMMERCIAL,
                Cost(resources = emptyList()),
                emptyList(),
                6,
                Age.AGE_2
            ),
            Card(
                Name("Bazar"),
                StructureType.COMMERCIAL,
                Cost(resources = emptyList()),
                emptyList(),
                4,
                Age.AGE_2
            ),
            Card(
                Name("Bazar"),
                StructureType.COMMERCIAL,
                Cost(resources = emptyList()),
                emptyList(),
                7,
                Age.AGE_2
            ),


            Card(
                Name("Walls"),
                StructureType.MILITARY,
                Cost(resources = listOf(Resource.STONE, Resource.STONE, Resource.STONE)),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Walls"),
                StructureType.MILITARY,
                Cost(resources = listOf(Resource.STONE, Resource.STONE, Resource.STONE)),
                emptyList(),
                7,
                Age.AGE_2
            ),
            Card(
                Name("Training Ground"),
                StructureType.MILITARY,
                Cost(resources = listOf(Resource.WOOD, Resource.ORE, Resource.ORE)),
                emptyList(),
                4,
                Age.AGE_2
            ),
            Card(
                Name("Training Ground"),
                StructureType.MILITARY,
                Cost(resources = listOf(Resource.WOOD, Resource.ORE, Resource.ORE)),
                emptyList(),
                6,
                Age.AGE_2
            ),
            Card(
                Name("Training Ground"),
                StructureType.MILITARY,
                Cost(resources = listOf(Resource.WOOD, Resource.ORE, Resource.ORE)),
                emptyList(),
                7,
                Age.AGE_2
            ),
            Card(
                Name("Stables"),
                StructureType.MILITARY,
                Cost(resources = listOf(Resource.ORE, Resource.CLAY, Resource.WOOD), chainedBy = Name("Apothecary")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Stables"),
                StructureType.MILITARY,
                Cost(resources = listOf(Resource.ORE, Resource.CLAY, Resource.WOOD), chainedBy = Name("Apothecary")),
                emptyList(),
                5,
                Age.AGE_2
            ),
            Card(
                Name("Archery Range"),
                StructureType.MILITARY,
                Cost(resources = listOf(Resource.WOOD, Resource.WOOD, Resource.ORE), chainedBy = Name("Workshop")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Archery Range"),
                StructureType.MILITARY,
                Cost(resources = listOf(Resource.WOOD, Resource.WOOD, Resource.ORE), chainedBy = Name("Workshop")),
                emptyList(),
                6,
                Age.AGE_2
            ),

            Card(
                Name("Dispensary"),
                StructureType.SCIENTIFIC,
                Cost(resources = listOf(Resource.ORE, Resource.ORE, Resource.GLASS), chainedBy = Name("Apothecary")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Dispensary"),
                StructureType.SCIENTIFIC,
                Cost(resources = listOf(Resource.ORE, Resource.ORE, Resource.GLASS), chainedBy = Name("Apothecary")),
                emptyList(),
                4,
                Age.AGE_2
            ),
            Card(
                Name("Laboratory"),
                StructureType.SCIENTIFIC,
                Cost(resources = listOf(Resource.CLAY, Resource.CLAY, Resource.PAPYRUS), chainedBy = Name("Workshop")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Laboratory"),
                StructureType.SCIENTIFIC,
                Cost(resources = listOf(Resource.CLAY, Resource.CLAY, Resource.PAPYRUS), chainedBy = Name("Workshop")),
                emptyList(),
                5,
                Age.AGE_2
            ),
            Card(
                Name("Library"),
                StructureType.SCIENTIFIC,
                Cost(resources = listOf(Resource.STONE, Resource.STONE, Resource.LOOM), chainedBy = Name("Scriptorium")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Library"),
                StructureType.SCIENTIFIC,
                Cost(resources = listOf(Resource.STONE, Resource.STONE, Resource.LOOM), chainedBy = Name("Scriptorium")),
                emptyList(),
                6,
                Age.AGE_2
            ),

            Card(
                Name("School"),
                StructureType.SCIENTIFIC,
                Cost(resources = listOf(Resource.WOOD, Resource.PAPYRUS)),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("School"),
                StructureType.SCIENTIFIC,
                Cost(resources = listOf(Resource.WOOD, Resource.PAPYRUS)),
                emptyList(),
                7,
                Age.AGE_2
            ),

            Card(
                Name("Courthouse"),
                StructureType.CIVIL,
                Cost(resources = listOf(Resource.CLAY, Resource.CLAY, Resource.LOOM), chainedBy = Name("Scriptorium")),
                emptyList(),
                3,
                Age.AGE_2
            ),
            Card(
                Name("Courthouse"),
                StructureType.CIVIL,
                Cost(resources = listOf(Resource.CLAY, Resource.CLAY, Resource.LOOM), chainedBy = Name("Scriptorium")),
                emptyList(),
                5,
                Age.AGE_2
            )
        )
    }
}