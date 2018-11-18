package io.github.ahocquard.sevenwonders.game.domain.resource

/**
 * This data class contains the produced resource of a player.
 *
 * Internally, it generate all the combinations of the resources.
 *
 * For example, if the produced resources are
 * - a Stone
 * - a Stone or a Clay
 *
 * Then, it means the combination of the resources are:
 * - a Stone and a Stone
 * - a Stone and a Clay
 *
 * This data class is immutable: adding an element will generate another instance of this data class.
 */
data class ProducedResources(val producedResourcesCombinations: List<List<Resource>> = listOf(emptyList())) {
    fun addNewProducedResource(produceOneOf: ProduceOneOf): ProducedResources {
        val combinations = ArrayList<List<Resource>>()

        produceOneOf.resources.forEach { addedResource ->
            producedResourcesCombinations.forEach { combination ->
                val newCombination = combination.toMutableList()
                newCombination.add(addedResource)

                combinations.add(newCombination)
            }
        }

        return ProducedResources(combinations)
    }

    fun addNewProducedResource(produceAll: ProduceAll): ProducedResources {
        val combinations = ArrayList<List<Resource>>()

        producedResourcesCombinations.forEach { combination ->
            val newCombination = combination.toMutableList()
            newCombination.addAll(produceAll.resources)

            combinations.add(newCombination)
        }

        return ProducedResources(combinations)
    }

    fun isProducingResources(resourcesToProduce: List<Resource>): Boolean {
        val groupedByResourcesToProduce = resourcesToProduce.groupingBy { it }.eachCount()
        val combinationsGroupByResources = this.producedResourcesCombinations.map {
            combination -> combination.groupingBy { it }.eachCount()
        }

        return combinationsGroupByResources.filter { combination ->
            groupedByResourcesToProduce.filter { resourcesToProduce ->
                !combination.containsKey(resourcesToProduce.key) || combination.getValue(resourcesToProduce.key) < resourcesToProduce.value
            }.isEmpty()
        }.isNotEmpty()
    }
}