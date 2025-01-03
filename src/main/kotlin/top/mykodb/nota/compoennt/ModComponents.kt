package top.mykodb.nota.compoennt

import com.mojang.serialization.Codec
import net.minecraft.component.ComponentType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import top.mykodb.nota.Nota


class ModComponents {
    companion object {

        //description 用于NotaItem添加物品描述
        val DESCRIPTION: ComponentType<String> = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Nota.MOD_ID, "description"),
            ComponentType.builder<String>().codec(Codec.STRING).build()
        )

        fun initialize() {
        }
    }
}