package ie.gmit.sw;

public abstract class Sword 
{
	protected ForgeAPI forgeAPI;
	
	protected Sword(ForgeAPI forgeAPI)
	{
		this.forgeAPI = forgeAPI;
	}
	
	public abstract void forge();
}
