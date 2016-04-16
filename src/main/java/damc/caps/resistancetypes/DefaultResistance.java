package damc.caps.resistancetypes;

import damc.api.IResist;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
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

	
}
