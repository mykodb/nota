package top.mykodb.nota

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Nota : ModInitializer {
    const val MOD_ID = "nota"
    val logger = LoggerFactory.getLogger(MOD_ID)!!

    /**
     * Runs the mod initializer.
     */
    override fun onInitialize() {
        Blocks.initialize()
        ItemGroups.initialize()
        logger.info("Main initialize finish")
    }
}