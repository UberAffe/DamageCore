package damc.api;

import damc.caps.damagetypes.IDamage;
import net.minecraft.util.DamageSource;

public abstract class ADamage extends DamageSource implements IDamage{

	public ADamage(String damageTypeIn) {
		super(damageTypeIn);
		// TODO Auto-generated constructor stub
	}
}
