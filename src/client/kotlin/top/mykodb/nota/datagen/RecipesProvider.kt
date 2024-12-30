package top.mykodb.nota.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import java.util.concurrent.CompletableFuture


class RecipesProvider(output: FabricDataOutput?, registriesFuture: CompletableFuture<WrapperLookup?>?) :
    FabricRecipeProvider(output, registriesFuture) {
    override fun generate(exporter: RecipeExporter) {
    }
}