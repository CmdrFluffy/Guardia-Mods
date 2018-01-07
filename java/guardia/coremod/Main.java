package guardia.coremod;

import guardia.coremod.proxy.Common;
import guardia.coremod.tabs.CoreTab;
import guardia.coremod.tabs.ToolTab;
import guardia.coremod.utils.Reference;
import guardia.coremod.utils.handlers.RecipeHandler;
import guardia.coremod.utils.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static final CreativeTabs coretab = new CoreTab("coretab");
	public static final CreativeTabs tooltab = new ToolTab("tooltab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static Common proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.otherRegistries();}
	@EventHandler
	public static void init(FMLInitializationEvent event) {RecipeHandler.registerSmelting();}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}
