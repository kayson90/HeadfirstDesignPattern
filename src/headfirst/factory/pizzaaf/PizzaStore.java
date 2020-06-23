package headfirst.factory.pizzaaf;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
		//这一步并没有真正创建
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
