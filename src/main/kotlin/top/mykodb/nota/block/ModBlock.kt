package top.mykodb.nota.block

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import top.mykodb.nota.Nota


class ModBlock {
    companion object {

        val LING_SHI_ORE: Block = registerBlockItem("ling_shi_ore", Block(AbstractBlock.Settings.create().strength(2.0f).requiresTool()))
        val DEEPSLATE_LING_SHI_ORE: Block = registerBlockItem("deepslate_ling_shi_ore", Block(AbstractBlock.Settings.create().strength(3.0f).requiresTool()))

        //注册方块,方块物品
        private fun registerBlockItem(path:String, block:Block):Block{
            Registry.register(Registries.ITEM, Identifier.of(Nota.MOD_ID, path), BlockItem(block, Item.Settings()))
            Registry.register(Registries.BLOCK, Identifier.of(Nota.MOD_ID, path), block)
            return block
        }

        fun initialize() {
        }
    }
}