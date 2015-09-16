package dinax.projeto.core.impl.negocio;

import dinax.projeto.core.IStrategy;
import dinax.projeto.dominio.Usuario;
import dinax.projeto.dominio.EntidadeDominio;

public class ValidadorCpf implements IStrategy {

	@Override
	public String processar(EntidadeDominio entidade) {
		
		if(entidade instanceof Usuario){
			Usuario u = (Usuario)entidade;
			
			if(u.getCpf().length() < 9){
				return "CPF deve conter 14 digitos!";
			}
			
		}else{
			return "CPF n�o pode ser v�lidado, pois entidade n�o � um cliente!";
		}
		
		
		return null;
	}

}
