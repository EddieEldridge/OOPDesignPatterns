package ie.gmit.sw;

public abstract class SwordDecorator implements Sword
{
	protected Sword decoratedSword;
	
	public SwordDecorator(Sword decoratedSword)
	{
		this.decoratedSword = decoratedSword;
	}
	
	public void forge()
	{
		decoratedSword.forge();
	}
}
