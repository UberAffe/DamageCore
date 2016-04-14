package damc;

import damc.helpers.CommonProxy;
import damc.helpers.Refs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Refs.MODID, version=Refs.VERSION)
public class DamageCore {
	
	@Instance(Refs.MODID)
	public static DamageCore instance;

	@SidedProxy(clientSide = Refs.CLIENTPROXY, serverSide = Refs.SERVERPROXY)
    public static CommonProxy proxy;
	
	@EventHandler
    public void preInit (FMLPreInitializationEvent event){
		proxy.preInit();
	}
	
	@EventHandler
    public void init (FMLInitializationEvent event){
		proxy.init();
	}
	
	@EventHandler
    public void postInit (FMLPostInitializationEvent event){
        proxy.postInit();
	}
}