package top.mykodb.nota.item



import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.tooltip.TooltipType
import net.minecraft.text.Text
import net.minecraft.util.Formatting
import top.mykodb.nota.compoennt.ModComponents


class ModItemCover{


    class NotaItem(settings: Settings?) : Item(settings){

        override fun appendTooltip(stack: ItemStack?, context: TooltipContext?, tooltip: MutableList<Text?>, type: TooltipType?) {
            if (stack != null) {
                //为物品添加描述
                if (stack.contains(ModComponents.DESCRIPTION)) {
                    val count: String? = stack.get(ModComponents.DESCRIPTION)
                    tooltip.add(
                        Text.translatable(count).formatted(Formatting.GOLD)
                    )
                }
            }
        }
    }

}

