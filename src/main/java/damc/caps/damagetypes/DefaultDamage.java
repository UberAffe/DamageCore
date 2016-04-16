package damc.caps.damagetypes;

import damc.api.ADamage;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class DefaultDamage extends ADamage{

	public DefaultDamage() {super("default");}
	
	public DefaultDamage(Entity source){super("default", source);}
	
	public DefaultDamage(Entity source, Entity indirectSource){super("default", source, indirectSource);}
	
	public DefaultDamage(String type){
		super(type);
	}

	@Override
	public void livingHurtEvent(LivingHurtEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DamageSource newInstance(Entity cause) {
		return new DefaultDamage(cause);
	}

	@Override
	public NBTTagCompound writeNBT(EnumFacing side) {
		return new NBTTagCompound();
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
