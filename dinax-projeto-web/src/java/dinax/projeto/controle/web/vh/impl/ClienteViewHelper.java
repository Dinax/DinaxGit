
package dinax.projeto.controle.web.vh.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dinax.projeto.controle.web.vh.IViewHelper;
import dinax.projeto.core.aplicacao.Resultado;
import dinax.projeto.dominio.Usuario;
import dinax.projeto.dominio.EntidadeDominio;



public class ClienteViewHelper implements IViewHelper {

	/** 
	 * TODO Descri��o do M�todo
	 * @param request
	 * @param response
	 * @return
	 * @see les12015.controle.web.vh.IViewHelper#getEntidade(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String nome = request.getParameter("txtNome");
		String cpf = request.getParameter("txtCpf");
                String rg = request.getParameter("txtRg");
		String id = request.getParameter("txtId");
		
		
		Usuario c = new Usuario();
		c.setNome(nome);
		
		if(id != null && !id.trim().equals("")){
			c.setId(Integer.parseInt(id));
		}
		
		c.setCpf(cpf);
                c.setRg(rg);
		return c;
	}

	/** 
	 * TODO Descri��o do M�todo
	 * @param request
	 * @param response
	 * @return
	 * @see les12015.controle.web.vh.IViewHelper#setView(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void setView(Resultado resultado, HttpServletRequest request, 
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
