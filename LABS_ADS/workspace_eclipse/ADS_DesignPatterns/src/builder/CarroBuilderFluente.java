package builder;

public class CarroBuilderFluente {	
	private Carro carro;
	
	public CarroBuilderFluente() {
		this.carro = new Carro();
	}
	
	public CarroBuilderFluente buildPorta(Porta[] portas) {
		carro.setPortas(portas);
		return this;
	}
}

