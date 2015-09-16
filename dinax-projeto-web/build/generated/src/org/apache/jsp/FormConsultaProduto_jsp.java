package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dinax.projeto.core.util.ConverteDate;
import dinax.projeto.core.aplicacao.Resultado;
import dinax.projeto.dominio.*;
import java.util.*;

public final class FormConsultaProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("\n");
      out.write("<title>:::: CONSULTAR PRODUTO::::</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t");

		Resultado resultado = (Resultado) session.getAttribute("resultado");
	
      out.write("\n");
      out.write("\n");
      out.write("\t<form action=\"SalvarProduto\" method=\"post\">\n");
      out.write("\n");
      out.write("\t\t<label for=\"txtId\">Id:</label> <input type=\"text\" id=\"txtId\"\n");
      out.write("\t\t\tname=\"txtId\" /> </br> \n");
      out.write("\t\t\t<label for=\"txtDescricao\">DESCRIÇÃO:</label> <input\n");
      out.write("\t\t\ttype=\"text\" id=\"txtDescricao\" name=\"txtDescricao\" /> <input\n");
      out.write("\t\t\ttype=\"submit\" id=\"operacao\" name=\"operacao\" value=\"CONSULTAR\" />\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");

	
	if(resultado !=null && resultado.getMsg() != null){
		out.print(resultado.getMsg());
	}
	
	
      out.write("\n");
      out.write("<BR>\n");
      out.write("\n");
      out.write("<TABLE BORDER=\"5\"    WIDTH=\"50%\"   CELLPADDING=\"4\" CELLSPACING=\"3\">\n");
      out.write("   <TR>\n");
      out.write("      <TH COLSPAN=\"3\"><BR>\n");
      out.write("      \t<H3>PRODUTOS</H3>\n");
      out.write("      </TH>\n");
      out.write("   </TR>\n");
      out.write("   \n");
      out.write("   <TR>\n");
      out.write("      <TH>ID:</TH>\n");
      out.write("      <TH>Descrição</TH>\n");
      out.write("      <TH>Quantidade:</TH>\n");
      out.write("   </TR>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   ");

   
   if (resultado != null) {
		List<EntidadeDominio> entidades = resultado.getEntidades();
		StringBuilder sbRegistro = new StringBuilder();
		StringBuilder sbLink = new StringBuilder();
		
		
		if(entidades != null){
			for (int i = 0; i < entidades.size(); i++) {
				Produto p = (Produto) entidades.get(i);
				sbRegistro.setLength(0);
				sbLink.setLength(0);
				
			//	<a href="nome-do-lugar-a-ser-levado">descrição</a>
				
				sbRegistro.append("<TR ALIGN='CENTER'>");
				
				
				sbLink.append("<a href=SalvarProduto?");
					sbLink.append("txtId=");
					sbLink.append(p.getId());						
					sbLink.append("&");
					sbLink.append("operacao=");
					sbLink.append("VISUALIZAR");
					
				sbLink.append(">");
				
				sbRegistro.append("<TD>");
				sbRegistro.append(sbLink.toString());	
				sbRegistro.append(p.getId());
				sbRegistro.append("</a>");				
				sbRegistro.append("</TD>");
				
				sbRegistro.append("<TD>");
				sbRegistro.append(sbLink.toString());				
				sbRegistro.append(p.getDescricao());
				sbRegistro.append("</a>");				
				sbRegistro.append("</TD>");
				
				sbRegistro.append("<TD>");
				sbRegistro.append(sbLink.toString());				
				sbRegistro.append(p.getQuantidade());
				sbRegistro.append("</a>");				
				sbRegistro.append("</TD>");
				
				sbRegistro.append("</TR>");
				
				
				out.print(sbRegistro.toString());
				
			}
		}
		

	}
   
   
      out.write("\n");
      out.write("   \n");
      out.write("   \n");
      out.write("      \n");
      out.write("  \n");
      out.write("</TABLE>\n");
      out.write("\n");
      out.write("\n");
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
