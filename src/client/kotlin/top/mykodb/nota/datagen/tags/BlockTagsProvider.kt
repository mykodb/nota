package top.mykodb.nota.datagen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import net.minecraft.registry.tag.BlockTags
import top.mykodb.nota.block.ModBlock
import java.util.concurrent.CompletableFuture


class BlockTagsProvider(output: FabricDataOutput?, registriesFuture: CompletableFuture<WrapperLookup?>?) :
    BlockTagProvider(output, registriesFuture) {
    override fun configure(wrapperLookup: WrapperLookup) {
        //镐挖掘更快
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlock.LING_SHI_ORE)
            .add(ModBlock.DEEPSLATE_LING_SHI_ORE)
        //铁质及以下的工具挖掘后不会掉落
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
            .add(ModBlock.LING_SHI_ORE)
            .add(ModBlock.DEEPSLATE_LING_SHI_ORE)
    }
}