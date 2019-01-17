package ie.gmit.sw;

public abstract class Claymore implements Sword
{
	@Override
	public Material material()
	{
		return new Iron();
	}
	
	@Override
	public abstract int length();
	public abstract boolean isSharpened();
}
