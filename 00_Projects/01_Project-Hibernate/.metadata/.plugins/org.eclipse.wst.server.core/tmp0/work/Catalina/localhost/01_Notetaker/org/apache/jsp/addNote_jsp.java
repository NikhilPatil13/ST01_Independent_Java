/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.18
 * Generated at: 2024-01-31 07:07:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class addNote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1706651165697L));
    _jspx_dependants.put("/required/all_js_css_files.jsp", Long.valueOf(1706675726722L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Notetaker App</title>\r\n");
      out.write("	\r\n");
      out.write("	<!-- Adding all_js_css_files.jsp -->\r\n");
      out.write("	");
      out.write("<!-- Bootstrap css -->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n");
      out.write("  	\r\n");
      out.write("<!-- Adding style.css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("<!-- Adding bootstrap icons -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">  \r\n");
      out.write("  \r\n");
      out.write("<!-- Bootstrap JS -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\" integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Adding navbar.jsp -->\r\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark primaryPurple\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\">NoteTaker</a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("        \r\n");
      out.write("<!-- Home -->\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("<!-- Add Note -->\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"addNote.jsp\">Add Note</a>\r\n");
      out.write("        </li>\r\n");
      out.write("<!-- Show Notes -->\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"allNotes.jsp\" >Show Notes</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\r\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("        <button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <h2 style=\"text-align:center\"><u>Please Fill Note : </u></h2>\r\n");
      out.write("    \r\n");
      out.write("    <br>\r\n");
      out.write("    <!-- Add note form -->\r\n");
      out.write("    <form action=\"SaveNoteServlet\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("		\r\n");
      out.write("			<!-- add title -->\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("			    <label for=\"noteTitle\" class=\"form-label\">Title</label>\r\n");
      out.write("			    <input 	type=\"text\" \r\n");
      out.write("			    		class=\"form-control\" \r\n");
      out.write("			    		id=\"noteTitle\"\r\n");
      out.write("			    		name=\"noteTitle\" \r\n");
      out.write("			    		placeholder=\"Add Title\" \r\n");
      out.write("			    		required />\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- add content -->\r\n");
      out.write("			<div class=\"mb-3\">\r\n");
      out.write("			    <label for=\"noteContent\" class=\"form-label\">Content</label>\r\n");
      out.write("			    <textarea 	id=\"noteContent\"	\r\n");
      out.write("			    			class=\"form-control\"\r\n");
      out.write("			    			name=\"noteContent\"\r\n");
      out.write("			    			placeholder=\"Add Content here...\"	\r\n");
      out.write("			    			style=\"height:300px;\" required ></textarea>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<!-- centering Add button -->\r\n");
      out.write("			<div class=\"container text-center\">\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-primary\">Add</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("	</form>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}