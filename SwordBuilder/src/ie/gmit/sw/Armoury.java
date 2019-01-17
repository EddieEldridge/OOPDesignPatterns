package ie.gmit.sw;

import java.util.ArrayList;
import java.util.List;

public class Armoury 
{
	private List<Sword> swords = new ArrayList<Sword>();
	
	public void addSword(Sword sword)
	{
		swords.add(sword);
	}
	
	public int getLength()
	{
		int totalSwordLength = 0;
		
		for(Sword sword : swords)
		{
			totalSwordLength += sword.length();
		}
		return totalSwordLength;
	}
	
	public int getSwords()
	{
		int swordsInArmoury = 0;
		
		for(Sword sword : swords)
		{
			swordsInArmoury++;
		}
		return swordsInArmoury;
	}
	
	public void showSwords()
	{
		for (Sword sword: swords)
		{
			 System.out.print("\nSword Name: " + sword.name());
	         System.out.print("\nSword Material: " + sword.material().material());
	         System.out.print("\nSword Length: " + sword.length());
	         System.out.println("\nSword Sharpned: " + sword.isSharpened());
		}
	}

}
