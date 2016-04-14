package damc.damagetypes;

import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class DSPound extends DamageSource implements IDamage{

	public static final DSPound pound = new DSPound();
	
	public DSPound() {
		super("pound");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void livingHurtEvent(LivingHurtEvent event) {
		// TODO Auto-generated method stub
		
	}

}
