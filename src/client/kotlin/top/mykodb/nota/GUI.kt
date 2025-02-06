package top.mykodb.nota

import net.minecraft.client.gui.DrawContext

import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.widget.ButtonWidget
import net.minecraft.client.toast.SystemToast
import net.minecraft.text.Text

class GUI{
    class GUI(title: Text?) : Screen(title) {
        override fun init() {
        val buttonWidget: ButtonWidget? = ButtonWidget.builder(Text.of("Hello World")) { btn ->
            // 单击该按钮后，我们可以在屏幕上显示 toast。
            client!!.toastManager.add(
                SystemToast.create(
                    this.client,
                    SystemToast.Type.NARRATOR_TOGGLE,
                    Text.of("Hello World!"),
                    Text.of("This is a toast.")
                )
            )
        }.dimensions(40, 40, 120, 20).build()

        // x, y, width, height
        // 建议使用固定高度 20 以防止按钮出现渲染问题
        // textures.

        // Register the button widget.
        this.addDrawableChild(buttonWidget)
        }
        override fun render(context: DrawContext, mouseX: Int, mouseY: Int, delta: Float) {
            super.render(context, mouseX, mouseY, delta)

            //Minecraft 没有 “label” 小部件，因此我们必须绘制自己的文本。
            // 我们将从 Y 位置减去字体高度，使文本显示在按钮上方。
            // 减去额外的 10 个像素将为文本提供一些填充。
            // textRenderer, text, x, y, color, hasShadow
            context.drawText(this.textRenderer, "Special Button", 40, 40 - textRenderer.fontHeight - 10, -0x1, true)
        }
    }
}

