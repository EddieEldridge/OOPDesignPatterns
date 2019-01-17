package ie.gmit.sw;

public abstract class Katana implements Sword
{
	@Override
	public Material material()
	{
		return new Steel();
	}
	
	@Override
	public abstract int length();
	public abstract boolean isSharpened();
	
}
