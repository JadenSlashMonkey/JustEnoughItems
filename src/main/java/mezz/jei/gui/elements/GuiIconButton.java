package mezz.jei.gui.elements;

import mezz.jei.api.gui.IDrawable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

/**
 * A gui button that has an {@link IDrawable} instead of a string label.
 */
public class GuiIconButton extends GuiButton {
	private final IDrawable icon;

	public GuiIconButton(int buttonId, IDrawable icon) {
		super(buttonId, 0, 0, 0, 0, "");
		this.icon = icon;
	}

	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
		super.drawButton(mc, mouseX, mouseY, partialTicks);
		if (this.visible) {
			int xOffset = x + (height - this.icon.getWidth()) / 2;
			int yOffset = y + (width - this.icon.getHeight()) / 2;
			this.icon.draw(mc, xOffset, yOffset);
		}
	}
}
