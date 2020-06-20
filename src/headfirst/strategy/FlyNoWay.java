package headfirst.strategy;

/**
 * 具体行为
 */
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
