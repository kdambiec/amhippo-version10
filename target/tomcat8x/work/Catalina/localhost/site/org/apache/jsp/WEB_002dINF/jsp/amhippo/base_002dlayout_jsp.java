/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.21
 * Generated at: 2015-07-12 07:01:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.amhippo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class base_002dlayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/WEB-INF/lib/hst-client-2.30.00.jar", Long.valueOf(1436649898000L));
    _jspx_dependants.put("jar:file:/C:/Users/Karun/IdeaProjects/amhippo/target/tomcat8x/webapps/site/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar!/META-INF/x.tld", Long.valueOf(1384364862000L));
    _jspx_dependants.put("jar:file:/C:/Users/Karun/IdeaProjects/amhippo/target/tomcat8x/webapps/site/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384364862000L));
    _jspx_dependants.put("jar:file:/C:/Users/Karun/IdeaProjects/amhippo/target/tomcat8x/webapps/site/WEB-INF/lib/hst-client-2.30.00.jar!/META-INF/hst-core.tld", Long.valueOf(1430730220000L));
    _jspx_dependants.put("jar:file:/C:/Users/Karun/IdeaProjects/amhippo/target/tomcat8x/webapps/site/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar!/META-INF/fn.tld", Long.valueOf(1384364862000L));
    _jspx_dependants.put("/WEB-INF/jsp/include/imports.jsp", Long.valueOf(1436650520000L));
    _jspx_dependants.put("jar:file:/C:/Users/Karun/IdeaProjects/amhippo/target/tomcat8x/webapps/site/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar!/META-INF/fmt.tld", Long.valueOf(1384364862000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1436649898000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fxhtml_005fcategoryIncludes_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fxhtml_005fcategoryIncludes_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fxhtml_005fcategoryIncludes_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!doctype html>\n");
      //  hst:defineObjects
      org.hippoecm.hst.core.component.HstRequest hstRequest = null;
      org.hippoecm.hst.core.component.HstResponse hstResponse = null;
      java.util.List hstResponseChildContentNames = null;
      org.hippoecm.hst.core.request.HstRequestContext hstRequestContext = null;
      org.hippoecm.hst.tag.DefineObjectsTag _jspx_th_hst_005fdefineObjects_005f0 = (org.hippoecm.hst.tag.DefineObjectsTag) _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.get(org.hippoecm.hst.tag.DefineObjectsTag.class);
      _jspx_th_hst_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_hst_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_hst_005fdefineObjects_005f0 = _jspx_th_hst_005fdefineObjects_005f0.doStartTag();
      hstRequest = (org.hippoecm.hst.core.component.HstRequest) _jspx_page_context.findAttribute("hstRequest");
      hstResponse = (org.hippoecm.hst.core.component.HstResponse) _jspx_page_context.findAttribute("hstResponse");
      hstResponseChildContentNames = (java.util.List) _jspx_page_context.findAttribute("hstResponseChildContentNames");
      hstRequestContext = (org.hippoecm.hst.core.request.HstRequestContext) _jspx_page_context.findAttribute("hstRequestContext");
      if (_jspx_th_hst_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.reuse(_jspx_th_hst_005fdefineObjects_005f0);
        return;
      }
      hstRequest = (org.hippoecm.hst.core.component.HstRequest) _jspx_page_context.findAttribute("hstRequest");
      hstResponse = (org.hippoecm.hst.core.component.HstResponse) _jspx_page_context.findAttribute("hstResponse");
      hstResponseChildContentNames = (java.util.List) _jspx_page_context.findAttribute("hstResponseChildContentNames");
      hstRequestContext = (org.hippoecm.hst.core.request.HstRequestContext) _jspx_page_context.findAttribute("hstRequestContext");
      _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.reuse(_jspx_th_hst_005fdefineObjects_005f0);
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"");
      if (_jspx_meth_hst_005flink_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"");
      if (_jspx_meth_hst_005flink_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"");
      if (_jspx_meth_hst_005flink_005f2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("    ");
      //  hst:defineObjects
      org.hippoecm.hst.tag.DefineObjectsTag _jspx_th_hst_005fdefineObjects_005f1 = (org.hippoecm.hst.tag.DefineObjectsTag) _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.get(org.hippoecm.hst.tag.DefineObjectsTag.class);
      _jspx_th_hst_005fdefineObjects_005f1.setPageContext(_jspx_page_context);
      _jspx_th_hst_005fdefineObjects_005f1.setParent(null);
      int _jspx_eval_hst_005fdefineObjects_005f1 = _jspx_th_hst_005fdefineObjects_005f1.doStartTag();
      hstRequest = (org.hippoecm.hst.core.component.HstRequest) _jspx_page_context.findAttribute("hstRequest");
      hstResponse = (org.hippoecm.hst.core.component.HstResponse) _jspx_page_context.findAttribute("hstResponse");
      hstResponseChildContentNames = (java.util.List) _jspx_page_context.findAttribute("hstResponseChildContentNames");
      hstRequestContext = (org.hippoecm.hst.core.request.HstRequestContext) _jspx_page_context.findAttribute("hstRequestContext");
      if (_jspx_th_hst_005fdefineObjects_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.reuse(_jspx_th_hst_005fdefineObjects_005f1);
        return;
      }
      hstRequest = (org.hippoecm.hst.core.component.HstRequest) _jspx_page_context.findAttribute("hstRequest");
      hstResponse = (org.hippoecm.hst.core.component.HstResponse) _jspx_page_context.findAttribute("hstResponse");
      hstResponseChildContentNames = (java.util.List) _jspx_page_context.findAttribute("hstResponseChildContentNames");
      hstRequestContext = (org.hippoecm.hst.core.request.HstRequestContext) _jspx_page_context.findAttribute("hstRequestContext");
      _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.reuse(_jspx_th_hst_005fdefineObjects_005f1);
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_hst_005fheadContributions_005f0(_jspx_page_context))
        return;
      out.write("<!-- jQuery -->\n");
      out.write("    <script src=\"");
      if (_jspx_meth_hst_005flink_005f4(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"");
      if (_jspx_meth_hst_005flink_005f5(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    ");
      if (_jspx_meth_hst_005finclude_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_hst_005finclude_005f1(_jspx_page_context))
        return;
      out.write("<div class=\"row\">\n");
      out.write("        <div id=\"mainDiv\" class=\"col-md-12\">\n");
      out.write("            ");
      if (_jspx_meth_hst_005finclude_005f2(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row\">\n");
      out.write("    ");
      if (_jspx_meth_hst_005finclude_005f3(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</div>\n");
      if (_jspx_meth_hst_005fheadContributions_005f1(_jspx_page_context))
        return;
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_hst_005flink_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:link
    org.hippoecm.hst.tag.HstLinkTag _jspx_th_hst_005flink_005f0 = (org.hippoecm.hst.tag.HstLinkTag) _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.get(org.hippoecm.hst.tag.HstLinkTag.class);
    _jspx_th_hst_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005flink_005f0.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(11,16) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005flink_005f0.setPath("/css/bootstrap.min.css");
    int _jspx_eval_hst_005flink_005f0 = _jspx_th_hst_005flink_005f0.doStartTag();
    if (_jspx_th_hst_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005flink_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:link
    org.hippoecm.hst.tag.HstLinkTag _jspx_th_hst_005flink_005f1 = (org.hippoecm.hst.tag.HstLinkTag) _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.get(org.hippoecm.hst.tag.HstLinkTag.class);
    _jspx_th_hst_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_hst_005flink_005f1.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(13,16) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005flink_005f1.setPath("/css/modern-business.css");
    int _jspx_eval_hst_005flink_005f1 = _jspx_th_hst_005flink_005f1.doStartTag();
    if (_jspx_th_hst_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f1);
    return false;
  }

  private boolean _jspx_meth_hst_005flink_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:link
    org.hippoecm.hst.tag.HstLinkTag _jspx_th_hst_005flink_005f2 = (org.hippoecm.hst.tag.HstLinkTag) _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.get(org.hippoecm.hst.tag.HstLinkTag.class);
    _jspx_th_hst_005flink_005f2.setPageContext(_jspx_page_context);
    _jspx_th_hst_005flink_005f2.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(15,16) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005flink_005f2.setPath("/css/anandamarga.css");
    int _jspx_eval_hst_005flink_005f2 = _jspx_th_hst_005flink_005f2.doStartTag();
    if (_jspx_th_hst_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(17,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hstRequest.requestContext.cmsRequest}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<link rel=\"stylesheet\" href=\"");
        if (_jspx_meth_hst_005flink_005f3(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\" type=\"text/css\"/>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005flink_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:link
    org.hippoecm.hst.tag.HstLinkTag _jspx_th_hst_005flink_005f3 = (org.hippoecm.hst.tag.HstLinkTag) _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.get(org.hippoecm.hst.tag.HstLinkTag.class);
    _jspx_th_hst_005flink_005f3.setPageContext(_jspx_page_context);
    _jspx_th_hst_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(18,37) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005flink_005f3.setPath("/css/cms-request.css");
    int _jspx_eval_hst_005flink_005f3 = _jspx_th_hst_005flink_005f3.doStartTag();
    if (_jspx_th_hst_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f3);
    return false;
  }

  private boolean _jspx_meth_hst_005fheadContributions_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:headContributions
    org.hippoecm.hst.tag.HeadContributionsTag _jspx_th_hst_005fheadContributions_005f0 = (org.hippoecm.hst.tag.HeadContributionsTag) _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fxhtml_005fcategoryIncludes_005fnobody.get(org.hippoecm.hst.tag.HeadContributionsTag.class);
    _jspx_th_hst_005fheadContributions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fheadContributions_005f0.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(20,4) name = categoryIncludes type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContributions_005f0.setCategoryIncludes("htmlHead");
    // /WEB-INF/jsp/amhippo/base-layout.jsp(20,4) name = xhtml type = boolean reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContributions_005f0.setXhtml(true);
    int _jspx_eval_hst_005fheadContributions_005f0 = _jspx_th_hst_005fheadContributions_005f0.doStartTag();
    if (_jspx_th_hst_005fheadContributions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fxhtml_005fcategoryIncludes_005fnobody.reuse(_jspx_th_hst_005fheadContributions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fxhtml_005fcategoryIncludes_005fnobody.reuse(_jspx_th_hst_005fheadContributions_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005flink_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:link
    org.hippoecm.hst.tag.HstLinkTag _jspx_th_hst_005flink_005f4 = (org.hippoecm.hst.tag.HstLinkTag) _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.get(org.hippoecm.hst.tag.HstLinkTag.class);
    _jspx_th_hst_005flink_005f4.setPageContext(_jspx_page_context);
    _jspx_th_hst_005flink_005f4.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(22,17) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005flink_005f4.setPath("/js/jquery.js");
    int _jspx_eval_hst_005flink_005f4 = _jspx_th_hst_005flink_005f4.doStartTag();
    if (_jspx_th_hst_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f4);
    return false;
  }

  private boolean _jspx_meth_hst_005flink_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:link
    org.hippoecm.hst.tag.HstLinkTag _jspx_th_hst_005flink_005f5 = (org.hippoecm.hst.tag.HstLinkTag) _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.get(org.hippoecm.hst.tag.HstLinkTag.class);
    _jspx_th_hst_005flink_005f5.setPageContext(_jspx_page_context);
    _jspx_th_hst_005flink_005f5.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(25,17) name = path type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005flink_005f5.setPath("/js/bootstrap.min.js");
    int _jspx_eval_hst_005flink_005f5 = _jspx_th_hst_005flink_005f5.doStartTag();
    if (_jspx_th_hst_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005flink_0026_005fpath_005fnobody.reuse(_jspx_th_hst_005flink_005f5);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f0 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f0.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(31,4) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f0.setRef("top");
    int _jspx_eval_hst_005finclude_005f0 = _jspx_th_hst_005finclude_005f0.doStartTag();
    if (_jspx_th_hst_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f1 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f1.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(32,4) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f1.setRef("menu");
    int _jspx_eval_hst_005finclude_005f1 = _jspx_th_hst_005finclude_005f1.doStartTag();
    if (_jspx_th_hst_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f1);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f2 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f2.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f2.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(36,12) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f2.setRef("main");
    int _jspx_eval_hst_005finclude_005f2 = _jspx_th_hst_005finclude_005f2.doStartTag();
    if (_jspx_th_hst_005finclude_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f2);
    return false;
  }

  private boolean _jspx_meth_hst_005finclude_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:include
    org.hippoecm.hst.tag.HstIncludeTag _jspx_th_hst_005finclude_005f3 = (org.hippoecm.hst.tag.HstIncludeTag) _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.get(org.hippoecm.hst.tag.HstIncludeTag.class);
    _jspx_th_hst_005finclude_005f3.setPageContext(_jspx_page_context);
    _jspx_th_hst_005finclude_005f3.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(41,4) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f3.setRef("footer");
    int _jspx_eval_hst_005finclude_005f3 = _jspx_th_hst_005finclude_005f3.doStartTag();
    if (_jspx_th_hst_005finclude_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f3);
    return false;
  }

  private boolean _jspx_meth_hst_005fheadContributions_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:headContributions
    org.hippoecm.hst.tag.HeadContributionsTag _jspx_th_hst_005fheadContributions_005f1 = (org.hippoecm.hst.tag.HeadContributionsTag) _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fxhtml_005fcategoryIncludes_005fnobody.get(org.hippoecm.hst.tag.HeadContributionsTag.class);
    _jspx_th_hst_005fheadContributions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fheadContributions_005f1.setParent(null);
    // /WEB-INF/jsp/amhippo/base-layout.jsp(44,0) name = categoryIncludes type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContributions_005f1.setCategoryIncludes("htmlBodyEnd");
    // /WEB-INF/jsp/amhippo/base-layout.jsp(44,0) name = xhtml type = boolean reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fheadContributions_005f1.setXhtml(true);
    int _jspx_eval_hst_005fheadContributions_005f1 = _jspx_th_hst_005fheadContributions_005f1.doStartTag();
    if (_jspx_th_hst_005fheadContributions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fxhtml_005fcategoryIncludes_005fnobody.reuse(_jspx_th_hst_005fheadContributions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fheadContributions_0026_005fxhtml_005fcategoryIncludes_005fnobody.reuse(_jspx_th_hst_005fheadContributions_005f1);
    return false;
  }
}
