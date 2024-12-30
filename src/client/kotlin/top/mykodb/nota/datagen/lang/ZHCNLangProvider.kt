package top.mykodb.nota.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import top.mykodb.nota.register.ModItem.Companion.LING_SHI
import top.mykodb.nota.register.ModItem.Companion.NOTA
import java.util.concurrent.CompletableFuture

class ZHCNLangProvider(dataOutput: FabricDataOutput?, registryLookup: CompletableFuture<WrapperLookup?>?) :
    FabricLanguageProvider(dataOutput, "zh_cn", registryLookup) {
    override fun generateTranslations(registryLookup: WrapperLookup, ling: TranslationBuilder) {
        //ling.add()
        ling.add(LING_SHI, "灵石")
        ling.add(NOTA,"nota")
    }
}