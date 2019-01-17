package ie.gmit.sw;

public class StartSwordDecorator 
{
	public static void main(String[] args) 
	{
		System.out.println("======== Katana ========");
		
		// Create regular and sharpened katana with decorator pattern
		Sword katana = new KatanaSword();
		Sword sharpKatana = new SharpSwordDecorator(new KatanaSword());
		
		katana.forge();
		System.out.println("Katana not sharpened");
		
		sharpKatana.forge();
		System.out.println("Katana is sharpened");

		
		System.out.println("======== Claymore ========");
		
		// Create regular and sharpened katana with decorator pattern
		Sword claymore = new ClaymoreSword();
		Sword sharpClaymore = new SharpSwordDecorator(new ClaymoreSword());
		claymore.forge();
		System.out.println("Claymore not sharpened");

		System.out.println("Claymore is sharpened");
		sharpClaymore.forge();
		
	}
}
