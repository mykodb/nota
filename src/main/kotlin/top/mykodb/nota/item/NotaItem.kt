package top.mykodb.nota.item


import net.fabricmc.fabric.api.networking.v1.PacketByteBufs
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking.send
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.util.Hand
import net.minecraft.util.Identifier
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World
import top.mykodb.nota.Nota.MOD_ID


class NotaItem {

    class ItemTerminal(settings: Settings) : Item(settings){
        override fun use(world: World, user: PlayerEntity, hand: Hand?): TypedActionResult<ItemStack>? {
            // 确保在服务器上运行
            if (world.isClient) { return TypedActionResult.pass(user.getStackInHand(hand)) }
            // 向客户端发送空数据包以通知客户端执行客户端逻辑·
            send(user as ServerPlayerEntity, Identifier.of(MOD_ID, "terminal_gui"), PacketByteBufs.empty())
            return TypedActionResult.success(user.getStackInHand(hand))
        }
    }

}