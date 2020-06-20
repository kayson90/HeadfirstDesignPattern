package headfirst.strategy;

/**
 * 具体的变动的行为
 */
public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
