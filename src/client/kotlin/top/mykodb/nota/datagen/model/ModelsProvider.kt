package top.mykodb.nota.datagen.model

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models
import top.mykodb.nota.block.ModBlock
import top.mykodb.nota.item.ModItem


class ModelsProvider(output: FabricDataOutput?) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.LING_SHI_ORE)
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.DEEPSLATE_LING_SHI_ORE)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator?) {
        itemModelGenerator?.register(ModItem.LING_SHI, Models.GENERATED)
    }
}