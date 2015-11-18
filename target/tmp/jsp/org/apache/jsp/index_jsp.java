package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Siłownia</title>\r\n");
      out.write("        <style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("            body \t{background: url('teatr3.jpg') 450px 200px no-repeat;\r\n");
      out.write("            \t\tbackground-color:/* Permalink - use to edit and share this gradient: http://colorzilla.com/gradient-editor/#fefcea+0,f1da36+100;Gold+3D */\r\n");
      out.write("background: #fefcea; /* Old browsers */\r\n");
      out.write("background: -moz-linear-gradient(top,  #fefcea 0%, #f1da36 100%); /* FF3.6-15 */\r\n");
      out.write("background: -webkit-linear-gradient(top,  #fefcea 0%,#f1da36 100%); /* Chrome10-25,Safari5.1-6 */\r\n");
      out.write("background: linear-gradient(to bottom,  #fefcea 0%,#f1da36 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */\r\n");
      out.write("filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fefcea', endColorstr='#f1da36',GradientType=0 ); /* IE6-9 */\r\n");
      out.write(";}\r\n");
      out.write("            h1 \t    {text-align: center; color: /* Permalink - use to edit and share this gradient: http://colorzilla.com/gradient-editor/#e4f5fc+0,bfe8f9+50,9fd8ef+51,2ab0ed+100;Blue+Gloss+%235 */\r\n");
      out.write("background: #e4f5fc; /* Old browsers */\r\n");
      out.write("background: -moz-linear-gradient(top,  #e4f5fc 0%, #bfe8f9 50%, #9fd8ef 51%, #2ab0ed 100%); /* FF3.6-15 */\r\n");
      out.write("background: -webkit-linear-gradient(top,  #e4f5fc 0%,#bfe8f9 50%,#9fd8ef 51%,#2ab0ed 100%); /* Chrome10-25,Safari5.1-6 */\r\n");
      out.write("background: linear-gradient(to bottom,  #e4f5fc 0%,#bfe8f9 50%,#9fd8ef 51%,#2ab0ed 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */\r\n");
      out.write("filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#e4f5fc', endColorstr='#2ab0ed',GradientType=0 ); /* IE6-9 */\r\n");
      out.write("; font-size: 100px; font-style: normal;\r\n");
      out.write("                    text-decoration:  ; font-family: \"courier\";}\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("<h1> Siłownia </h1>\r\n");
      out.write("\r\n");
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
