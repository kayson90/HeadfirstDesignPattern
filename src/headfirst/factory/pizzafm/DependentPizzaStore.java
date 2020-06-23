package headfirst.factory.pizzafm;

/**
 * 学习设计模式一定要搞清楚我们设计优化的点在哪？
 * 首先我们看这份代码，写的到底好不好？
 * 太过于依赖了，8个依赖了
 * 判断太多了，不是很好
 * 有没有写的好的地方？
 * 比较好的地方是，定义的类是超类，对于这个类的操作是接口方法
 * 优化的方式就是把创建的过程抽象化，即工厂方法模式
 */
public class DependentPizzaStore {

	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
