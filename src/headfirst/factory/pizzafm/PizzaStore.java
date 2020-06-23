package headfirst.factory.pizzafm;

/**
 * 看见没有，这个工厂方法模式是一个抽象类，而创建对象是一个抽象函数，用来解决产品可能发生变化的问题
 * 这里我们可以思考一个问题，如果我们不做Pizza了，我们做牛排了，会怎么样？
 */
public abstract class PizzaStore {

	abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
