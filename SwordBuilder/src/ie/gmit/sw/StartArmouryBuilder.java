package ie.gmit.sw;

public class StartArmouryBuilder
{
	public static void main(String[] args) 
	{
		ArmouryBuilder armouryBuilder = new ArmouryBuilder();
		
		Armoury claymoreArmoury = armouryBuilder.forgeClaymores();
		System.out.println("Claymore Armoury: ");
		claymoreArmoury.showSwords();
		
		Armoury katanaArmoury = armouryBuilder.forgeKatanas();
		System.out.println("\nKatana Armoury: ");
		katanaArmoury.showSwords();
	}
}
