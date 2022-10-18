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
	
	private void validarTamanho() {
		Integer size = pizza.getSize();
		if(size!=1 && size!=2 && size!=3) {
			throw new IllegalStateException("Tamanho de pizza inválido: " + size);
		}
	}
	
	private void validarIngredientes() {
		if(pizza.getFlagCheese()) {
			return;
		}
		if(pizza.getFlagPepperoni()) {
			return;
		}
		throw new IllegalStateException("Nenhum ingrediente adicionado");
	}
	
}

