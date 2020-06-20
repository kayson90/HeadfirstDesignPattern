package headfirst.strategy;

/**
 * 具体的行为之一
 */
public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
