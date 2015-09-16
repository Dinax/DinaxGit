package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dinax.projeto.core.util.ConverteDate;
import dinax.projeto.core.aplicacao.Resultado;
import dinax.projeto.dominio.*;
import java.util.*;

public final class FormProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>:::: CADASTRO DE PRODUTO::::</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");

		Produto produto = (Produto) request.getAttribute("produto");
	
      out.write("\n");
      out.write("\n");
      out.write("\t<form action=\"SalvarProduto\" method=\"post\">\n");
      out.write("\t\t<label for=\"txtId\">Id:</label>\n");
      out.write("\t\t<input type=\"text\" id=\"txtId\" name=\"txtId\" value=\n");
      out.write("\t\t\n");
      out.write("\t\t");
		
			if(produto != null) out.print("'"+produto.getId()+"' readonly>"); 
			else out.print(">"); 		
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t</input>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t</br> \n");
      out.write("\t\t\n");
      out.write("\t\t<label for=\"txtDescricao\">Descrição:</label>\n");
      out.write("\t\t<input type=\"text\" id=\"txtDescricao\" name=\"txtDescricao\" value=\n");
      out.write("\t\t\n");
      out.write("\t\t");
		
			if(produto != null) 
				out.print("'"+produto.getDescricao()+"'>"); 
			else 
				out.print(">"); 		
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t</input>\n");
      out.write("\t\t\n");
      out.write("\t\t<label for=\"txtQtd\">Quantidade:</label>\n");
      out.write("\t\t<input type=\"text\" id=\"txtQtd\" name=\"txtQtd\" value=\n");
      out.write("\t\t \n");
      out.write("\t\t");
		
			if(produto != null) out.print("'"+produto.getQuantidade()+"'>"); 
			else out.print(">"); 		
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t</input>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t");
		
			if(produto != null){
				String dtCadastro = ConverteDate.converteDateString(produto.getDtCadastro());
				out.print("<label for='txtDtCadastro'>Data de Cadastro:</label>");
				out.print("<input type='text' id='txtDtCadastro' name='txtDtCadastro' value='"+dtCadastro+"' readonly>");
			}
				
				
		
		
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t</input>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t");
		
			if(produto != null) {
				out.print("<input type='submit' id='operacao' name='operacao' value='ALTERAR'/>");	
				out.print("<input type='submit' id='operacao' name='operacao' value='EXCLUIR'/>");	
			}else{
				out.print("<input type='submit' id='operacao' name='operacao' value='SALVAR'/>");
			}
				
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
