package ie.gmit.sw;

public class SwordFactory
{
	public Sword makeNewSword(String swordType)
	{
		Sword newSword = null;
		
		if(swordType.equals("C"))
		{
			return new ClaymoreSword();
		}
		if(swordType.equals("K"))
		{
			return new KatanaSword();
		}
		if(swordType.equals("R"))
		{
			return new RapierSword();
		}
		else
		{
			return null;
		}
	}
}
