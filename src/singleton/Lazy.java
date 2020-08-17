package singleton;

public class Lazy {
	public static Lazy obj;
	public int i;

	private Lazy() {
		System.out.println("Instance Created Lazy");
	}

	public static Lazy getInstance() {
		if (obj == null)
			obj = new Lazy();
		return obj;
	}
}
