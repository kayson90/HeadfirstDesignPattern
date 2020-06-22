package headfirst.decorator.starbuzz;

public class Milk extends CondimentDecorator {
	//这个是和具体组件的区别，具体装饰着包含一个组件
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
