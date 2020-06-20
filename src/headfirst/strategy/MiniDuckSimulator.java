package headfirst.strategy;

public class MiniDuckSimulator {
	/**
	 * 策略模式是第一个模式
	 * @param args
	 */
	public static void main(String[] args) {

		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();

		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();

		model.performFly();
		//传递了一个接口实现类，也可以传递匿名内部类，最后变成了一个lambda表达式，策略模式是lambda表达式的基础
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
