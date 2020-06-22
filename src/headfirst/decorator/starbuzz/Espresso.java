package headfirst.decorator.starbuzz;

/**
 * 具体咖啡，具体组件
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return 1.99;
	}
}

