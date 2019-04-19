package headfirst.designpatterns.factory.pizzas;

public class SimplePizzaFactory {

	private static SimplePizzaFactory factory;

	public static SimplePizzaFactory getInstance(){
		if(factory == null) factory = new SimplePizzaFactory();

		return factory;
	}

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
		} else if (type.equals("hawaiian"))
			pizza = new HawaiianPizza();

		return pizza;
	}
}
