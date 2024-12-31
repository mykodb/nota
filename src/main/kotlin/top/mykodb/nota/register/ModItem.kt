package top.mykodb.nota.register

import net.minecraft.component.type.FoodComponent
import net.minecraft.component.type.FoodComponents
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import top.mykodb.nota.Nota

class ModItem {
    companion object {
        val NOTA:Item = registerItems("nota", Item(Item.Settings()))
        val LING_SHI:Item = registerItems("ling_shi",Item(Item.Settings()))

        val DAN_YAO:Item = registerItems("dan_yao",Item(Item.Settings().food((FoodComponent.Builder())
                .nutrition(4)
                .saturationModifier(0.3f)
                .statusEffect(StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F)
                .build())))

        private fun registerItems(path:String, item:Item):Item{
            return Registry.register(Registries.ITEM, Identifier.of(Nota.MOD_ID,path),item)
        }

        fun initialize() {

        }
    }
}