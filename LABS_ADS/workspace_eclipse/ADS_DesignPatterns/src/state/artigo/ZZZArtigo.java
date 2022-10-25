package state.artigo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ZZZArtigo {
	
	private String estado;
	
	private List<String> logHistorico = new ArrayList<>();
	
	public ZZZArtigo() {
		this.estado = "RASCUNHO"; //estado inicial
	}

	public void publicar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			if(seguranca.ehUsuarioAutor()) {
				this.estado = "REVISANDO";
				this.logHistorico.add("Transitado para REVISANDO em " + LocalDateTime.now());
				return;
			} else {
				throw new RuntimeException("Usuario não tem permissao para publicar");
			}
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(seguranca.ehUsuarioModerador()) {
				this.estado = "APROVADO";
				this.logHistorico.add("Transitado para APROVADO em "+ LocalDateTime.now());
				return;
			}else {
				throw new RuntimeException("Usuario não tem permissao para publicar");
			}
		}
		
		if("APROVADO".equals(this.estado)) {
			return;
		}
	}
	
	public void reprovar() {
		GerenteDeSeguranca gerente = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			return;
		}
		if("REVISANDO".equals(this.estado)) {
			if(gerente.ehUsuarioModerador()) {
				this.estado = "RASCUNHO";
				logHistorico.add("Transitado para RASCUNHO em " + LocalDate.now());
				return;
			}else {
				throw new RuntimeException("Usuario nao tem permissao para reprovar");
			}
		}
		
		if("APROVADO".equals(this.estado)) {
			return;
		}
	}
	
	public String getEstado() {
		return estado;
	}
	
	public List<String> getLogHistorico(){
		return logHistorico;
	}

}
