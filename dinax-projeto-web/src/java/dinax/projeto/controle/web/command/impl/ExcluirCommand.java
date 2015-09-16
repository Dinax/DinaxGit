
package dinax.projeto.controle.web.command.impl;

import dinax.projeto.core.aplicacao.Resultado;
import dinax.projeto.dominio.EntidadeDominio;


public class ExcluirCommand extends AbstractCommand{

	
	public Resultado execute(EntidadeDominio entidade) {
		
		return fachada.excluir(entidade);
	}

}
