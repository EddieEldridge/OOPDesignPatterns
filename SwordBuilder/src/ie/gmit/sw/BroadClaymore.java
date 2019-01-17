package ie.gmit.sw;

public class BroadClaymore extends Claymore
{

	@Override
	public String name() 
	{
		return "Broad Claymore";
	}

	@Override
	public int length() 
	{
		return 50;
	}

	@Override
	public boolean isSharpened() 
	{
		return false;
	}
	
}
