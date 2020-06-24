package headfirst.singleton.subclass;

public class CoolerSingleton extends Singleton {
	// useful instance variables here
	/**
	 * 这个静态变量是不会被使用到的
	 */
	protected static Singleton uniqueInstance;

	private CoolerSingleton() {
		super();
	}

	// useful methods here
}
