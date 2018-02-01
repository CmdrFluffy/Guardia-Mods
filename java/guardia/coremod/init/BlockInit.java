package guardia.coremod.init;

import java.util.ArrayList;
import java.util.List;

import guardia.coremod.objects.blocks.BlockBase;
import guardia.coremod.objects.blocks.BlockOresEnd;
import guardia.coremod.objects.blocks.BlockOresNether;
import guardia.coremod.objects.blocks.BlockOresOverworld;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON, 5F, 30F);
	public static final Block BLOCK_TIN = new BlockBase("block_tin", Material.IRON, 5F, 20F);
	public static final Block BLOCK_ALUMINUM = new BlockBase("block_aluminum", Material.IRON, 5F, 10F);
	public static final Block BLOCK_AZURIUM = new BlockBase("block_azurium", Material.IRON, 5F, 60F);	
	
	
	public static final Block ORE_END = new BlockOresEnd("ore_end", "end", Material.ROCK, 3F, 45F, 3);
	public static final Block ORE_OVERWORLD = new BlockOresOverworld("ore_overworld", "overworld", Material.ROCK, 3F, 15F, 2);
	public static final Block ORE_NETHER = new BlockOresNether("ore_nether", "nether", Material.ROCK, 4F, 15F, 3);
		
	
}
