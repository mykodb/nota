package top.mykodb.nota;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import top.mykodb.nota.datagen.lang.ENUSLangProvider;
import top.mykodb.nota.datagen.lang.ZHCNLangProvider;


public class NotaDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        // Adding a provider example:
        pack.addProvider(ENUSLangProvider::new);
        pack.addProvider(ZHCNLangProvider::new);

    }
}
