package guardia.coremod.utils.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler 
{
	public static enum EnumTypeOverworld implements IStringSerializable
	{
		//test(0, "test"),
		copper(0, "copper"),
		bauxite(1, "bauxite"),
		cassiterite(2, "cassiterite");
		
		
		
		private static final EnumTypeOverworld[] META_LOOKUP = new EnumTypeOverworld[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumTypeOverworld(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private EnumTypeOverworld(int meta, String name, String unlocalizedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocalizedName() 
		{
			return this.unlocalizedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumTypeOverworld byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumTypeOverworld enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
	
	public static enum EnumTypeNether implements IStringSerializable
	{
		//test(0, "test"),
		azurium(0, "azurium"),
		blackrock(1, "blackrock");
		
		
		
		private static final EnumTypeNether[] META_LOOKUP = new EnumTypeNether[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumTypeNether(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private EnumTypeNether(int meta, String name, String unlocalizedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocalizedName() 
		{
			return this.unlocalizedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumTypeNether byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumTypeNether enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
	
	public static enum EnumTypeEnd implements IStringSerializable
	{
		aether(0, "aether");
		
		
		
		
		private static final EnumTypeEnd[] META_LOOKUP = new EnumTypeEnd[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumTypeEnd(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private EnumTypeEnd(int meta, String name, String unlocalizedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocalizedName() 
		{
			return this.unlocalizedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumTypeEnd byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumTypeEnd enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
	
	public static enum EnumTypeArmor implements IStringSerializable
	{
		copper(0, "copper"),
		aluminum(1,"aluminum"),
		tin(2,"tin"),
		azurium(3,"azurium"),
		//azurium(4,"azurium"),
		//azurium(5,"azurium"),
		//azurium(6,"azurium"),
		//azurium(7,"azurium"),
		//azurium(8,"azurium"),
		//azurium(9,"azurium"),
		//azurium(10,"azurium"),
		//azurium(11,"azurium"),
		//azurium(12,"azurium"),
		//azurium(13,"azurium"),
		//azurium(14,"azurium"),
		//azurium(15,"azurium"),
		;
		
		
		
		
		private static final EnumTypeArmor[] META_LOOKUP = new EnumTypeArmor[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumTypeArmor(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private EnumTypeArmor(int meta, String name, String unlocalizedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocalizedName() 
		{
			return this.unlocalizedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumTypeArmor byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumTypeArmor enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
}
