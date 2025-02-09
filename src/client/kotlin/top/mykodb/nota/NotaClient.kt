package top.mykodb.nota

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
import net.minecraft.client.MinecraftClient
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import top.mykodb.nota.Nota.MOD_ID

import top.mykodb.nota.Nota.logger
import top.mykodb.nota.gui.GUI


object NotaClient : ClientModInitializer {

	private fun terminalGui (){
		ClientPlayNetworking.registerGlobalReceiver( Identifier.of(MOD_ID, "terminal_gui")) { client, _, _, _ ->
			//实现客户端需要执行的逻辑
			client.execute {
				MinecraftClient.getInstance().setScreen(GUI.TerminalGUI(Text.empty()))
			}
		}
	}

	/**
	 * Runs the mod initializer.
	 */
	override fun onInitializeClient() {
		terminalGui()
		KeyStroke.initialize()
		logger.info("Client initialize finish")
	}
}

