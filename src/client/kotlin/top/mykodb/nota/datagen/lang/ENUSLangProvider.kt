package top.mykodb.nota.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import java.util.concurrent.CompletableFuture

class ENUSLangProvider(dataOutput: FabricDataOutput?, registryLookup: CompletableFuture<WrapperLookup?>?) :
    FabricLanguageProvider(dataOutput, "en_us", registryLookup) {
    override fun generateTranslations(registryLookup: WrapperLookup, ling: TranslationBuilder) {
        //ling.add()

    }
}