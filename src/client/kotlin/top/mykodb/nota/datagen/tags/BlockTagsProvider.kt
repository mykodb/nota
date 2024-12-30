package top.mykodb.nota.datagen.tags

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import java.util.concurrent.CompletableFuture


class BlockTagsProvider(output: FabricDataOutput?, registriesFuture: CompletableFuture<WrapperLookup?>?) :
    BlockTagProvider(output, registriesFuture) {
    override fun configure(wrapperLookup: WrapperLookup) {

    }
}