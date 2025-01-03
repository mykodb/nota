package top.mykodb.nota.item

import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import top.mykodb.nota.Nota
import top.mykodb.nota.block.ModBlock


class ModItemGroups {
    companion object {

        val ITEM_GROUP: ItemGroup = Registry.register(
            Registries.ITEM_GROUP, Identifier.of(Nota.MOD_ID, "nota_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.nota_group"))
                .icon{ ItemStack(ModItem.NOTA) }
                .entries { _: ItemGroup.DisplayContext, entries: ItemGroup.Entries ->
                    //entries.add()
                    entries.add(ModItem.BI_GU_DAN)
                    entries.add(ModItem.LING_SHI)
                    entries.add(ModBlock.LING_SHI_ORE)
                    entries.add(ModBlock.DEEPSLATE_LING_SHI_ORE)
                }.build()
        )

        fun initialize(){

        }
    }
}