package headfirst.decorator.starbuzz;

public class StarbuzzCoffee {
	/**
	 * 这里比较难理解的是，为啥需要装饰器？具体组件不能满足要求么？
	 * 具体组件有类爆炸的风险，新增加一个子类对其他子类没有什么帮助。
	 * 装饰器原理是对基础组件用装饰器根据需要进行装饰。
	 * 虽然装饰者和被装饰者的父类型都相同，但是要明白一个道理，被装饰者也就是具体组件是不含有具体组件这个实例变量的
	 * 不然也变成了装饰者。
	 * @param args
	 */
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()
				+ " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()
				+ " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()
				+ " $" + beverage3.cost());
	}
}
