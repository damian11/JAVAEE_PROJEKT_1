package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.com.dkasztelan.domain.Klient;

public final class edytujKlient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<title>Edytuj Klienta</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tbackground: url('silownia1.jpg'); background-position: center top; no-repeat;\r\n");
      out.write("\t\tbackground-position: center top; no-repeat;\r\n");
      out.write("\t}\r\n");
      out.write("\t.przedrostki{ \r\n");
      out.write("   margin-top: 150px;\r\n");
      out.write("     margin-left: 600px;\r\n");
      out.write("    width: auto;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("  \r\n");
      out.write("    border-color: white;\r\n");
      out.write("    overflow: auto;\r\n");
      out.write("    font-family: Arial;   \r\n");
      out.write("    font-size: 60px; \r\n");
      out.write("           }\r\n");
      out.write("\t\r\n");
      out.write("\t.zapisz{ \r\n");
      out.write("\t\tmargin-left:100px; \r\n");
      out.write("\t\tmargin-top: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\ta{ \r\n");
      out.write("color:white;  font-weight: bold; \r\n");
      out.write("\t}\r\n");
      out.write("    h1{\r\n");
      out.write("    \tmargin-left: 16cm;\r\n");
      out.write("    \tcolor: white; \r\n");
      out.write("    \tfont-size: 50px; \r\n");
      out.write("    \tfont-style: italic;\r\n");
      out.write("        font-family: \"Arial\"; \r\n");
      out.write("        margin-top: -12cm;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      main.java.com.dkasztelan.domain.Klient klient = null;
      synchronized (session) {
        klient = (main.java.com.dkasztelan.domain.Klient) _jspx_page_context.getAttribute("klient", PageContext.SESSION_SCOPE);
        if (klient == null){
          klient = new main.java.com.dkasztelan.domain.Klient();
          _jspx_page_context.setAttribute("klient", klient, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("klient"), request);
      out.write("\r\n");
      out.write("\t");
      main.java.com.dkasztelan.service.KlientManager klientmanager = null;
      synchronized (application) {
        klientmanager = (main.java.com.dkasztelan.service.KlientManager) _jspx_page_context.getAttribute("klientmanager", PageContext.APPLICATION_SCOPE);
        if (klientmanager == null){
          klientmanager = new main.java.com.dkasztelan.service.KlientManager();
          _jspx_page_context.setAttribute("klientmanager", klientmanager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");

        String ID = request.getParameter("update");
     	int telefon = 0;
    	String  imie = "",  nazwisko = "";
        for (Klient k : klientmanager.pobierzKlientow()){
          if (k.getId_klient() == Integer.parseInt(ID)){
      		imie = k.getImie();
       		nazwisko = k.getNazwisko();
        	telefon = k.getTelefon();
        	break;
        	}
        }
        
   		out.println("<div class = 'przedrostki'><form action='updateKlient'><input type='hidden' name='id' value='" + ID +
		   "' /><tr><td colspan='2'><b></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;  &nbsp;&nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  " + ID +
		   "</td></tr><br><tr><td><b>Imie: </b> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   &nbsp; &nbsp; </td><td><input type='text' name='imie' pattern='[A-Za-z]*' title='Imie powinno sk�ada� si� tylko z liter' value='" + imie +
		   "' /></td></tr><br><tr><td><b>Nazwisko:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td><td><input type='text' name='nazwisko' pattern='[A-Za-z]*' title='Nazwisko powinno sk�ada� sie tylko z liter' value='" + nazwisko +
		   "' /></td></tr><tr><br><td><b>Telefon:</b></td><td><input type='text' name='telefon'value='" + telefon + 
		   "' /></td></tr><tr><br><td colspan='2'><div class='zapisz'><input type='submit' value='ZAPISZ'></div></td></tr></form></div>");
		
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<a href=\"index.jsp\"><h3><center><font color=\"white\">Powrot do strony glownej</a></h3></center>\r\n");
      out.write("\t<h1>Edytuj Klienta</h1>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
