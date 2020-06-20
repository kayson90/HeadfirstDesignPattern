package headfirst.strategy;

/**
 * 具体行为
 */
public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
