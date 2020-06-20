package headfirst.strategy;

public abstract class Duck {
	//由继承变成了组合，定义两个行为类
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	abstract void display();
	//操作行为
	public void performFly() {
		flyBehavior.fly();
	}
	//操作行为
	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
