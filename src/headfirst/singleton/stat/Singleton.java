package headfirst.singleton.stat;

public class Singleton {
	private static Singleton uniqueInstance = new Singleton();

	/**
	 * 不管什么方式，都要关闭外部new
	 */
	private Singleton() {}

	public static Singleton getInstance() {
		return uniqueInstance;
	}
}
