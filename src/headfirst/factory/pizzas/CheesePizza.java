package headfirst.factory.pizzas;

/**
 * 这样的一个产品，它的组成配料是固定的
 * 如果我想要组成是可变的呢？怎么去解决这个问题
 * 那就是抽象出来一个方法，用来生成配料，这个生成配料的过程是一个配料生成接口
 * 如果有一天，同样的一款披萨，我想要改变它的组成，那么就新写一个具体的工厂方法实现抽象工厂方法
 */
public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
