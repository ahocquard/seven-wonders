package io.github.ahocquard.sevenwonders.specification.game.domain.resource

import io.github.ahocquard.sevenwonders.game.domain.resource.ProduceAll
import io.github.ahocquard.sevenwonders.game.domain.resource.ProduceOneOf
import io.github.ahocquard.sevenwonders.game.domain.resource.ProducedResources
import io.github.ahocquard.sevenwonders.game.domain.resource.Resource
import io.kotlintest.matchers.containAll
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class ProducedResourcesSpec : StringSpec({
    "it produces all the new resources when there is not produced resources yet" {
        val producedResources = ProducedResources().addNewProducedResource(
                ProduceAll(listOf(Resource.CLAY, Resource.GLASS))
        )

        producedResources.isProducingResources(listOf(Resource.CLAY, Resource.GLASS)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.GLASS, Resource.CLAY)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.CLAY)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.GLASS)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.GLASS, Resource.GLASS)) shouldBe false
        producedResources.isProducingResources(listOf(Resource.CLAY, Resource.CLAY)) shouldBe false
        producedResources.isProducingResources(listOf(Resource.ORE)) shouldBe false
    }

    "it produces all the new resources when there is already some produced resources" {
        val producedResources = ProducedResources()
                .addNewProducedResource(ProduceAll(listOf(Resource.CLAY, Resource.GLASS)))
                .addNewProducedResource(ProduceAll(listOf(Resource.LOOM, Resource.GLASS)))

        producedResources.isProducingResources(listOf(Resource.CLAY, Resource.GLASS)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.CLAY)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.GLASS, Resource.LOOM, Resource.GLASS, Resource.CLAY)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.GLASS, Resource.LOOM, Resource.GLASS, Resource.CLAY, Resource.LOOM)) shouldBe false
        producedResources.isProducingResources(listOf(Resource.GLASS, Resource.GLASS, Resource.GLASS)) shouldBe false
        producedResources.isProducingResources(listOf(Resource.ORE)) shouldBe false
    }

    "it produces one of the resources when there are not any produced resources yet" {
        val producedResources = ProducedResources().addNewProducedResource(
                ProduceOneOf(listOf(Resource.CLAY, Resource.GLASS))
        )

        producedResources.isProducingResources(listOf(Resource.CLAY)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.GLASS)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.CLAY, Resource.GLASS)) shouldBe false
        producedResources.isProducingResources(listOf(Resource.ORE)) shouldBe false
    }

    "it produces one of the resources when there are already produced resources" {
        val producedResources = ProducedResources()
                .addNewProducedResource(ProduceOneOf(listOf(Resource.CLAY, Resource.GLASS)))
                .addNewProducedResource(ProduceAll(listOf(Resource.ORE, Resource.PAPYRUS)))

        producedResources.isProducingResources(listOf(Resource.CLAY)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.ORE)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.PAPYRUS)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.GLASS)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.CLAY, Resource.ORE, Resource.PAPYRUS)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.GLASS, Resource.ORE, Resource.PAPYRUS)) shouldBe true
        producedResources.isProducingResources(listOf(Resource.CLAY, Resource.GLASS, Resource.ORE, Resource.PAPYRUS)) shouldBe false
        producedResources.isProducingResources(listOf(Resource.CLAY, Resource.PAPYRUS, Resource.LOOM)) shouldBe false
        producedResources.isProducingResources(listOf(Resource.STONE)) shouldBe false
    }
})