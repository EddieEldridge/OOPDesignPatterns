package ie.gmit.sw;

public class Shield implements AdvancedForge
{
	@Override
	public void forgeArrows(String material)
	{
		System.out.println("Forging arrow with: " + material);
	}

	@Override
	public void forgeShields(String material) 
	{
		System.out.println("Forging shield with: " + material);
	}
}
