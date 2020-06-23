package headfirst.factory.pizzas;

/**
 * 简单工厂，这种方式大家都能想到，将实例化对象的过程提取出来，可以进行复用，减少重复代码
 * 但是总觉得还是有点low，因为我们写代码是避免这么多if-else的，更重要的是，如果新增加类型，还是要修改这份代码？这就不符合开闭原则了
 *
 * 实际上要新加类型可以不修改代码，把这个createPizza方法抽象出来就可以了！下面的解决思路是工厂方法了
 * 工厂方法要解决的问题是：如果实例化对象这个过程也变成了变化的，该怎么处理？
 * 工厂方法相比简单工厂，区别是工厂方法的创建对象是一个抽象的，是一个接口或者抽象类，而简单工厂是一个具体的类。
 * 减少if-else我们可以通过lambda表达式来减少判断
 * 学习设计模式要搞清楚要解决的什么问题？
 * 最好是在源码中找到相关的案例
 */
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
