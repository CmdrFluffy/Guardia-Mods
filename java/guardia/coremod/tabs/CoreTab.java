package guardia.coremod.tabs;

import guardia.coremod.init.BlockInit;
import guardia.coremod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CoreTab extends CreativeTabs 
{
	public CoreTab(String label) { super("coretab");
	this.setBackgroundImageName("test.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.BLOCK_AZURIUM);}
}
