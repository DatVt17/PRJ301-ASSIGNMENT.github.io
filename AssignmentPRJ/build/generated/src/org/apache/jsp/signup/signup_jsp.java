package org.apache.jsp.signup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"signup.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/d57e3d8d33.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Sign Up</h1>\n");
      out.write("\n");
      out.write("                <!-- ---------------------------------- -->\n");
      out.write("\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <div class=\"iconInText\">\n");
      out.write("                        <input class=\"inputtext\" type=\"text\" placeholder=\"Username\" name=\"username\" value=\"\">\n");
      out.write("                        <i class=\"fas fa-user\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"iconInText\">\n");
      out.write("                        <input class=\"inputtext\" type=\"password\" placeholder=\"Password\" name=\"password\" value=\"\">\n");
      out.write("                        <i class=\"fas fa-lock\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"iconInText\">\n");
      out.write("                        <input class=\"inputtext\" type=\"text\" placeholder=\"Confirm Password\" name=\"password\" value=\"\">\n");
      out.write("                        <i class=\"fas fa-lock\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"iconInText\">\n");
      out.write("                        <input class=\"inputtext\" type=\"text\" placeholder=\"Email\" name=\"email\" value=\"\">\n");
      out.write("                        <i class=\"fas fa-envelope\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"gender\">\n");
      out.write("                        Gender:\n");
      out.write("                        <input class=\"inputradio\" type=\"radio\" name=\"gender\" checked>Male\n");
      out.write("                        <input class=\"inputradio\" type=\"radio\" name=\"gender\">Female\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"address\">\n");
      out.write("                        Address:\n");
      out.write("                        <select class=\"address\">\n");
      out.write("                            <option value=\"Ha Noi\">Ha Noi</option>\n");
      out.write("                            <option value=\"TP Ho Chi Minh\">TP Ho Chi Minh</option>\n");
      out.write("                            <option value=\"Ha Giang\">Ha Giang</option>\n");
      out.write("                            <option value=\"Thanh Hoa\" selected>Thanh Hoa</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <input class=\"inputreset\" type=\"reset\" value=\"Reset\">\n");
      out.write("                    <input class=\"sub\" type=\"submit\" value=\"Sign Up\" name=\"submit\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
