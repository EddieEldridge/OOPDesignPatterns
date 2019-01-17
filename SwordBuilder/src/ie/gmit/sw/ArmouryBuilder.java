package ie.gmit.sw;

public class ArmouryBuilder 
{
	public Armoury forgeClaymores()
	{
		Armoury claymoreArmoury = new Armoury();
		claymoreArmoury.addSword(new BroadClaymore());
		claymoreArmoury.addSword(new NarrowClaymore());
		return claymoreArmoury;
	}
	public Armoury forgeKatanas()
	{
		Armoury katanaArmoury = new Armoury();
		katanaArmoury.addSword(new RustyKatana());
		katanaArmoury.addSword(new PolishedKatana());
		return katanaArmoury;
	}
}
