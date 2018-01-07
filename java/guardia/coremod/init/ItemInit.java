package guardia.coremod.init;

import java.util.ArrayList;
import java.util.List;
import guardia.coremod.objects.armor.ArmorBase;
import guardia.coremod.objects.items.ItemBase;
import guardia.coremod.objects.tools.ToolAxe;
import guardia.coremod.objects.tools.ToolHoe;
import guardia.coremod.objects.tools.ToolPickaxe;
import guardia.coremod.objects.tools.ToolShovel;
import guardia.coremod.objects.tools.ToolSword;
import guardia.coremod.utils.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 150, 5.0F, 1.5F, 14);
	public static final ToolMaterial TOOL_ALUMINUM = EnumHelper.addToolMaterial("tool_aluminum", 1, 65, 5.0F, 1.5F, 14);
	public static final ToolMaterial TOOL_TIN = EnumHelper.addToolMaterial("tool_tin", 1, 100, 5.0F, 1.5F, 14);
	public static final ToolMaterial TOOL_AZURIUM = EnumHelper.addToolMaterial("tool_azurium", 3, 2000, 5.0F, 1.5F, 14);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MODID + ":copper", 12, new int[]{2, 4, 5, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_ALUMINUM = EnumHelper.addArmorMaterial("armor_aluminum", Reference.MODID + ":aluminum", 7, new int[]{1, 2, 3, 1}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_TIN = EnumHelper.addArmorMaterial("armor_tin", Reference.MODID + ":tin", 8, new int[]{1, 3, 3, 1}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_AZURIUM = EnumHelper.addArmorMaterial("armor_azurium", Reference.MODID + ":azurium", 40, new int[]{4, 6, 8, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	
	//Items
		//Ingot
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item INGOT_ALUMINUM = new ItemBase("ingot_aluminum");
	public static final Item INGOT_TIN = new ItemBase("ingot_tin");
	public static final Item INGOT_AZURIUM = new ItemBase("ingot_azurium");
		//Nugget
	public static final Item NUGGET_COPPER = new ItemBase("nugget_copper");
	public static final Item NUGGET_ALUMINUM = new ItemBase("nugget_aluminum");
	public static final Item NUGGET_TIN = new ItemBase("nugget_tin");
	public static final Item NUGGET_AZURIUM = new ItemBase("nugget_azurium");
		//Dust
	public static final Item DUST_COPPER = new ItemBase("dust_copper");
	public static final Item DUST_ALUMINUM = new ItemBase("dust_aluminum");
	public static final Item DUST_TIN = new ItemBase("dust_tin");
	public static final Item DUST_AZURIUM = new ItemBase("dust_azurium");
	public static final Item DUST_BLACKROCK = new ItemBase("dust_blackrock");
	public static final Item DUST_AETHER = new ItemBase("dust_aether");
		//Misc
	public static final Item SHARD_BLACKROCK = new ItemBase("shard_blackrock");
	
	//Armor
		//Head
	public static final Item HELMET_COPPER = new ArmorBase("helmet_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item HELMET_ALUMINUM = new ArmorBase("helmet_aluminum", ARMOR_ALUMINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item HELMET_TIN = new ArmorBase("helmet_tin", ARMOR_TIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item HELMET_AZURIUM = new ArmorBase("helmet_azurium", ARMOR_AZURIUM, 1, EntityEquipmentSlot.HEAD);
		//Chest
	public static final Item CHESTPLATE_COPPER = new ArmorBase("chestplate_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item CHESTPLATE_ALUMINUM = new ArmorBase("chestplate_aluminum", ARMOR_ALUMINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item CHESTPLATE_TIN = new ArmorBase("chestplate_tin", ARMOR_TIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item CHESTPLATE_AZURIUM = new ArmorBase("chestplate_azurium", ARMOR_AZURIUM, 1, EntityEquipmentSlot.CHEST);
		//Legs
	public static final Item LEGGINGS_COPPER = new ArmorBase("leggings_copper", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEGGINGS_ALUMINUM = new ArmorBase("leggings_aluminum", ARMOR_ALUMINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEGGINGS_TIN = new ArmorBase("leggings_tin", ARMOR_TIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEGGINGS_AZURIUM = new ArmorBase("leggings_azurium", ARMOR_AZURIUM, 2, EntityEquipmentSlot.LEGS);
		//Feet
	public static final Item BOOTS_COPPER = new ArmorBase("boots_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);
	public static final Item BOOTS_ALUMINUM = new ArmorBase("boots_aluminum", ARMOR_ALUMINUM, 1, EntityEquipmentSlot.FEET);
	public static final Item BOOTS_TIN = new ArmorBase("boots_tin", ARMOR_TIN, 1, EntityEquipmentSlot.FEET);
	public static final Item BOOTS_AZURIUM = new ArmorBase("boots_azurium", ARMOR_AZURIUM, 1, EntityEquipmentSlot.FEET);
	
	//Tools
		//Axe
	public static final Item AXE_COPPPER = new ToolAxe("axe_copper", TOOL_COPPER);
	public static final Item AXE_ALUMINUM = new ToolAxe("axe_aluminum", TOOL_ALUMINUM);
	public static final Item AXE_TIN = new ToolAxe("axe_tin", TOOL_TIN);
	public static final Item AXE_AZURIUM = new ToolAxe("axe_azurium", TOOL_AZURIUM);
		//Pickaxe
	public static final Item PICKAXE_COPPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item PICKAXE_ALUMINUM = new ToolPickaxe("pickaxe_aluminum", TOOL_ALUMINUM);
	public static final Item PICKAXE_TIN = new ToolPickaxe("pickaxe_tin", TOOL_TIN);
	public static final Item PICKAXE_AZURIUM = new ToolPickaxe("pickaxe_azurium", TOOL_AZURIUM);
		//Shovel
	public static final Item SHOVEL_COPPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item SHOVEL_ALUMINUM = new ToolShovel("shovel_aluminum", TOOL_ALUMINUM);
	public static final Item SHOVEL_TIN = new ToolShovel("shovel_tin", TOOL_TIN);
	public static final Item SHOVEL_AZURIUM = new ToolShovel("shovel_azurium", TOOL_AZURIUM);
		//Hoe
	public static final Item HOE_COPPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item HOE_ALUMINUM = new ToolHoe("hoe_aluminum", TOOL_ALUMINUM);
	public static final Item HOE_TIN = new ToolHoe("hoe_tin", TOOL_TIN);
	public static final Item HOE_AZURIUM = new ToolHoe("hoe_azurium", TOOL_AZURIUM);
	
	//Weapons
		//Sword
	//public static final Item SWORD_TEST = new ToolSword("sword_test", TOOL_TEST);
	public static final Item SWORD_COPPPER = new ToolSword("sword_copper", TOOL_COPPER);
	public static final Item SWORD_ALUMINUM = new ToolSword("sword_aluminum", TOOL_ALUMINUM);
	public static final Item SWORD_TIN = new ToolSword("sword_tin", TOOL_TIN);
	public static final Item SWORD_AZURIUM = new ToolSword("sword_azurium", TOOL_AZURIUM);
	
}
