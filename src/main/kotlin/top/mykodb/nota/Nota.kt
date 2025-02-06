package top.mykodb.nota

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory
import top.mykodb.nota.block.NotaBlocks
import top.mykodb.nota.item.NotaItem
import top.mykodb.nota.item.NotaItemGroups
import top.mykodb.nota.item.NotaItems

object Nota : ModInitializer {
    const val MOD_ID = "nota"
    val logger = LoggerFactory.getLogger(MOD_ID)!!

    /**
     * Runs the mod initializer.
     */
    override fun onInitialize() {
        NotaItems.initialize()
        NotaBlocks.initialize()
        NotaItemGroups.initialize()
        logger.info("Main initialize finish")
    }
}