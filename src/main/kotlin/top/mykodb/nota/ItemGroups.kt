package top.mykodb.nota

import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.text.Text
import top.mykodb.nota.Registry.Companion.registerItemGroup

class ItemGroups {
    companion object {
        val ITEM_GROUP: ItemGroup = registerItemGroup(
            "nota_group", ItemGroup
            .create(null, -1).icon { ItemStack(Items.ITEM_FRAME) }
            .displayName(Text.translatable("itemGroup.nota_group"))
            .entries { _: ItemGroup.DisplayContext, entries: ItemGroup.Entries ->
                entries.add(Items.AIR)
            }.build()
        )

        fun initialize() {}
    }
}