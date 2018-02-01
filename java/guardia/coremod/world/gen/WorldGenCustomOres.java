package guardia.coremod.world.gen;

import java.util.Random;

import guardia.coremod.init.BlockInit;
import guardia.coremod.objects.blocks.BlockOresEnd;
import guardia.coremod.objects.blocks.BlockOresNether;
import guardia.coremod.objects.blocks.BlockOresOverworld;
import guardia.coremod.utils.handlers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator 
{
	private WorldGenerator ore_overworld_copper;
	private WorldGenerator ore_overworld_bauxite;
	private WorldGenerator ore_overworld_cassiterite;
	private WorldGenerator ore_nether_azurium;
	private WorldGenerator ore_nether_blackrock;
	private WorldGenerator ore_end_aether;
	
	public WorldGenCustomOres() 
	{
		ore_overworld_copper = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOresOverworld.VARIANT, EnumHandler.EnumTypeOverworld.copper), 5, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_bauxite = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOresOverworld.VARIANT, EnumHandler.EnumTypeOverworld.bauxite), 7, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_cassiterite = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOresOverworld.VARIANT, EnumHandler.EnumTypeOverworld.cassiterite), 5, BlockMatcher.forBlock(Blocks.STONE));
		ore_nether_azurium = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOresNether.VARIANT, EnumHandler.EnumTypeNether.azurium), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_nether_blackrock = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOresNether.VARIANT, EnumHandler.EnumTypeNether.blackrock), 7, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_end_aether = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOresEnd.VARIANT, EnumHandler.EnumTypeEnd.aether), 7, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(ore_nether_azurium, world, random, chunkX, chunkZ, 15, 0, 256);
			runGenerator(ore_nether_blackrock, world, random, chunkX, chunkZ, 15, 0, 256);
			
			break;
		case 0:
			
			runGenerator(ore_overworld_copper, world, random, chunkX, chunkZ, 20, 15, 60);
			runGenerator(ore_overworld_bauxite, world, random, chunkX, chunkZ, 30, 25, 70);
			runGenerator(ore_overworld_cassiterite, world, random, chunkX, chunkZ, 20, 20, 65);
		
			break;
		case 1:
			
			runGenerator(ore_end_aether, world, random, chunkX, chunkZ, 15, 0, 256);
			
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight +1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
