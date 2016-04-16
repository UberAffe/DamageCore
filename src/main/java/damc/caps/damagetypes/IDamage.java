package damc.caps.damagetypes;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public interface IDamage {

	public void livingHurtEvent(LivingHurtEvent event);
	
	public void livingAttackEvent(LivingAttackEvent event);

	public DamageSource newInstance(Entity cause);
	
	public NBTTagCompound writeNBT(EnumFacing side);
	
	public void readNBT(EnumFacing side, NBTTagCompound nbt);
}
