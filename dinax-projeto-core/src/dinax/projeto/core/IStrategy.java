package dinax.projeto.core;

import dinax.projeto.dominio.EntidadeDominio;


public interface IStrategy 
{

	public String processar(EntidadeDominio entidade);
	
}
