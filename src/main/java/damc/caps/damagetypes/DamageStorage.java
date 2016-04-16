package damc.caps.damagetypes;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class DamageStorage implements IStorage<IDamage>{

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
