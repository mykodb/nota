package top.mykodb.nota.register.compoennt

import net.minecraft.item.Item
import top.mykodb.nota.Nota

class ModComponents {
    companion object {

        fun initialize() {

            Nota.logger.info("Registering {} components", Nota.MOD_ID);
            // Technically this method can stay empty, but some developers like to notify
            // the console, that certain parts of the mod have been successfully initialized

        }
    }
}