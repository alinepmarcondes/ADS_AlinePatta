package strategy;

public class ServicoFreteJadLog implements Fretavel {
	
	@Override
	public double calcularValor(double pesoEmKg) {
		if(pesoEmKg < 30.00) {
			return 0.00;
		}else return 150.0;
	}

}
