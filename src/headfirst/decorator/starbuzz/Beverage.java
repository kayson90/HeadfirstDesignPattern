package headfirst.decorator.starbuzz;
/**
 * 装饰器中的组件
 */
public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
