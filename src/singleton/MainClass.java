package singleton;

public class MainClass {
	public static void main(String args[]) {
		Eager eager = Eager.getInstance();
		Eager eager2 = Eager.getInstance();
		
		Lazy lazy = Lazy.getInstance();
		Lazy lazy2 = Lazy.getInstance();
		
		Thread sync = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Synchronized synchronized1 = Synchronized.getInstance();
			}
		});
		
		Thread sync2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Synchronized synchronized1 = Synchronized.getInstance();
			}
		});
		sync.start();
		sync2.start();
		
		Thread doubleLocking = new Thread(new Runnable() {
			
			@Override
			public void run() {
				DoubleCheckLocking doubleCheckLocking = DoubleCheckLocking.getInstance();
			}
		});
		
		Thread doubleLocking2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				DoubleCheckLocking doubleCheckLocking = DoubleCheckLocking.getInstance();
			}
		});
		
		doubleLocking.start();
		doubleLocking2.start();
		
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		enumSingleton.i=5;
		enumSingleton.show();
		EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
		enumSingleton2.i=6;
		enumSingleton.show();
	}
}
