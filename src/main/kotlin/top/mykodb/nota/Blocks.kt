package top.mykodb.nota

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import top.mykodb.nota.Registry.Companion.registerBlockItem


class Blocks {
    companion object {
        val LING_SHI_ORE: Block = registerBlockItem("ling_shi_ore", Block(AbstractBlock.Settings.create().strength(2.0f).requiresTool()))
        fun initialize(){}
    }
}