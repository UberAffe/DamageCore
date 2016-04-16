package damc.caps.resistancetypes;

import damc.api.IResist;
import damc.caps.damagetypes.DefaultDamage;
import damc.caps.damagetypes.IDamage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;

public class ResistanceProvider implements ICapabilityProvider, INBTSerializable<NBTTagCompound>{

	@CapabilityInject(IResist.class)
	public static Capability<IResist> RESISTANCETYPE = null;
	
	private IResist resistance;
	
	public ResistanceProvider(){
		resistance = new DefaultResistance();
	}
	
	public ResistanceProvider(IResist resistance){
		this.resistance = resistance;
	}
	
	@Override
	public NBTTagCompound serializeNBT() {
		return resistance.writeNBT(null);
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		resistance.readNBT(null, nbt);
	}

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return RESISTANCETYPE != null && capability == RESISTANCETYPE;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return (RESISTANCETYPE != null && capability == RESISTANCETYPE)? (T)resistance: null;
	}
	
	public static IResist get(EntityPlayer player){
		return player.hasCapability(RESISTANCETYPE, null)? player.getCapability(RESISTANCETYPE, null): null;
	}

}
