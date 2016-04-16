package damc.caps.resistancetypes;

import damc.api.IResist;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class ResistanceStorage implements IStorage<IResist>{

	public static final ResistanceStorage instance = new ResistanceStorage();
	
	@Override
	public NBTBase writeNBT(Capability<IResist> capability, IResist instance, EnumFacing side) {
		return instance.writeNBT(side);
	}

	@Override
	public void readNBT(Capability<IResist> capability, IResist instance, EnumFacing side, NBTBase nbt) {
		instance.readNBT(side, (NBTTagCompound)nbt);
	}
	
}
