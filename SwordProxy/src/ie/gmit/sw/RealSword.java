package ie.gmit.sw;

public class RealSword implements Sword 
{
	private String swordName;
	
	public RealSword(String swordName)
	{
		this.swordName = swordName;
		getMaterials(swordName);
	}
	
	@Override
	public void forge() 
	{
		System.out.println("Forging " + swordName);
	}
	
	private void getMaterials(String swordName) 
	{
		System.out.println("Getting materials for " + swordName);
	}

	
}
