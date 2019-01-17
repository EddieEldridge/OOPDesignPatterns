package ie.gmit.sw;

public class Katana extends Sword
{
	private int length;
	private String name;
	private String material;
	
	public Katana(int length, String name, String material, ForgeAPI forgeAPI)
	{
		super(forgeAPI);
		this.length = length;
		this.name = name;
		this.material = material;
	}
	
	public void forge()
	{
		forgeAPI.forgeSword(length, name, material);
	}
}
