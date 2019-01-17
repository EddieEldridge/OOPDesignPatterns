package ie.gmit.sw;

public class Arrow implements AdvancedForge
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
