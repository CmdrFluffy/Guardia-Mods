package guardia.coremod.utils.handlers;

import guardia.coremod.init.BlockInit;
import guardia.coremod.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	public static void registerSmelting()
	{
		//Overworld
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, EnumHandler.EnumTypeOverworld.copper.getMeta()), new ItemStack(ItemInit.INGOT_COPPER), 10);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, EnumHandler.EnumTypeOverworld.bauxite.getMeta()), new ItemStack(ItemInit.INGOT_ALUMINUM), 10);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, EnumHandler.EnumTypeOverworld.cassiterite.getMeta()), new ItemStack(ItemInit.INGOT_TIN), 10);
		//Nether
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_NETHER, 1, EnumHandler.EnumTypeNether.azurium.getMeta()), new ItemStack(ItemInit.INGOT_AZURIUM), 10);
	}
}
