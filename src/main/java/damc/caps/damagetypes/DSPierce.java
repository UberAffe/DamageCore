package damc.caps.damagetypes;

import damc.api.ADamage;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class DSPierce extends ADamage{

	public static final DSPierce pierce = new DSPierce();
	
	public DSPierce() {
		super("peirce");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void livingHurtEvent(LivingHurtEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DamageSource newInstance(Entity cause) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NBTTagCompound writeNBT(EnumFacing side) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readNBT(EnumFacing side, NBTTagCompound nbt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void livingAttackEvent(LivingAttackEvent event) {
		// TODO Auto-generated method stub
		
	}

}
