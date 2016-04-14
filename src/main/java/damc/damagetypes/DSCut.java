package damc.damagetypes;

import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class DSCut extends DamageSource implements IDamage{

	public static final DSCut cut = new DSCut();
	
	public DSCut() {
		super("cut");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void livingHurtEvent(LivingHurtEvent event) {
		// TODO Auto-generated method stub
		
	}

}
