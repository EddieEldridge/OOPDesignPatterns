package ie.gmit.sw;

public class StartSwordProxy 
{
	public static void main(String[] args) 
	{
		Sword sword = new ProxySword("Katana");

		// Get the materials for the sword
		sword.forge();
		System.out.println("");
		
		sword.forge();
	}
	
	
}
