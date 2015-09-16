
package dinax.projeto.dominio;



public class Usuario extends Pessoa {

	private String cpf;
        private String rg;
        

	/**
	 * M�todo de recupera��o do campo cpf
	 *
	 * @return valor do campo cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Valor de cpf atribu�do a cpf
	 *
	 * @param cpf Atributo da Classe
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
        
        /**
	 * Metodo de recuperacao do campo rg
	 *
	 * @param rg Atributo da Classe
	 */
        public String getRg() {
            return rg;
        }

        /**
	 * Valor de rg atribuido a rg
	 *
	 * @param rg Atributo da Classe
	 */
        public void setRg(String rg) {
            this.rg = rg;
        }
	
	
	
	
}
