package top.mykodb.nota.datagen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import java.util.concurrent.CompletableFuture


class ItemTagsProvider(output: FabricDataOutput?, completableFuture: CompletableFuture<WrapperLookup?>?) :
    FabricTagProvider.ItemTagProvider(output, completableFuture) {
    override fun configure(wrapperLookup: WrapperLookup) {
    }
}