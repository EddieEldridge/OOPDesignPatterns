package ie.gmit.sw;

public class SwordController 
{
	private Sword swordModel;
	private SwordView swordView;
	
	public SwordController(Sword swordModel, SwordView swordView)
	{
		this.swordModel = swordModel;
		this.swordView = swordView;
	}
	
	
	public void setLength(int length)
	{
		swordModel.setLength(length);
	}
	public int getLength()
	{
		return swordModel.getLength();
	}
	

	public void setName(String name)
	{
		swordModel.setName(name);
	}
	public String getName()
	{
		return swordModel.getName();
	}

	
	
	public void setIsSharpened(Boolean isSharpened)
	{
		swordModel.setIsSharpened(isSharpened);
	}
	public Boolean getIsSharpened()
	{
		return swordModel.getIsSharpened();
	}

	// Functionality
	public void updateView()
	{
		swordView.printSwordDetails(swordModel.getLength(), swordModel.getName(), swordModel.getIsSharpened());
	}
	
}
