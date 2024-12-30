package top.mykodb.nota.register

import net.minecraft.registry.Registry
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.util.Identifier
import top.mykodb.nota.Nota

class ModItem {
    companion object {
        val NOTA:Item = registerItems("nota", Item(Item.Settings()))
        val LING_SHI:Item = registerItems("ling_shi",Item(Item.Settings()))

        private fun registerItems(path:String, item:Item):Item{
            return Registry.register(Registries.ITEM, Identifier.of(Nota.MOD_ID,path),item)
        }

        fun initialize() {

        }
    }
}