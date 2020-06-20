package headfirst.strategy;

public class MallardDuck extends Duck
{

	public MallardDuck()
	{
		/**
		 * 具体的子类在构造器里设置具体的行为，这种方式不是太好，复用性不是很高
		 */
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display()
	{
		System.out.println("I'm a real Mallard duck");
	}
}
