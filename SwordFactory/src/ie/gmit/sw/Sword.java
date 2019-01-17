package ie.gmit.sw;

public class Sword
{
	// Variables
	int length;
	String name;
	boolean isSharpened;
	
	/**
	 * @return the length
	 */
	public int getLength()
	{
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length)
	{
		this.length = length;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the isSharpened
	 */
	public boolean getIsSharpened()
	{
		return isSharpened;
	}
	/**
	 * @param b the isSharpened to set
	 */
	public void setIsSharpened(boolean isSharpened)
	{
		this.isSharpened = isSharpened;
	}
	
	// Functionality
	public void getSwordName()
	{
		System.out.println(getName() + " is the name of the type of sword!");
	}
	
	public void getSwordLength()
	{
		System.out.println(getName() + " is " + getLength() + "cm long!");
	}
	
	public void getSharpness()
	{
		System.out.println(getName() + ": Sharpened: " + getIsSharpened());
	}
}
