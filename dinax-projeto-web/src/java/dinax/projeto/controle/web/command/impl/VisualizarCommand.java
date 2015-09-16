
package dinax.projeto.controle.web.command.impl;

import dinax.projeto.core.aplicacao.Resultado;
import dinax.projeto.dominio.EntidadeDominio;


public class VisualizarCommand extends AbstractCommand{

	
	public Resultado execute(EntidadeDominio entidade) {
		
		return fachada.visualizar(entidade);
	}

}
