package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pobierzDaneKlienta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write(" <style rel=\"stylesheet\" type=\"text/css\">\n");
      out.write(" body {  background: url('silownia1.jpg');}\n");
      out.write(" .contentbox {\n");
      out.write("    margin-top: 150px;\n");
      out.write("     margin-left: 600px;\n");
      out.write("    width: auto;\n");
      out.write("    height: 100%;\n");
      out.write("    background-color: white;\n");
      out.write("    border-color: black;\n");
      out.write("    overflow: auto;\n");
      out.write("    font-family: Arial;   \n");
      out.write("    font-size: 40px; \n");
      out.write("           }\n");
      out.write("    .tak {color:red;  font-weight: bold; }\n");
      out.write("\t.sumbit { text-align: center;}\n");
      out.write("       .tak3 {color:white;  font-weight: bold; text-align: center;}\n");
      out.write("       .stronka { font-weight: bold;  margin-left: 100px; color: white}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
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
      out.write("\t\t\n");
      out.write("\t\t<div class=\"contentbox\">\n");
      out.write("            <form action=\"dodajKlienta.jsp\">\n");
      out.write("            <table class=\"operationtable\">\n");
      out.write("                <tr class='tableheader'>\n");
      out.write("                    <td class = tak3 colspan='2'>Dodaj Klienta</td>\n");
      out.write("                </tr>\n");
      out.write("\t\t\t\t \n");
      out.write("                <tr>\n");
      out.write("                    <td class = tak>Imię:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"imie\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class = tak>Nazwisko:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nazwisko\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class = tak>Telefon:</td>\n");
      out.write("                    <td ><input type=\"number\" name=\"telefon\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  class = sumbit colspan=\"2\"><input type=\"submit\" value=\" DODAJ \" align=\"right\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("     <a class=stronka href=\"http://localhost:8080/silownia/\">Powrót do strony głównej</a>\n");
      out.write("    \n");
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
