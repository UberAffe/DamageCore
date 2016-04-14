package damc;

import damc.damagetypes.IDamage;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DamCEvents {

	
	@SubscribeEvent
	public void livingHurt(LivingHurtEvent event)
	{
		if(event.getSource() instanceof IDamage)
		{
			IDamage damageType = (IDamage) event.getSource();
			damageType.livingHurtEvent(event);
		}
	}
}
