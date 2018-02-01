package guardia.coremod.objects.blocks;

import guardia.coremod.Main;
import guardia.coremod.init.BlockInit;
import guardia.coremod.init.ItemInit;
import guardia.coremod.objects.blocks.item.ItemBlockVariants;
import guardia.coremod.utils.handlers.EnumHandler;
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

public class BlockOresOverworld extends Block implements IHasModel, IMetaName 
{
	public static final PropertyEnum<EnumHandler.EnumTypeOverworld> VARIANT = PropertyEnum.<EnumHandler.EnumTypeOverworld>create("variant", EnumHandler.EnumTypeOverworld.class);
	
	private String name, dimension;
	
	public BlockOresOverworld(String name, String dimension, Material material, float hardness, float resistance, int harvest)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.coretab);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel("pickaxe", harvest);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler.EnumTypeOverworld.copper));
		
		this.name = name;
		this.dimension = dimension;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((EnumHandler.EnumTypeOverworld)state.getValue(VARIANT)).getMeta();
	}	
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((EnumHandler.EnumTypeOverworld)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumTypeOverworld.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	{
		for(EnumHandler.EnumTypeOverworld variant : EnumHandler.EnumTypeOverworld.values())
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
		return EnumHandler.EnumTypeOverworld.values()[stack.getItemDamage()].getName();		                                     
	}
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < EnumHandler.EnumTypeOverworld.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ore_" + this.dimension + "_" + EnumHandler.EnumTypeOverworld.values()[i].getName(), "inventory");
		}
	}
}
