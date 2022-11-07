package templatemethod.relatorio.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeradorDeRelatorioVendasAnuaisTest {

	@Test
	void deveGerarRelatorioVendasAnuais() {
		GeradorDeRelatorioVendasAnuais gerador = new GeradorDeRelatorioVendasAnuais();		
		String pagina = gerador.criarPagina(2022);	
		System.out.println( pagina );
	}

}
