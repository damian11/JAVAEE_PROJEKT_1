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
      out.write("\tbody {     background: url('silownia1.jpg');}\r\n");
      out.write("\ttable{\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\twidth: 500px; \r\n");
      out.write("\tmargin-top: auto;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("   td {\r\n");
      out.write("\tborder: 2px solid #000000;\r\n");
      out.write("\tpadding: 5px;}\r\n");
      out.write("\t.rama {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-size: 40px;\r\n");
      out.write("    }\r\n");
      out.write("    p {  font-weight: bold; color: white;   margin-top: 80px;  margin-left: 500px; font-size: 50px;}\r\n");
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
      main.java.com.dkasztelan.service.KlientManager klientmanager = null;
      synchronized (application) {
        klientmanager = (main.java.com.dkasztelan.service.KlientManager) _jspx_page_context.getAttribute("klientmanager", PageContext.APPLICATION_SCOPE);
        if (klientmanager == null){
          klientmanager = new main.java.com.dkasztelan.service.KlientManager();
          _jspx_page_context.setAttribute("klientmanager", klientmanager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\t\t");

		klientmanager.dodajKlienta(klient);
	
      out.write("\r\n");
      out.write("\t<div class=\"dodaj\">\r\n");
      out.write("\t<p>Następująca osoba została dodana do bazy:</p>\r\n");
      out.write("\t\r\n");
      out.write("<table>\r\n");
      out.write("\r\n");
      out.write("\t<tr class = \"rama\">\r\n");
      out.write("\t\t<td>Imię</td>  \r\n");
      out.write("\r\n");
      out.write("\t\t<td>Nazwisko</td> \r\n");
      out.write("\r\n");
      out.write("\t\t<td>Telefon</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr class = \"rama\">\r\n");
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
      out.write("\t <a class = \"link\" href=\"index.jsp\">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("\t\r\n");
      out.write(" <a class=\"btn btn-default\" href=\"pobierzDaneKlienta.jsp\"><b><font color=\"white\">Dodaj klienta</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
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
