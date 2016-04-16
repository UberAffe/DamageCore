package damc;

import damc.api.ADamage;
import damc.caps.damagetypes.DSCut;
import damc.caps.damagetypes.DamageProvider;
import damc.caps.damagetypes.IDamage;
import damc.helpers.Refs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DamCEvents {

	
	@SubscribeEvent
	public void livingAttack(LivingAttackEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void livingHurt(LivingHurtEvent event)
	{
		if(!(event.getSource() instanceof IDamage))
		{
			Entity cause = event.getEntity();
			IDamage damage = null;
			if(cause instanceof EntityPlayer)
			{
				ItemStack held = ((EntityPlayer)cause).getHeldItemMainhand();
				damage = ((held != null && held.hasCapability(DamageProvider.DAMAGETYPE, null))? held.getCapability(DamageProvider.DAMAGETYPE, null): null);
			}
			else
				damage = (cause.hasCapability(DamageProvider.DAMAGETYPE, null))? cause.getCapability(DamageProvider.DAMAGETYPE, null): null;
			if(damage != null)
			{
				event.setCanceled(true);
				MinecraftForge.EVENT_BUS.post(new LivingHurtEvent(event.getEntityLiving(), damage.newInstance(cause), 0));
			}
		}
		else
			((ADamage)event.getSource()).livingHurtEvent(event);
	}
	
	@SubscribeEvent
	public void attachCapabilities(AttachCapabilitiesEvent.Item event)
	{
		if(event.getItem() instanceof ItemSword && !event.getItemStack().hasCapability(DamageProvider.DAMAGETYPE, null))
			event.addCapability(Refs.DAMAGECAP, new DamageProvider(new DSCut()));
	}
}
