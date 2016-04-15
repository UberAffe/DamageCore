package damc.caps.damagetypes;

import damc.api.ADamage;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class DefaultDamage extends ADamage{

	public DefaultDamage() {
		super("default");
		// TODO Auto-generated constructor stub
	}
	
	public DefaultDamage(String type){
		super(type);
	}

	@Override
	public void livingHurtEvent(LivingHurtEvent event) {
		// TODO Auto-generated method stub
		
	}

	public static class DamageStorage implements IStorage<IDamage>{

		public static final DamageStorage instance = new DamageStorage();
		
		@Override
		public NBTBase writeNBT(Capability<IDamage> capability, IDamage instance, EnumFacing side) {
			return instance.writeNBT(side);
		}

		@Override
		public void readNBT(Capability<IDamage> capability, IDamage instance, EnumFacing side, NBTBase nbt) {
			instance.readNBT(side, (NBTTagCompound)nbt);
		}
		
	}

	@Override
	public DamageSource newInstance(Entity cause) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NBTTagCompound writeNBT(EnumFacing side) {
		return new NBTTagCompound();
	}

	@Override
	public void readNBT(EnumFacing side, NBTTagCompound nbt) {
		// TODO Auto-generated method stub
		
	}
}
