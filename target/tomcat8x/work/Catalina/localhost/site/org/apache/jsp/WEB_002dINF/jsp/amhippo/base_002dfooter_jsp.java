/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.21
 * Generated at: 2015-07-12 06:54:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.amhippo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class base_002dfooter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhst_005fsetBundle_0026_005fbasename_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
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
    _005fjspx_005ftagPool_005fhst_005fsetBundle_0026_005fbasename_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhst_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fhst_005fsetBundle_0026_005fbasename_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
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
      if (_jspx_meth_hst_005fsetBundle_005f0(_jspx_page_context))
        return;
      out.write("<hr></hr>\n");
      out.write("<div class=\"text-center\">\n");
      out.write("  <sub>");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</sub>\n");
      out.write("</div>\n");
      if (_jspx_meth_hst_005finclude_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_hst_005fsetBundle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  hst:setBundle
    org.hippoecm.hst.tag.SetHstBundleTag _jspx_th_hst_005fsetBundle_005f0 = (org.hippoecm.hst.tag.SetHstBundleTag) _005fjspx_005ftagPool_005fhst_005fsetBundle_0026_005fbasename_005fnobody.get(org.hippoecm.hst.tag.SetHstBundleTag.class);
    _jspx_th_hst_005fsetBundle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_hst_005fsetBundle_005f0.setParent(null);
    // /WEB-INF/jsp/amhippo/base-footer.jsp(18,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005fsetBundle_005f0.setBasename("essentials.global");
    int _jspx_eval_hst_005fsetBundle_005f0 = _jspx_th_hst_005fsetBundle_005f0.doStartTag();
    if (_jspx_th_hst_005fsetBundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005fsetBundle_0026_005fbasename_005fnobody.reuse(_jspx_th_hst_005fsetBundle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005fsetBundle_0026_005fbasename_005fnobody.reuse(_jspx_th_hst_005fsetBundle_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent(null);
    // /WEB-INF/jsp/amhippo/base-footer.jsp(21,7) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("footer.text");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
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
    // /WEB-INF/jsp/amhippo/base-footer.jsp(23,0) name = ref type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_hst_005finclude_005f0.setRef("container");
    int _jspx_eval_hst_005finclude_005f0 = _jspx_th_hst_005finclude_005f0.doStartTag();
    if (_jspx_th_hst_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhst_005finclude_0026_005fref_005fnobody.reuse(_jspx_th_hst_005finclude_005f0);
    return false;
  }
}
