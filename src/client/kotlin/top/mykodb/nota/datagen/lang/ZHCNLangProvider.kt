package top.mykodb.nota.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import top.mykodb.nota.register.ModBlock
import top.mykodb.nota.register.ModItem
import java.util.concurrent.CompletableFuture

class ZHCNLangProvider(dataOutput: FabricDataOutput?, registryLookup: CompletableFuture<WrapperLookup?>?) :
    FabricLanguageProvider(dataOutput, "zh_cn", registryLookup) {
    override fun generateTranslations(registryLookup: WrapperLookup, ling: TranslationBuilder) {
        //ling.add()
        ling.add(ModItem.LING_SHI, "灵石")
        ling.add(ModItem.NOTA,"nota")
        ling.add(ModBlock.LING_SHI_ORE,"灵石矿")
        ling.add(ModBlock.DEEPSLATE_LING_SHI_ORE,"深层灵石矿")
    }
}