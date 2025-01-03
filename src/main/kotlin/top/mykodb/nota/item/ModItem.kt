package top.mykodb.nota.item

import net.minecraft.component.type.FoodComponent
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import top.mykodb.nota.Nota
import top.mykodb.nota.compoennt.ModComponents


class ModItem {
    companion object {


        val NOTA:Item = registerItems("nota", Item(Item.Settings()))
        val LING_SHI:Item = registerItems("ling_shi", ModItemCover.NotaItem(Item.Settings()))

        //注册食物的一个案例
        val BI_GU_DAN:Item = registerItems("bi_gu_dan", ModItemCover.NotaItem(
            Item.Settings().component(ModComponents.DESCRIPTION, "吃一颗，一天都不用吃饭了。")
                .food((FoodComponent.Builder())
                        .snack()
                        .alwaysEdible()
                        .statusEffect(StatusEffectInstance(StatusEffects.SATURATION, 20 * 60 * 8, 1), 1.0f)
                        .build()
                ))
        )




        //注册物品的方法
        private fun registerItems(path:String, item:Item):Item{
            return Registry.register(Registries.ITEM, Identifier.of(Nota.MOD_ID,path),item)
        }

        fun initialize() {
            Nota.logger.debug("")
        }
    }
}