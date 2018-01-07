package guardia.coremod.objects.blocks;

import guardia.coremod.Main;
import guardia.coremod.init.BlockInit;
import guardia.coremod.init.ItemInit;
import guardia.coremod.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{

	public BlockBase(String name, Material material, float hardness, float resistance)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setCreativeTab(Main.coretab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
