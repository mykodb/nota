package top.mykodb.nota.register.world

import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier
import net.minecraft.world.gen.GenerationStep
import top.mykodb.nota.Nota

class ModFeature {
    companion object {
        val ORE_LINGShI = BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
            RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Nota.MOD_ID, "ore_lingshi")))

        fun initialize() {
        }
    }
}