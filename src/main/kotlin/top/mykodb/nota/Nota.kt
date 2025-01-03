package top.mykodb.nota

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory
import top.mykodb.nota.block.ModBlock
import top.mykodb.nota.item.ModItem
import top.mykodb.nota.item.ModItemGroups
import top.mykodb.nota.compoennt.ModComponents
import top.mykodb.nota.world.ModFeature


object Nota : ModInitializer {
	const val MOD_ID:String = "nota"
	val logger = LoggerFactory.getLogger("nota")!!


	override fun onInitialize() {
		logger.info("Entering the registration phase")
		//注册表：
		ModItem.initialize() // 物品
		ModBlock.initialize() // 方块
		ModItemGroups.initialize() // 物品栏
		ModFeature.initialize() // 地物
		ModComponents.initialize() // 组件
	}


}
