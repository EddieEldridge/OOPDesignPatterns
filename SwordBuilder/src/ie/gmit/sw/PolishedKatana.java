package ie.gmit.sw;

public class PolishedKatana extends Katana
{

	@Override
	public String name() 
	{
		return "Polished Katana";
	}

	@Override
	public int length() 
	{
		return 30;
	}

	@Override
	public boolean isSharpened() 
	{
		return true;
	}

}
