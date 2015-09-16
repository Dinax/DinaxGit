package dinax.projeto.core.impl.negocio;

import dinax.projeto.core.IStrategy;
import dinax.projeto.dominio.EntidadeDominio;
import dinax.projeto.dominio.Fornecedor;

public class ValidadorCnpj implements IStrategy {

	@Override
	public String processar(EntidadeDominio entidade) {
		
		if(entidade instanceof Fornecedor){
			Fornecedor fornecedor = (Fornecedor)entidade;
			
			if(fornecedor.getCnpj().length() < 14){
				return "CNPJ deve conter 14 digitos!";
			}
			
		}else{
			return "CNPJ n�o pode ser v�lidado, pois entidade n�o � um fornecedor!";
		}
		
		
		return null;
	}

}
