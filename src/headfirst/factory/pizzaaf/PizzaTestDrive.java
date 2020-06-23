package headfirst.factory.pizzaaf;

/**
 * 抽象工厂给我们的启发是用接口是解决多个产品组合的问题
 * 其实这些设计模式看明白以后会觉得很无聊，有些名字也很无聊。甚至会觉得GOF把这些代码的写法提成23种设计模式是否高估了。
 * 把创建的代码封装一下就变成了简单工厂
 * 把这个封装变得抽象了就成了工厂方法
 * 如果是多个产品，把每个创建都抽象一下，就变成了抽象工厂了…
 * 想想这些真的挺无聊的，大多是一些唬人的名字
 */
public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
