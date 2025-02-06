package top.mykodb.nota.item

import net.minecraft.item.Item
import top.mykodb.nota.Registry.Companion.registerItem

class NotaItems {
    companion object{
        val TERMINAL = registerItem("terminal", NotaItem.ItemTerminal(Item.Settings()))
        fun initialize(){}
    }
}