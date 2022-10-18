package strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTeste {

	@Test
	void deveCalcularFreteParaDHL() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		
		Fretavel servicoFreteDHL = new ServicoFreteDHL();
		
		double valorEsperado = 70.0;
		double valorRetornado = calculadora.calcular(servicoFreteDHL, 15.0);
		
		assertEquals(valorEsperado, valorRetornado);
		
	}
	
	@Test
	void deveCalcularFreteParaJadLog() {
		CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
		
		Fretavel servicoFreteJadLog = new ServicoFreteJadLog();
		
		double valorEsperado = 0.0;
		double valorRetornado = calculadoraFrete.calcular(servicoFreteJadLog, 20.0);
		
		assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	void deveCalcularFreteParaSedex() {
		CalculadoraFrete calculadoraFrete2 = new CalculadoraFrete();
		
		Fretavel servicoFreteSedex = new ServicoFreteSedex();
		
		double valorEsperado = 100.0;
		double valorRetornado = calculadoraFrete2.calcular(servicoFreteSedex, 10.0);
		
		assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	void deveCalcularFreteParaFedEx() {
		CalculadoraFrete calculadoraFrete3 = new CalculadoraFrete();
		
		Fretavel servicoFreteFedEx = new ServicoFreteFedEx();
		
		double valorEsperado = 45.0;
		double valorRetornado = calculadoraFrete3.calcular(servicoFreteFedEx, 30.0);
		
		assertEquals(valorEsperado, valorRetornado);
	}

}
