package ie.gmit.sw;

public class StartForgeAdapter
{
	public static void main(String[] args) 
	{
		WeaponCreator weaponCreator = new WeaponCreator();
		
		weaponCreator.forgeWeapon("Katana", "Steel");
		weaponCreator.forgeWeapon("Claymore", "Steel");
		weaponCreator.forgeWeapon("Arrows", "Wood");
		weaponCreator.forgeWeapon("Shield", "Iron");	
	}
}
