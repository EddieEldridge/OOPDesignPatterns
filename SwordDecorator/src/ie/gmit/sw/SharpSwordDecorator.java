package ie.gmit.sw;

public class SharpSwordDecorator extends SwordDecorator
{

	public SharpSwordDecorator(Sword decoratedSword)
	{
		super(decoratedSword);
	}
	
	@Override
	public void forge()
	{
		decoratedSword.forge();
		setSharpness(decoratedSword);
	}
	
	private void setSharpness(Sword decoratedSword)
	{
		System.out.println("Sharpness: Sharp");
	}

}
