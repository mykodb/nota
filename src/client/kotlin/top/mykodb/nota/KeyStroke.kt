package top.mykodb.nota

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.minecraft.client.MinecraftClient
import net.minecraft.client.option.KeyBinding
import net.minecraft.client.util.InputUtil
import net.minecraft.text.Text
import org.lwjgl.glfw.GLFW
import top.mykodb.nota.Nota.MOD_ID


class KeyStroke {
    companion object{

        private val keyGui: KeyBinding =  KeyBindingHelper.registerKeyBinding( KeyBinding(
        "key.$MOD_ID.spook", // 键绑定名称的翻译键
        InputUtil.Type.KEYSYM, // 键绑定的类型 KEYSYM 用于键盘 MOUSE 用于鼠标
        GLFW.GLFW_KEY_R, // 按键代码
        "category.$MOD_ID.test" // 键绑定类别的翻译键
        ))



        fun initialize(){
            ClientTickEvents.END_CLIENT_TICK.register(ClientTickEvents.EndTick {
                while (keyGui.wasPressed()) {
                    MinecraftClient.getInstance().setScreen(GUI.GUI(Text.empty()))
                }
            })
        }

    }

}