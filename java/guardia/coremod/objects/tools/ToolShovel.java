package guardia.coremod.objects.tools;

import guardia.coremod.Main;
import guardia.coremod.init.ItemInit;
import guardia.coremod.utils.interfaces.IHasModel;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel
{
	public ToolShovel(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tooltab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
