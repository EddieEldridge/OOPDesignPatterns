package ie.gmit.sw;

public class RustyKatana extends Katana
{

	@Override
	public String name() {
		return "Rusty Katana";
	}

	@Override
	public int length() {
		return 20;
	}

	@Override
	public boolean isSharpened() {
		return false;
	}

}
