package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dodajKlienta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Dodaj Klienta</title>\r\n");
      out.write("</head>\r\n");
      out.write(" <style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\tbody {    background-color: ; }\r\n");
      out.write("\ttable {\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\twidth: 300px; \r\n");
      out.write("\t    margin-top: 150px;\r\n");
      out.write("     margin-left: 600px;}\r\n");
      out.write("\ttd {\r\n");
      out.write("\tborder: 2px solid #E37509;\r\n");
      out.write("\tpadding: 5px;}\r\n");
      out.write("\t.link { color: black ; font-weight: bold; text-align: center;}\r\n");
      out.write("\t.header {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    background-color: #C0C0C0; }\r\n");
      out.write("    p {  font-weight: bold; color: black;   margin-top: 80px;  margin-left: 500px; font-size: 24px;}\r\n");
      out.write(" \r\n");
      out.write(" </style>\r\n");
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
      main.java.com.dkasztelan.service.KlientManager manager = null;
      synchronized (application) {
        manager = (main.java.com.dkasztelan.service.KlientManager) _jspx_page_context.getAttribute("manager", PageContext.APPLICATION_SCOPE);
        if (manager == null){
          manager = new main.java.com.dkasztelan.service.KlientManager();
          _jspx_page_context.setAttribute("manager", manager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\t\t");

		manager.add(klient);
	
      out.write("\r\n");
      out.write("\t<div class=\"dodaj\">\r\n");
      out.write("\t<p>Następująca osoba została dodana do bazy:</p>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr class = \"header\">\r\n");
      out.write("\t\t<td> Imię: </td>\r\n");
      out.write("\t\t<td> Nazwisko: </td>\r\n");
      out.write("\t\t<td> Telefon: </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.dkasztelan.domain.Klient)_jspx_page_context.findAttribute("klient")).getImie())));
      out.write(" </td>\r\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.dkasztelan.domain.Klient)_jspx_page_context.findAttribute("klient")).getNazwisko())));
      out.write(" </td>\r\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.dkasztelan.domain.Klient)_jspx_page_context.findAttribute("klient")).getTelefon())));
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t <a class = \"link\" href=\"http://localhost:8080/silownia/\">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("\t</div>\r\n");
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
