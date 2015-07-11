<%@ taglib prefix="hst" uri="http://www.hippoecm.org/jsp/hst/core" %>
<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>
<hst:defineObjects />
<c:set var="channelInfo" value="${hstRequest.requestContext.resolvedMount.mount.channelInfo}"/>
<c:set var="cookieDomain" value="${channelInfo.properties.get('cookieDomain')}" />
<c:set var="siteId" value="${channelInfo.properties.get('siteId')}" />
<%--
  Created by IntelliJ IDEA.
  User: karun
  Date: 07/02/15
  Time: 06:50
  To change this template use File | Settings | File Templates.
--%>
<!-- Piwik -->
<script type="text/javascript">
  var _paq = _paq || [];
  _paq.push(["setCookieDomain", "<c:out value='${cookieDomain}'/>"]);
  _paq.push(['trackPageView']);
  _paq.push(['enableLinkTracking']);
  (function() {
    var u="//www.karun.li/piwik/";
    _paq.push(['setTrackerUrl', u+'piwik.php']);
    _paq.push(['setSiteId', <c:out value='${siteId}' />]);
    var d=document, g=d.createElement('script'), s=d.getElementsByTagName('script')[0];
    g.type='text/javascript'; g.async=true; g.defer=true; g.src=u+'piwik.js'; s.parentNode.insertBefore(g,s);
  })();
</script>
<noscript><p><img src="//www.karun.li/piwik/piwik.php?idsite=<c:out value='${siteId}' />" style="border:0;" alt="" /></p></noscript><!-- End Piwik Code -->
