package top.mykodb.nota

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory
import top.mykodb.nota.register.ModBlock
import top.mykodb.nota.register.ModItem
import top.mykodb.nota.register.ModItemGroups
import top.mykodb.nota.register.world.ModFeature


object Nota : ModInitializer {
	const val MOD_ID:String = "nota"
    private val logger = LoggerFactory.getLogger("nota")


	override fun onInitialize() {
		logger.info("Hello Fabric world!")


		//注册表
		ModItem.initialize()
		ModBlock.initialize()
		ModItemGroups.initialize()
		ModFeature.initialize()
	}
}