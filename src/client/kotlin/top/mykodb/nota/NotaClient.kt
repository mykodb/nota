package top.mykodb.nota

import net.fabricmc.api.ClientModInitializer

import top.mykodb.nota.Nota.logger


object NotaClient : ClientModInitializer {


	/**
	 * Runs the mod initializer.
	 */
	override fun onInitializeClient() {

		logger.info("Client initialize finish")
	}
}