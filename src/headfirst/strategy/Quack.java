package headfirst.strategy;

/**
 * 具体的行为之一
 */
public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
