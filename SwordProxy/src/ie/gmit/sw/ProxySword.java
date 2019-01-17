package ie.gmit.sw;

public class ProxySword implements Sword
{
	// Variables
	private RealSword realSword;
	private String swordName;
	
	public ProxySword(String swordName)
	{
		this.swordName = swordName;
	}
	
	@Override
	public void forge()
	{
		if(realSword == null)
		{
			realSword = new RealSword(swordName);
		}
		
		realSword.forge();
	}
	
}
