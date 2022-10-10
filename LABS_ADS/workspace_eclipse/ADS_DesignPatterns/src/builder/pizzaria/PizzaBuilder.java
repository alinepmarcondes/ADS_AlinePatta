package builder.pizzaria;

public class PizzaBuilder {
	
	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}

	public PizzaBuilder setSize(Integer size) {
		pizza.setSize(size);
		return this;
	}
	
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
	}
	
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
	}
	
	public Pizza getPizza() {
		return pizza;
	}
	
}

