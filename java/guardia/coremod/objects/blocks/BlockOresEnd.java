package guardia.coremod.objects.blocks;

import java.util.Random;

import guardia.coremod.Main;
import guardia.coremod.init.BlockInit;
import guardia.coremod.init.ItemInit;
import guardia.coremod.objects.blocks.item.ItemBlockVariants;
import guardia.coremod.utils.handlers.EnumHandler;
import guardia.coremod.utils.handlers.EnumHandler.EnumTypeEnd;
import guardia.coremod.utils.interfaces.IHasModel;
import guardia.coremod.utils.interfaces.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockOresEnd extends Block implements IHasModel, IMetaName 
{
	public static final PropertyEnum<EnumHandler.EnumTypeEnd> VARIANT = PropertyEnum.<EnumHandler.EnumTypeEnd>create("variant", EnumHandler.EnumTypeEnd.class);
	
	private String name, dimension;
	
	public BlockOresEnd(String name, String dimension, Material material, float hardness, float resistance, int harvest)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.coretab);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel("pickaxe", harvest);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler.EnumTypeEnd.aether));
		
				
		this.name = name;
		this.dimension = dimension;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public int damageDropped(IBlockState state) 
	{

        if(state == this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumTypeEnd.aether))
        {
                        return 0;
        }
        return ((EnumHandler.EnumTypeEnd)state.getValue(VARIANT)).getMeta();
}	
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((EnumHandler.EnumTypeEnd)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumTypeEnd.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	{
		for(EnumHandler.EnumTypeEnd variant : EnumHandler.EnumTypeEnd.values())
		{
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return EnumHandler.EnumTypeEnd.values()[stack.getItemDamage()].getName();		                                     
	}
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < EnumHandler.EnumTypeEnd.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ore_" + this.dimension + "_" + EnumHandler.EnumTypeEnd.values()[i].getName(), "inventory");
		}
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		if(state == this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumTypeEnd.aether))
		{			
			return ItemInit.DUST_AETHER;
		}
		return Item.getItemFromBlock(this);
		
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) 
	{
		if(state.getValue(VARIANT) == EnumTypeEnd.aether) 
		{
		    return 2 + random.nextInt(5 - 3 + fortune + 1);
		}
		return fortune + 1;
	}
	

}
