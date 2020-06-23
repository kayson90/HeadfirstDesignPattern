package headfirst.factory.pizzaaf;

/**
 * 这是配料的工厂方法
 * 抽象工厂方法定义了许多抽象接口
 */
public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();

}
