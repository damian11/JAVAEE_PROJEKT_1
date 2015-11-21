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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Dodaj Klienta</title>\n");
      out.write("</head>\n");
      out.write(" <style rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\tbody {     background: url('silownia1.jpg'); background-position: center top; no-repeat; }\n");
      out.write("\ttable {\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("\twidth: 300px; \n");
      out.write("\t    margin-top: 150px;\n");
      out.write("     margin-left: 600px;}\n");
      out.write("\ttd {\n");
      out.write("\tborder: 2px solid #000000;\n");
      out.write("\tpadding: 5px;}\n");
      out.write("\t.link { color: black ; font-weight: bold; text-align: center;}\n");
      out.write("\t.header {\n");
      out.write("    font-weight: bold;\n");
      out.write("    }\n");
      out.write("    p {  font-weight: bold; color: black;   margin-top: 80px;  margin-left: 500px; font-size: 24px;}\n");
      out.write(" \n");
      out.write(" </style>\n");
      out.write("<body>\n");
      out.write("\t");
      main.java.com.dkasztelan.domain.Klient klient = null;
      synchronized (session) {
        klient = (main.java.com.dkasztelan.domain.Klient) _jspx_page_context.getAttribute("klient", PageContext.SESSION_SCOPE);
        if (klient == null){
          klient = new main.java.com.dkasztelan.domain.Klient();
          _jspx_page_context.setAttribute("klient", klient, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("klient"), request);
      out.write('\n');
      out.write('	');
      main.java.com.dkasztelan.service.KlientManager manager = null;
      synchronized (application) {
        manager = (main.java.com.dkasztelan.service.KlientManager) _jspx_page_context.getAttribute("manager", PageContext.APPLICATION_SCOPE);
        if (manager == null){
          manager = new main.java.com.dkasztelan.service.KlientManager();
          _jspx_page_context.setAttribute("manager", manager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\t\t");

		manager.add(klient);
	
      out.write("\n");
      out.write("\t<div class=\"dodaj\">\n");
      out.write("\t<p>Następująca osoba została dodana do bazy:</p>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("\t<tr class = \"header\">\n");
      out.write("\t\t<td> Imię: </td>\n");
      out.write("\t\t<td> Nazwisko: </td>\n");
      out.write("\t\t<td> Telefon: </td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.dkasztelan.domain.Klient)_jspx_page_context.findAttribute("klient")).getImie())));
      out.write(" </td>\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.dkasztelan.domain.Klient)_jspx_page_context.findAttribute("klient")).getNazwisko())));
      out.write(" </td>\n");
      out.write("\t\t<td> ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.dkasztelan.domain.Klient)_jspx_page_context.findAttribute("klient")).getTelefon())));
      out.write(" </td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t <a class = \"link\" href=\"http://localhost:8080/silownia/\">Powrót do strony głównej</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("  \n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
