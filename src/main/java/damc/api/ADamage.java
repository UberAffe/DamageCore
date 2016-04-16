package damc.api;

import damc.caps.damagetypes.IDamage;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

public abstract class ADamage extends DamageSource implements IDamage{

	Entity source;
	Entity indirectSource;
	
	public ADamage(String damageTypeIn) {this(damageTypeIn, null);}
	
	public ADamage(String damageType, Entity source){this(damageType, null, source);}
	
	public ADamage(String damageType, Entity source, Entity indirectSource){
		super(damageType);
		this.source = source;
		this.indirectSource = indirectSource;
	}
}
