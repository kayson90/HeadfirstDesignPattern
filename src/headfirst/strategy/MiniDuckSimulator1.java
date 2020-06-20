package headfirst.strategy;

public class MiniDuckSimulator1 {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		//可以改变行为
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
