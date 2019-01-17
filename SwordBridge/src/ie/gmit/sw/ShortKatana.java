package ie.gmit.sw;

public class ShortKatana implements ForgeAPI
{

	@Override
	public void forgeSword(int length, String name, String material) 
	{
	   System.out.println("Forging Short Katana\nLength: " + length + "\nName: " + name + "\nMaterial: " + material);
	}

}
