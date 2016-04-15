package damc.caps.resistancetypes;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public interface IResist {

	public void livingHurtEvent(LivingHurtEvent event);

	public NBTTagCompound writeNBT(EnumFacing side);
	
	public void readNBT(EnumFacing side, NBTTagCompound nbt);
}
