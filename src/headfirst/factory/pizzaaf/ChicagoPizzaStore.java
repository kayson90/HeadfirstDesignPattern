package headfirst.factory.pizzaaf;

/**
 * 这个地方略有意思，值得思考一下，这里实际上是一个抽象工厂
 * 而使用抽象工厂又是工厂方法
 * 这个例子是工厂方法加抽象工厂
 * 我们在谈抽象工厂和工厂方法的区别的时候，只需要搞清楚是方法还是工厂
 * 方法是只创建一个产品，工厂是创建多个产品
 * 这样引申出来的含义是工厂方法是继承而抽象工厂是组合，虽然抽象工厂在创建单个产品的时候也是用的工厂方法，那是不同层级的比较
 * 设计模式的好处在于，将逻辑分了层级，混为一谈
 */
public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
