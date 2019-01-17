package ie.gmit.sw;

public class LongKatana implements ForgeAPI
{

	@Override
	public void forgeSword(int length, String name, String material) 
	{
	   System.out.println("\nForging Long Katana\nLength: " + length + "\nName: " + name + "\nMaterial: " + material);
	}

}
