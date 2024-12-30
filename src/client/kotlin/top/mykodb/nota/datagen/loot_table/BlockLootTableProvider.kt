package top.mykodb.nota.datagen.loot_table

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.block.Block
import net.minecraft.enchantment.Enchantments
import net.minecraft.item.Item
import net.minecraft.loot.LootTable
import net.minecraft.loot.entry.ItemEntry
import net.minecraft.loot.entry.LootPoolEntry
import net.minecraft.loot.function.ApplyBonusLootFunction
import net.minecraft.loot.function.SetCountLootFunction
import net.minecraft.loot.provider.number.UniformLootNumberProvider
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import top.mykodb.nota.register.ModBlock
import top.mykodb.nota.register.ModItem
import java.util.concurrent.CompletableFuture


class BlockLootTableProvider(dataOutput: FabricDataOutput?,registryLookup: CompletableFuture<WrapperLookup>?
) : FabricBlockLootTableProvider(dataOutput, registryLookup) {

    private fun oreLikeDrops(drop : Block, dropItem : Item, min : Float, max : Float): LootTable.Builder {
        val impl = registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT)
        return this.dropsWithSilkTouch(
            drop,
            applyExplosionDecay(
                drop,
                ItemEntry.builder(dropItem)
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                    .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
            ) as LootPoolEntry.Builder<*>
        )
    }


    override fun generate() {
        addDrop(ModBlock.LING_SHI_ORE, oreLikeDrops(ModBlock.LING_SHI_ORE, ModItem.LING_SHI,2.0f,5.0f))
        addDrop(ModBlock.DEEPSLATE_LING_SHI_ORE, oreLikeDrops(ModBlock.DEEPSLATE_LING_SHI_ORE, ModItem.LING_SHI,3.0f,6.0f))
    }
}