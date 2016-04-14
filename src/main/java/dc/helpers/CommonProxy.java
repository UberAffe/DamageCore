package dc.helpers;

import dc.DCEvents;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {

	public void preInit(){
		
	}
	
	public void init(){
		
	}
	
	public void postInit(){
		MinecraftForge.EVENT_BUS.register(new DCEvents());
	}
}
