package dc.damagetypes;

import net.minecraft.util.DamageSource;

public class DSCut extends DamageSource implements IDamage{

	public static final DSCut cut = new DSCut();
	
	public DSCut() {
		super("cut");
		// TODO Auto-generated constructor stub
	}

}
