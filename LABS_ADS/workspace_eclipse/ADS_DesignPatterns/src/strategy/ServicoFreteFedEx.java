package strategy;

public class ServicoFreteFedEx implements Fretavel{

	@Override
	public double calcularValor(double pesoEmKg) {
		if(pesoEmKg < 20.0) {
			return 0.00;
		}else if(pesoEmKg > 20.1 && pesoEmKg < 39.9){
			return 45.0;
		}else return 75.0;
		
	}

}
