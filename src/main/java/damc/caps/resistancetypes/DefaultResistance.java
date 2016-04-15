package damc.caps.resistancetypes;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class DefaultResistance implements IResist{

	@Override
	public void livingHurtEvent(LivingHurtEvent event) {
		// TODO Auto-generated method stub
		
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

	public static class ResistanceStorage implements IStorage<IResist>{

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
}
