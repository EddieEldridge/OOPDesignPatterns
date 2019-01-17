package ie.gmit.sw;

public class NarrowClaymore extends Claymore
{

	@Override
	public String name() 
	{
		return "Narrow Claymore";
	}

	@Override
	public int length() 
	{
		return 100;
	}

	@Override
	public boolean isSharpened() 
	{
		return true;
	}

}
