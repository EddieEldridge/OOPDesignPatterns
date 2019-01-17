package ie.gmit.sw;

public class WeaponCreator implements Forge {
	ForgeAdapter forgeAdapter;

	@Override
	public void forgeWeapon(String weaponType, String material) 
	{
		if (material.equalsIgnoreCase("Steel")) 
		{
			System.out.println("Forging: " + weaponType);
		}
		

		else if (material.equalsIgnoreCase("Iron") || material.equalsIgnoreCase("Wood"))
		{
			forgeAdapter = new ForgeAdapter(weaponType);
			forgeAdapter.forgeWeapon(weaponType, material);
			System.out.println("Forging: " + weaponType+ "with " + material);

		}
		else
		{
	         System.out.println("Invalid material: " + material + "\n Cannot create this type of weapon without advanced forge.");
	    }
		
		 
	}
}
