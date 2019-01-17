package ie.gmit.sw;

public class StartSwordBridge
{
	public static void main(String[] args)
	{
		Sword shortKatana = new Katana(25, "Short Katana", "Steel", new ShortKatana());
		Sword longKatana = new Katana(50, "Long Katana", "Iron", new LongKatana());
		
		shortKatana.forge();
		longKatana.forge();
	}
}
