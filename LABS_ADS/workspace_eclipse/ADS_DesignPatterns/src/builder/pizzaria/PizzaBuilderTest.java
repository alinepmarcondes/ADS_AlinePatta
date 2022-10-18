package builder.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaBuilderTest {

	@Test
	void deveConstruirPizzaValida() {
		
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();
		
		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
			
	}

	@Test
	void deveInvalidarPizzaComTamanhoErrado() {
		try {
			Pizza pizza = new PizzaBuilder()
					.setSize(9)
					.addCheese()
					.addPepperoni()
					.getPizza();
			
			fail("Devia ter lançado exception");
		}catch (IllegalStateException e) {
			//exception esperada
			e.printStackTrace();
		}
	}
	
	@Test
	void deveInvalidarPizzaSemIngrediente() {
		try {
			Pizza pizza = new PizzaBuilder()
					.setSize(1)
					.getPizza();
			
			fail("Devia ter lançado exception");
		}catch (IllegalStateException e) {
			//exception esperada
			e.printStackTrace();
		}
	}
}
