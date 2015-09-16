
package dinax.projeto.controle.web.command;

import dinax.projeto.core.aplicacao.Resultado;
import dinax.projeto.dominio.EntidadeDominio;


public interface ICommand {

	public Resultado execute(EntidadeDominio entidade);
	
}
