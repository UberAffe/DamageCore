package damc.damagetypes;

import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class DSPierce extends DamageSource implements IDamage{

	public static final DSPierce pierce = new DSPierce();
	
	public DSPierce() {
		super("peirce");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void livingHurtEvent(LivingHurtEvent event) {
		// TODO Auto-generated method stub
		
	}

}
