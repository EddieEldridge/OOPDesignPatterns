package ie.gmit.sw;

public class StartSwordMVC
{
	public static void main(String[] args)
	{
		Sword swordModel = createSword();
		
		SwordView swordView = new SwordView();
		
		SwordController swordController = new SwordController(swordModel, swordView);
		
		swordController.updateView();
		
		swordController.setName("Katana");
		swordController.setLength(20);
		swordController.setIsSharpened(true);
		
		System.out.println();
		System.out.println("Upating view.....");
		System.out.println();

		swordController.updateView();
		
	}
	
	private static Sword createSword()
	{
		Sword createdSword = new Sword();
		createdSword.setName("Claymore");
		createdSword.setLength(50);
		createdSword.setIsSharpened(false);
		return createdSword;
	}
}
