package top.mykodb.nota

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

interface Registry {
    companion object {
        /**
         * 用于注册方块和方块的物品.
         * Items used to register blocks and blocks.
         */
        fun registerBlockItem(path: String, block: Block): Block {
            Registry.register(Registries.ITEM, Identifier.of(Nota.MOD_ID, path), BlockItem(block, Item.Settings()))
            Registry.register(Registries.BLOCK, Identifier.of(Nota.MOD_ID, path), block)
            return block
        }

        /**
         * 用于注册物品.
         * Used to register items.
         */
        fun registerItem(path: String, item: Item): Item {
            Registry.register(Registries.ITEM, Identifier.of(Nota.MOD_ID, path), item)
            return item
        }

        /**
         * 用于注册物品栏.
         * Used to register the inventory.
         */
        fun registerItemGroup(path: String, itemGroup: ItemGroup): ItemGroup {
            Registry.register(Registries.ITEM_GROUP, Identifier.of(Nota.MOD_ID, path), itemGroup)
            return itemGroup
        }
    }
}