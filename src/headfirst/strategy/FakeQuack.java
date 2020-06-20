package headfirst.strategy;

/**
 * 具体的行为之一
 */
public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
