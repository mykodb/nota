package top.mykodb.nota.gui.widget

import net.minecraft.client.font.TextRenderer
import net.minecraft.client.gui.DrawContext
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder
import net.minecraft.client.gui.screen.narration.NarrationPart
import net.minecraft.client.gui.widget.ClickableWidget
import net.minecraft.text.Text

class TerminalWidget(private val textRenderer: TextRenderer, x: Int, y: Int, width: Int, height: Int, text: Text?) : ClickableWidget( x, y, width, height, text) {

    private var drawsBackground = true
    private var string = "okay"

    private fun drawsBackground(): Boolean {
        return this.drawsBackground
    }
    private fun isVisible(): Boolean {
        return this.visible
    }

    override fun renderButton(context: DrawContext, mouseX: Int, mouseY: Int, delta: Float) {
        if (this.isVisible()) {
            if (this.drawsBackground()) {
                //聚焦高亮边框颜色
                val i = if (this.isFocused) -1 else -6250336
                //绘制边框
                context.fill(this.x-1, this.y-1, this.x+this.width+1, this.y+this.height+1,i)
                //填充背景
                context.fill(this.x,this.y,this.x+this.width,this.y+this.height,-16777216)
            }
            val k = this.x+1
            val l = this.y+1
            context.drawText(this.textRenderer,"§1空",k,l,-1,false)
            context.drawText(this.textRenderer,string,k,l+9,-1,false)
            context.drawText(this.textRenderer,string,k,l+9+9,-1,false)
            /*
            *判断每行可渲染文本长度，对超过的文本进行处理。
            *
            * */
        }
    }

    public override fun appendClickableNarrations(builder: NarrationMessageBuilder) {
        builder.put(NarrationPart.TITLE, this.narrationMessage)
    }

}