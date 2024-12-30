package top.mykodb.nota.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import top.mykodb.nota.datagen.lang.ModENUSLanProvider;
import top.mykodb.nota.datagen.lang.ModZHCNLanProvider;


public class NotaDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Adding a provider example:
        //
        pack.addProvider(ModENUSLanProvider::new);
        pack.addProvider(ModZHCNLanProvider::new);

    }
}
