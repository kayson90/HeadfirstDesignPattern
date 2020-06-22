package headfirst.decorator.starbuzz;

/**
 * 具体组件
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	public double cost() {
		return .89;
	}
}

