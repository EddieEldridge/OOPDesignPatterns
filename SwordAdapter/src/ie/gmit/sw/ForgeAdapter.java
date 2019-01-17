package ie.gmit.sw;

public class ForgeAdapter implements Forge
{
	AdvancedForge advancedForge;

	public ForgeAdapter(String material)
	{
		if(material.equalsIgnoreCase("Wood"))
		{
			advancedForge = new Arrow();
		}
		if(material.equalsIgnoreCase("Iron"))
		{
			advancedForge = new Shield();
		}
	}
	
	@Override
	public void forgeWeapon(String weaponType, String material)
	{
		if(material.equalsIgnoreCase("Wood"))
		{
			advancedForge.forgeArrows(material); 
		}
		if(material.equalsIgnoreCase("Iron"))
		{
			advancedForge.forgeShields(material); 
		}
	}
	

}
