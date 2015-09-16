package dinax.projeto.controle.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dinax.projeto.controle.web.command.ICommand;
import dinax.projeto.controle.web.command.impl.AlterarCommand;
import dinax.projeto.controle.web.command.impl.ConsultarCommand;
import dinax.projeto.controle.web.command.impl.ExcluirCommand;
import dinax.projeto.controle.web.command.impl.SalvarCommand;
import dinax.projeto.controle.web.command.impl.VisualizarCommand;
import dinax.projeto.controle.web.vh.IViewHelper;
import dinax.projeto.controle.web.vh.impl.ClienteViewHelper;
import dinax.projeto.controle.web.vh.impl.FornecedorViewHelper;
import dinax.projeto.controle.web.vh.impl.ProdutoViewHelper;
import dinax.projeto.core.aplicacao.Resultado;
import dinax.projeto.dominio.EntidadeDominio;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Map<String, ICommand> commands;
	private static Map<String, IViewHelper> vhs;
	
	
    /**
     * Default constructor. 
     */
    public Servlet() {
    	
    	/* Utilizando o command para chamar a fachada e indexando cada command 
    	 * pela opera��o garantimos que esta servelt atender� qualquer opera��o */
    	commands = new HashMap<String, ICommand>();
    	
    	
    	
    	commands.put("SALVAR", new SalvarCommand());
    	commands.put("EXCLUIR", new ExcluirCommand());
    	commands.put("CONSULTAR", new ConsultarCommand());
    	commands.put("VISUALIZAR", new VisualizarCommand());
    	commands.put("ALTERAR", new AlterarCommand());
    	
    	
    	/* Utilizando o ViewHelper para tratar especificacoes de qualquer tela e indexando 
    	 * cada viewhelper pela url em que esta servlet e chamada no form
    	 * garantimos que esta servelt atender� qualquer entidade */
    	
    	vhs = new HashMap<String, IViewHelper>();
    	/*A chave do mapa � o mapeamento da servlet para cada form que 
    	 * esta configurado no web.xml e sendo utilizada no action do html
    	 */
    	vhs.put("/les12015-web/SalvarFornecedor", new FornecedorViewHelper());
    	vhs.put("/les12015-web/SalvarCliente", new ClienteViewHelper());
    	vhs.put("/les12015-web/SalvarProduto", new ProdutoViewHelper());
    	
    }
    
    
    /** 
     * TODO Descri��o do M�todo
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
    		IOException {
    	doProcessRequest(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcessRequest(request, response);
	}
	
	
	protected void doProcessRequest(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
		//Obt�m a uri que invocou esta servlet (O que foi definido no methdo do form html)
		String uri = request.getRequestURI();
		
		//Obt�m um viewhelper indexado pela uri que invocou esta servlet
		IViewHelper vh = vhs.get(uri);
		
		//O viewhelper retorna a entidade especifica para a tela que chamou esta servlet
		EntidadeDominio entidade =  vh.getEntidade(request);
		
		//Obt�m a opera��o executada
		String operacao = request.getParameter("operacao");
		
		//Obt�m o command para executar a respectiva opera��o
		ICommand command = commands.get(operacao);
				
		/*Executa o command que chamar� a fachada para executar a opera��o requisitada
		 * o retorno � uma inst�ncia da classe resultado que pode conter mensagens derro 
		 * ou entidades de retorno
		 */
		Resultado resultado = command.execute(entidade);
		
		/*
		 * Executa o m�todo setView do view helper espec�fico para definir como dever� ser apresentado 
		 * o resultado para o usu�rio
		 */
		vh.setView(resultado, request, response);
	
	}
}
