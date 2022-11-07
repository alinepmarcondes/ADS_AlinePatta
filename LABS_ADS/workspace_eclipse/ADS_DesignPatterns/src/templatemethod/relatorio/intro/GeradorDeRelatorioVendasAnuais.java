package templatemethod.relatorio.intro;

import java.util.List;

public class GeradorDeRelatorioVendasAnuais {
	
	public String getCabecalho() {
		String cabecalho = "Empresa My" + '\n'
						 + "-------------";
		return cabecalho;
	}
	
	public List<String> getConteudo(Integer ano){
		List<String> vendasAnual = ServicoDeRelatorio.getInstance().getVendasAnual(ano);
		return vendasAnual;
	}
	
	public String getRodape() {
		String rodape = "------------------------------------------------------" + '\n'
					  + "* Propriedade particular - Uso confidencial";
		return rodape;		
	}
	
	public String criarPagina(Integer ano) {
		String cabecalho = getCabecalho();
		List<String> conteudo = getConteudo(ano);
		String rodape = getRodape();
		
		StringBuffer bufferPagina = new StringBuffer();
		bufferPagina.append( cabecalho );
		for (String linha : conteudo) {
			bufferPagina.append('\n');
			bufferPagina.append( linha );
		}
		bufferPagina.append('\n');
		bufferPagina.append(rodape);
		
		return bufferPagina.toString();		
	}
	
}
