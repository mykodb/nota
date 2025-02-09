package top.mykodb.nota.gui

import net.minecraft.client.gui.DrawContext

import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.widget.ButtonWidget
import net.minecraft.client.gui.widget.TextFieldWidget
import net.minecraft.client.toast.SystemToast
import net.minecraft.text.Text
import top.mykodb.nota.gui.widget.TerminalWidget

class GUI{
    class TerminalGUI(title: Text?) : Screen(title) {
        override fun init() {
        // TextRenderer,x, y, width, height, text
        val textField = TerminalWidget( this.textRenderer,this.width/8, this.height/8,(this.width*3)/4, (this.height*3)/4, Text.literal("Enter text here"))
        this.addDrawableChild(textField)

        }
        override fun render(context: DrawContext, mouseX: Int, mouseY: Int, delta: Float) {
            super.render(context, mouseX, mouseY, delta)

            // TextRenderer, text, x, y, color, hasShadow
            context.drawText(this.textRenderer, "width=${this.width}height=${this.height}", 40, 40 - textRenderer.fontHeight - 10, -0x1, true)
        }
    }
}

