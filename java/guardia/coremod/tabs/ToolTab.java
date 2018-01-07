package guardia.coremod.tabs;

import guardia.coremod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToolTab extends CreativeTabs 
{
	public ToolTab(String label) { super("tooltab");
	this.setBackgroundImageName("test.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.SWORD_AZURIUM);}
}
