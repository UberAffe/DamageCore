package damc.helpers;

import damc.DamCEvents;
import damc.api.IResist;
import damc.caps.damagetypes.DefaultDamage;
import damc.caps.damagetypes.DamageStorage;
import damc.caps.damagetypes.IDamage;
import damc.caps.resistancetypes.DefaultResistance;
import damc.caps.resistancetypes.ResistanceStorage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class CommonProxy {

	public void preInit(){
		CapabilityManager.INSTANCE.register(IDamage.class, DamageStorage.instance, DefaultDamage.class);
		CapabilityManager.INSTANCE.register(IResist.class, ResistanceStorage.instance, DefaultResistance.class);
	}
	
	public void init(){
		
	}
	
	public void postInit(){
		MinecraftForge.EVENT_BUS.register(new DamCEvents());
	}
}
