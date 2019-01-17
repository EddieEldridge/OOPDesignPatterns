package ie.gmit.sw;

import java.util.Scanner;

public class StartFactory
{
	public static void main(String[] args)
	{
		// Create instance of our factory
		SwordFactory swordFactory = new SwordFactory();
		
		// Create an instance of sword to assign from our factory
		Sword swordFromFactory = null;
		
		Scanner userInput = new Scanner(System.in);
		
		String swordChoice="";
		
		System.out.println("What type of sword would you like to produce? R/K/C");
		
		if(userInput.hasNextLine())
		{
			String swordType = userInput.nextLine();
			
			swordFromFactory = swordFactory.makeNewSword(swordType);
		}
		
		if(swordFromFactory!=null)
		{
			showNewSword(swordFromFactory);
		}
		else
		{
			System.out.println("Error");
		}
	}
	
	public static void showNewSword(Sword swordFromFactory)
	{
		swordFromFactory.getSwordName();
		swordFromFactory.getSwordLength();
		swordFromFactory.getSharpness();
	}
	
}
