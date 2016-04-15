package damc.caps.damagetypes;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;

public class DamageProvider implements ICapabilityProvider, INBTSerializable<NBTTagCompound>{

	@CapabilityInject(IDamage.class)
	public static Capability<IDamage> DAMAGETYPE = null;
	
	private IDamage damage;
	
	public DamageProvider(){
		damage = new DefaultDamage();
	}
	
	public DamageProvider(IDamage damage){
		this.damage = damage;
	}
	
	@Override
	public NBTTagCompound serializeNBT() {
		return damage.writeNBT(null);
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		damage.readNBT(null, nbt);
	}

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return DAMAGETYPE != null && capability == DAMAGETYPE;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return (DAMAGETYPE != null && capability == DAMAGETYPE)? (T)damage: null;
	}
	
	public static IDamage get(EntityPlayer player){
		return player.hasCapability(DAMAGETYPE, null)? player.getCapability(DAMAGETYPE, null): null;
	}

}
