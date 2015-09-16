package dinax.projeto.core.impl.negocio;

import java.util.Date;

import dinax.projeto.core.IStrategy;
import dinax.projeto.dominio.EntidadeDominio;

public class ComplementarDtCadastro implements IStrategy {

	@Override
	public String processar(EntidadeDominio entidade) {		
		
		
		if(entidade !=null){
			Date data = new Date();		
			entidade.setDtCadastro(data);
		}else{
			return "Entidade: "+entidade.getClass().getCanonicalName()+" nula!";
		}
		
		
		
		return null;
	}

}
