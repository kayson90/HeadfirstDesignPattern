package headfirst.decorator.starbuzz;

/**
 * 抽象装饰器，保证装饰着和被装饰者是相同类型
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
