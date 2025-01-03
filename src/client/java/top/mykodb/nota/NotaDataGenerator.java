package top.mykodb.nota;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import top.mykodb.nota.datagen.model.ModelsProvider;
import top.mykodb.nota.datagen.recipe.RecipesProvider;
import top.mykodb.nota.datagen.lang.ENUSLangProvider;
import top.mykodb.nota.datagen.lang.ZHCNLangProvider;
import top.mykodb.nota.datagen.lootTable.BlockLootTableProvider;
import top.mykodb.nota.datagen.tags.BlockTagsProvider;
import top.mykodb.nota.datagen.tags.ItemTagsProvider;


public class NotaDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        // 数据生成注册表:
        pack.addProvider(ENUSLangProvider::new);
        pack.addProvider(ZHCNLangProvider::new);
        pack.addProvider(ItemTagsProvider::new);
        pack.addProvider(BlockTagsProvider::new);
        pack.addProvider(BlockLootTableProvider::new);
        pack.addProvider(ModelsProvider::new);
        pack.addProvider(RecipesProvider::new);

    }
}
